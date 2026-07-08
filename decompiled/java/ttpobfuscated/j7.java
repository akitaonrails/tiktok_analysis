package ttpobfuscated;

import X.AbstractC23140094w;
import X.C09DV;
import X.C1C7U;
import X.InterfaceC1364105Vn;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import java.util.Date;
import java.util.UUID;
import ttpobfuscated.zb;

/* JADX INFO: loaded from: classes24.dex */
public final class j7 implements m<i7, h7> {
    public final j4 a;
    public final tg b;
    public final u1 c;
    public final u1 d;

    public final class a implements fg<b2> {
        public final Date m;
        public final UUID k = UUID.randomUUID();
        public final String l = "heartbeat";
        public final zb n = new zb.f(604800000);
        public final b2 o = new C0061a();

        @Override // ttpobfuscated.fg
        public String f() {
            return "android";
        }

        /* JADX INFO: renamed from: ttpobfuscated.j7$a$a, reason: collision with other inner class name */
        public final class C0061a implements b2 {
            @Override // ttpobfuscated.b2
            public String b() {
                return "";
            }

            @Override // ttpobfuscated.b2
            public String a() {
                return b();
            }
        }

        @Override // ttpobfuscated.fg
        public String b() {
            return e().a();
        }

        @Override // ttpobfuscated.fg
        public String g() {
            return e().b();
        }

        @Override // ttpobfuscated.fg
        public UUID a() {
            return this.k;
        }

        @Override // ttpobfuscated.fg
        public zb c() {
            return this.n;
        }

        @Override // ttpobfuscated.fg
        public String d() {
            return this.l;
        }

        @Override // ttpobfuscated.fg
        public b2 e() {
            return this.o;
        }

        @Override // ttpobfuscated.fg
        public Date h() {
            return this.m;
        }

        public a(Date date) {
            this.m = date;
        }
    }

    @C09DV(c = "ttp.orbu.sdk.app.domain.usecase.activation.HeartbeatUseCase", f = "HeartbeatUseCase.kt", l = {41, 46, DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE, 97, 101}, m = "invoke")
    public final class b extends AbstractC23140094w {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public Object h;
        public /* synthetic */ Object i;
        public int k;

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("j7@11ec.a$2");
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            Object objA = j7.this.a(this);
            C1C7U.LIZIZ("j7@11ec.a$2");
            return objA;
        }

        public b(InterfaceC1364105Vn<? super b> interfaceC1364105Vn) {
            super(interfaceC1364105Vn);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:70:0x01b9, B:71:0x01bc, B:73:0x01c2, B:76:0x01dc, B:68:0x01b1, B:69:0x01b4, B:62:0x0161, B:63:0x0164, B:65:0x0168, B:78:0x01e4, B:33:0x00be, B:34:0x00c1, B:35:0x00d6, B:37:0x00dc, B:39:0x00e6, B:41:0x00ec, B:44:0x00f6, B:50:0x0108, B:52:0x0110, B:53:0x0114, B:55:0x011c, B:56:0x0120, B:58:0x0128, B:59:0x012c, B:27:0x00a4, B:28:0x00a7, B:30:0x00af, B:80:0x01ec, B:23:0x0089), top: B:105:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0168 A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:70:0x01b9, B:71:0x01bc, B:73:0x01c2, B:76:0x01dc, B:68:0x01b1, B:69:0x01b4, B:62:0x0161, B:63:0x0164, B:65:0x0168, B:78:0x01e4, B:33:0x00be, B:34:0x00c1, B:35:0x00d6, B:37:0x00dc, B:39:0x00e6, B:41:0x00ec, B:44:0x00f6, B:50:0x0108, B:52:0x0110, B:53:0x0114, B:55:0x011c, B:56:0x0120, B:58:0x0128, B:59:0x012c, B:27:0x00a4, B:28:0x00a7, B:30:0x00af, B:80:0x01ec, B:23:0x0089), top: B:105:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c2 A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:70:0x01b9, B:71:0x01bc, B:73:0x01c2, B:76:0x01dc, B:68:0x01b1, B:69:0x01b4, B:62:0x0161, B:63:0x0164, B:65:0x0168, B:78:0x01e4, B:33:0x00be, B:34:0x00c1, B:35:0x00d6, B:37:0x00dc, B:39:0x00e6, B:41:0x00ec, B:44:0x00f6, B:50:0x0108, B:52:0x0110, B:53:0x0114, B:55:0x011c, B:56:0x0120, B:58:0x0128, B:59:0x012c, B:27:0x00a4, B:28:0x00a7, B:30:0x00af, B:80:0x01ec, B:23:0x0089), top: B:105:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e4 A[Catch: all -> 0x01f4, TryCatch #0 {all -> 0x01f4, blocks: (B:70:0x01b9, B:71:0x01bc, B:73:0x01c2, B:76:0x01dc, B:68:0x01b1, B:69:0x01b4, B:62:0x0161, B:63:0x0164, B:65:0x0168, B:78:0x01e4, B:33:0x00be, B:34:0x00c1, B:35:0x00d6, B:37:0x00dc, B:39:0x00e6, B:41:0x00ec, B:44:0x00f6, B:50:0x0108, B:52:0x0110, B:53:0x0114, B:55:0x011c, B:56:0x0120, B:58:0x0128, B:59:0x012c, B:27:0x00a4, B:28:0x00a7, B:30:0x00af, B:80:0x01ec, B:23:0x0089), top: B:105:0x0024 }] */
    @Override // ttpobfuscated.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(X.InterfaceC1364105Vn<? super ttp.orbu.sdk.app.domain.usecase.UseCaseResult<ttpobfuscated.i7, ttpobfuscated.h7>> r23) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ttpobfuscated.j7.a(X.05Vn):java.lang.Object");
    }

    public final a a(Date date) {
        return new a(date);
    }

    public j7(j4 j4Var, tg tgVar, u1 u1Var, u1 u1Var2) {
        this.a = j4Var;
        this.b = tgVar;
        this.c = u1Var;
        this.d = u1Var2;
    }
}
