package com.orbu.core.adapter;

/* JADX INFO: loaded from: classes14.dex */
public final class TTKResponse {
    public boolean block;
    public final String description;
    public final int statusCode;

    public static final class Builder {
        public boolean block;
        public int statusCode = -1;
        public String description = "";

        public final TTKResponse build() {
            return new TTKResponse(this);
        }

        public final boolean getBlock$ttk_orbuculum_service_adapter_release() {
            return this.block;
        }

        public final String getDescription$ttk_orbuculum_service_adapter_release() {
            return this.description;
        }

        public final int getStatusCode$ttk_orbuculum_service_adapter_release() {
            return this.statusCode;
        }

        public final Builder block(boolean z) {
            this.block = z;
            return this;
        }

        public final Builder description(String str) {
            this.description = str;
            return this;
        }

        public final void setBlock$ttk_orbuculum_service_adapter_release(boolean z) {
            this.block = z;
        }

        public final void setDescription$ttk_orbuculum_service_adapter_release(String str) {
            this.description = str;
        }

        public final void setStatusCode$ttk_orbuculum_service_adapter_release(int i) {
            this.statusCode = i;
        }

        public final Builder statusCode(int i) {
            this.statusCode = i;
            return this;
        }
    }

    public final boolean getBlock() {
        return this.block;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public TTKResponse(Builder builder) {
        this.statusCode = builder.getStatusCode$ttk_orbuculum_service_adapter_release();
        this.description = builder.getDescription$ttk_orbuculum_service_adapter_release();
        this.block = builder.getBlock$ttk_orbuculum_service_adapter_release();
    }

    public final void setBlock(boolean z) {
        this.block = z;
    }
}
