package io.github.carlosthe19916.webservices;

public class CxfConfig {

    private final String url;
    private final String username;
    private final String passwod;

    public CxfConfig(Builder builder) {
        this.url = builder.url;
        this.username = builder.username;
        this.passwod = builder.passwod;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswod() {
        return passwod;
    }

    public static class Builder {
        private String url;
        private String username;
        private String passwod;

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder passwod(String passwod) {
            this.passwod = passwod;
            return this;
        }

        public CxfConfig build() {
            return new CxfConfig(this);
        }
    }
}
