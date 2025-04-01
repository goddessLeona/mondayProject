public class Certificate {

    private String CertificateText;

    public Certificate(String certificateText) {
        CertificateText = certificateText;
    }

    public String getCertificateText() {
        return CertificateText;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "CertificateText='" + CertificateText + '\'' +
                '}';
    }
}
