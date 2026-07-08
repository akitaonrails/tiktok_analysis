package go5;

import X.AbstractC808800Vo6;
import X.C1724370uyR;
import X.C2188811AlT;
import X.InterfaceC1738830vLl;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONObject;
import yo5.a$a;

/* JADX INFO: loaded from: classes27.dex */
public class d {
    public final Application LIZ;
    public String LIZIZ;
    public go5.a LIZJ;
    public String LIZLLL;
    public AbstractC808800Vo6 LJ;
    public Cert LJFF;
    public Cert LJI;
    public Cert LJII;
    public c LJIIIIZZ;
    public b LJIIIZ;
    public InterfaceC1738830vLl LJIIJ;
    public a$a LJIIJJI;

    public static class a {
        public final Application LIZ;
        public String LIZIZ;
        public go5.a LIZJ;
        public String LIZLLL;
        public AbstractC808800Vo6 LJ;
        public Cert LJFF;
        public Cert LJI;
        public Cert LJII;
        public c LJIIIIZZ;
        public b LJIIIZ;
        public InterfaceC1738830vLl LJIIJ;
        public a$a LJIIJJI;

        public final d LIZ() {
            if (TextUtils.isEmpty(this.LIZLLL)) {
                this.LIZLLL = "en";
            }
            if (this.LIZJ == null) {
                this.LIZJ = new go5.a() { // from class: X.0uyN
                    @Override // go5.a
                    public final void onEventV3(String str, JSONObject jSONObject) {
                    }
                };
            }
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new b() { // from class: X.0uyO
                };
            }
            if (this.LJ == null) {
                this.LJ = AbstractC808800Vo6.LIZ;
            }
            return new d(this);
        }

        public a(Application application) {
            this.LIZ = application;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{mContext=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mHost='");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public d(a aVar) {
        this.LIZ = aVar.LIZ;
        String str = aVar.LIZIZ;
        this.LIZIZ = str;
        this.LIZJ = aVar.LIZJ;
        this.LIZLLL = aVar.LIZLLL;
        this.LJ = aVar.LJ;
        this.LJFF = aVar.LJFF;
        this.LJI = aVar.LJI;
        this.LJII = aVar.LJII;
        this.LJIIIIZZ = aVar.LJIIIIZZ;
        this.LJIIIZ = aVar.LJIIIZ;
        this.LJIIJ = aVar.LJIIJ;
        this.LJIIJJI = aVar.LJIIJJI;
        if (!TextUtils.isEmpty(str)) {
            C1724370uyR.LIZ = this.LIZIZ;
        }
    }

    public final void LIZ(d dVar) {
        if (TextUtils.isEmpty(this.LIZIZ) && !TextUtils.isEmpty(dVar.LIZIZ)) {
            this.LIZIZ = dVar.LIZIZ;
        }
        go5.a aVar = dVar.LIZJ;
        if (aVar != null) {
            this.LIZJ = aVar;
        }
        if (!TextUtils.isEmpty(dVar.LIZLLL)) {
            this.LIZLLL = dVar.LIZLLL;
        }
        AbstractC808800Vo6 abstractC808800Vo6 = dVar.LJ;
        if (abstractC808800Vo6 != null) {
            this.LJ = abstractC808800Vo6;
        }
        Cert cert = dVar.LJFF;
        if (cert != null) {
            this.LJFF = cert;
        }
        Cert cert2 = dVar.LJI;
        if (cert2 != null) {
            this.LJI = cert2;
        }
        Cert cert3 = dVar.LJII;
        if (cert3 != null) {
            this.LJII = cert3;
        }
        c cVar = dVar.LJIIIIZZ;
        if (cVar != null) {
            this.LJIIIIZZ = cVar;
        }
        b bVar = dVar.LJIIIZ;
        if (bVar != null) {
            this.LJIIIZ = bVar;
        }
        InterfaceC1738830vLl interfaceC1738830vLl = dVar.LJIIJ;
        if (interfaceC1738830vLl != null) {
            this.LJIIJ = interfaceC1738830vLl;
        }
        a$a a_a = dVar.LJIIJJI;
        if (a_a != null) {
            this.LJIIJJI = a_a;
        }
    }
}
