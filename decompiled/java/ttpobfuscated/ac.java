package ttpobfuscated;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import ttp.orbu.sdk.configuration.model.ServerAPIType;
import ttp.orbu.sdk.configuration.model.ServerConfig;
import ttpobfuscated.l5.h;

/* JADX INFO: loaded from: classes24.dex */
public final class ac implements o9 {
    public final l5 a;
    public final y3 b;
    public final u8 c;

    public final pb A() {
        return new w8();
    }

    public final qb B() {
        return new rb();
    }

    public final id C() {
        Context contextJ = this.a.j();
        this.a.getClass();
        nc ncVar = new nc();
        jd jdVarH = this.a.h();
        this.b.getClass();
        return new pc(ncVar, jdVarH, contextJ, new y5());
    }

    public final sd D() {
        l5 l5Var = this.a;
        l5Var.getClass();
        return new z2(af.a.a(new k3(l5Var.j()).a).a());
    }

    public final ce E() {
        this.b.getClass();
        return new de(new be());
    }

    public final tg F() {
        l5 l5Var = this.a;
        l5Var.getClass();
        return new a3(af.a.a(new k3(l5Var.j()).a).c());
    }

    public final zg G() {
        return Build.VERSION.SDK_INT >= 26 ? new c5(false, j(), true, 4, 100) : new w4(false, j(), true, 4, 100);
    }

    public final c a() {
        return new d(this.b.a);
    }

    public final d1 b() {
        return new w(this.a.v());
    }

    public final b0 c() {
        return new q8(this.a.e());
    }

    public final c0 d() {
        return new d0();
    }

    public final j0 e() {
        return new z6(this.a.u());
    }

    public final i9 f() {
        Context contextJ = this.a.j();
        this.b.getClass();
        y5 y5Var = new y5();
        this.a.getClass();
        return new jc(contextJ, y5Var, new nc(), this.a.f(), Integer.valueOf(LSPassThroughRecordSizeConfig.DEFAULT), a(ServerAPIType.LOGGING).apiVersionPathParameter, bg.a);
    }

    public final q0 g() {
        l5 l5Var = this.a;
        l5Var.getClass();
        k3 k3Var = new k3(l5Var.j());
        SharedPreferences sharedPreferencesL = this.a.l();
        SharedPreferences sharedPreferencesN = this.a.n();
        this.b.getClass();
        y5 y5Var = new y5();
        this.b.getClass();
        return new r0(k3Var, sharedPreferencesL, sharedPreferencesN, y5Var, new va());
    }

    public final sg h() {
        return new kg(this.a.v());
    }

    public final i2 i() {
        this.a.getClass();
        nc ncVar = new nc();
        jd jdVarH = this.a.h();
        Context contextJ = this.a.j();
        l5 l5Var = this.a;
        l5Var.getClass();
        c3 c3VarC = af.a.a(new k3(l5Var.j()).a).c();
        this.b.getClass();
        return new hc(ncVar, jdVarH, contextJ, c3VarC, new y5());
    }

    public final u1 j() {
        this.b.getClass();
        return new n2(new y5());
    }

    public final u1 k() {
        this.b.getClass();
        return new p2(new va());
    }

    public final j4 l() {
        l5 l5Var = this.a;
        l5Var.getClass();
        k3 k3Var = new k3(l5Var.j());
        af afVar = af.a;
        x2 x2VarB = afVar.a(k3Var.a).b();
        u2 u2VarA = afVar.a(k3Var.a).a();
        this.b.getClass();
        return new s2(x2VarB, u2VarA, new y5(), this.c.a(), this.a.u());
    }

    public final s4 m() {
        this.b.getClass();
        return new x5(new y5());
    }

    public final e5 n() {
        return new f5();
    }

    public final h5 o() {
        return new me(this.a.n());
    }

    public final n5 p() {
        return Build.VERSION.SDK_INT >= 26 ? new a5() : new u4();
    }

    public final r5 q() {
        return new e8();
    }

    public final t1 r() {
        return new f8();
    }

    public final b6 s() {
        this.b.getClass();
        y5 y5Var = new y5();
        this.a.getClass();
        return new d6(y5Var, new nc(), this.a.a(), x3.b(this.a.j()), x3.a(this.a.j()));
    }

    public final c6 t() {
        j1 j1VarC = this.a.c();
        String packageName = this.a.j().getPackageName();
        this.a.getClass();
        return new h6(j1VarC, packageName, new nc());
    }

    public final c6 u() {
        j1 j1VarC = this.a.c();
        String packageName = this.a.j().getPackageName();
        this.a.getClass();
        return new i6(j1VarC, packageName, new nc());
    }

    public final y7 v() {
        return new z7();
    }

    public final p8 w() {
        return new t3();
    }

    public final d1 x() {
        SharedPreferences sharedPreferencesL = this.a.l();
        l5 l5Var = this.a;
        l5Var.getClass();
        return new ke(sharedPreferencesL, l5Var.new h());
    }

    public final i9 y() {
        Context contextJ = this.a.j();
        this.b.getClass();
        y5 y5Var = new y5();
        this.a.getClass();
        return new jc(contextJ, y5Var, new nc(), this.a.f(), null, null, bg.a);
    }

    public final t1 z() {
        return new h8();
    }

    public final ServerConfig a(ServerAPIType serverAPIType) throws ud {
        ServerConfig next;
        new y5();
        Iterator<ServerConfig> it2 = y5.b.getServerConfigs().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.name == serverAPIType) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ServerConfig serverConfig = next;
        if (serverConfig != null) {
            return serverConfig;
        }
        throw new ud("Impossible to get " + serverAPIType.name() + " server config");
    }

    public ac(l5 l5Var, y3 y3Var, u8 u8Var) {
        this.a = l5Var;
        this.b = y3Var;
        this.c = u8Var;
    }
}
