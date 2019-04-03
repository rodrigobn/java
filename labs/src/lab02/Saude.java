package lab02;

public class Saude {

	private String saudeMental, saudeFisica, statusGeral, emoji;

	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa";
	}

	public String getStatusGeral() {
		String status = null;
		if (getEmoji() == null) {
			if (getSaudeFisica() == "boa" && getSaudeMental() == "boa") {
				status = "boa ";
			} else if (getSaudeFisica() == "fraca" && getSaudeMental() == "boa"
					|| getSaudeFisica() == "boa" && getSaudeMental() == "fraca") {
				status = "ok ";
			} else if (getSaudeFisica() == "fraca" && getSaudeMental() == "fraca") {
				status = "fraca ";
			}
			return status;
		} else {
			if (getSaudeFisica() == "boa" && getSaudeMental() == "boa") {
				status = "boa " + getEmoji();
			} else if (getSaudeFisica() == "fraca" && getSaudeMental() == "boa"
					|| getSaudeFisica() == "boa" && getSaudeMental() == "fraca") {
				status = "ok " + getEmoji();
			} else if (getSaudeFisica() == "fraca" && getSaudeMental() == "fraca") {
				status = "fraca " + getEmoji();
			}
			return status;
		}

	}

	public void defineSaudeMental(String situacao) {
		setSaudeMental(situacao);
		definirEmoji(null);
	}

	public void defineSaudeFisica(String situacao) {
		setSaudeFisica(situacao);
		definirEmoji(null);
	}

	public void definirEmoji(String emoji) {
		this.emoji = emoji;
	}

	public String getEmoji() {
		return emoji;
	}

	public String getSaudeMental() {
		return saudeMental;
	}

	private void setSaudeMental(String saudeMental) {
		this.saudeMental = saudeMental;
	}

	public String getSaudeFisica() {
		return saudeFisica;
	}

	private void setSaudeFisica(String saudeFisica) {
		this.saudeFisica = saudeFisica;
	}

	public void setStatusGeral(String statusGeral) {
		this.statusGeral = statusGeral;
	}

	@Override
	public String toString() {
		return "Saude [saudeMental=" + saudeMental + ", saudeFisica=" + saudeFisica + ", statusGeral=" + statusGeral
				+ "]";
	}

}
