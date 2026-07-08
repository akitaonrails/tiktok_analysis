package ttp.orbu.sdk.app.domain.usecase;

/* JADX INFO: loaded from: classes24.dex */
public abstract class UseCaseResult<DATA, ERROR> {

    public static final class a<DATA, ERROR> extends UseCaseResult<DATA, ERROR> {
        public final ERROR a;

        public final ERROR a() {
            return this.a;
        }

        public a(ERROR error) {
            this.a = error;
        }
    }

    public static final class b<DATA, ERROR> extends UseCaseResult<DATA, ERROR> {
        public final DATA a;

        public final DATA a() {
            return this.a;
        }

        public b(DATA data) {
            this.a = data;
        }
    }
}
