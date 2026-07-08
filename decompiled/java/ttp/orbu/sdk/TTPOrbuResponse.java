package ttp.orbu.sdk;

import ttpobfuscated.lf;

/* JADX INFO: loaded from: classes24.dex */
public final class TTPOrbuResponse {
    public static final a Code = new a();
    public final int a;
    public final String b;
    public long c;

    public static final class Builder {
        public int a = -1;
        public String b = "";
        public ITTPOrbuRequest<? extends ITTPOrbuRequestPayload> request;

        public final TTPOrbuResponse build() {
            return new TTPOrbuResponse(this);
        }

        public final ITTPOrbuRequest<ITTPOrbuRequestPayload> getRequest() {
            ITTPOrbuRequest iTTPOrbuRequest = this.request;
            if (iTTPOrbuRequest != null) {
                return iTTPOrbuRequest;
            }
            return null;
        }

        public final String getDescription$ttp_productionRelease() {
            return this.b;
        }

        public final int getStatusCode$ttp_productionRelease() {
            return this.a;
        }

        public final Builder description(String str) {
            this.b = str;
            return this;
        }

        public final Builder request(ITTPOrbuRequest<? extends ITTPOrbuRequestPayload> iTTPOrbuRequest) {
            setRequest(iTTPOrbuRequest);
            return this;
        }

        public final void setDescription$ttp_productionRelease(String str) {
            this.b = str;
        }

        public final void setRequest(ITTPOrbuRequest<? extends ITTPOrbuRequestPayload> iTTPOrbuRequest) {
            this.request = iTTPOrbuRequest;
        }

        public final void setStatusCode$ttp_productionRelease(int i) {
            this.a = i;
        }

        public final Builder statusCode(int i) {
            this.a = i;
            return this;
        }
    }

    public static final class a {
    }

    public static final class b {
        public static final b a = new b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TTPOrbuResponse(statusCode=");
        sb.append(this.a);
        sb.append(", description='");
        return lf.a(sb, this.b, "')");
    }

    public final String getDescription() {
        return this.b;
    }

    public final int getStatusCode() {
        return this.a;
    }

    public final long getTimeSpent() {
        return this.c;
    }

    public TTPOrbuResponse(Builder builder) {
        this.a = builder.getStatusCode$ttp_productionRelease();
        this.b = builder.getDescription$ttp_productionRelease();
    }

    public final void setTimeSpent(long j) {
        this.c = j;
    }
}
