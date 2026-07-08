package defpackage;

import X.AbstractC1313520kHm;
import X.AbstractC1317090kNX;
import X.C1290850jhD;
import X.C1299030juP;
import X.C1312390kFx;
import X.C1313970kIV;
import X.C1315460kKu;
import X.C1317770kOd;
import X.C1697810uHb;
import android.content.Context;
import android.view.View;
import com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI;
import com.bytedance.sdui.serializedData.common.operations.GlyphRun;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public final class e8 {

    public final class a extends C1313970kIV {
        public a() {
            super("text");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(final AbstractC1317090kNX abstractC1317090kNX) {
            return new AbstractC1313520kHm<C1317770kOd>(abstractC1317090kNX) { // from class: X.0kKx
                @Override // X.AbstractC1313520kHm, com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
                public final int LJII() {
                    List<GlyphRun> glyphRuns = ((C1317770kOd) this.LLLLLILLIL).getGlyphRuns();
                    return (glyphRuns == null || glyphRuns.size() <= 0) ? SDUIBaseUI.LLLLLIL : SDUIBaseUI.LLLLL;
                }

                @Override // com.bytedance.sdui.render.tasm.behavior.ui.SDUIBaseUI
                public final void LJLIIIL(Object obj) {
                    C1317770kOd c1317770kOd = (C1317770kOd) this.LLLLLILLIL;
                    c1317770kOd.LLILZ = this.LLJJ;
                    c1317770kOd.LLILZIL = (List) obj;
                }

                @Override // X.AbstractC1313520kHm
                public final View LJLJJL(Context context) {
                    return new C1317770kOd((AbstractC1317090kNX) context);
                }
            };
        }
    }

    public final class b extends C1313970kIV {
        public b() {
            super("list");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new com.bytedance.sdui.components.list.a(abstractC1317090kNX);
        }
    }

    public final class c extends C1313970kIV {
        public c() {
            super("header");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1299030juP(abstractC1317090kNX);
        }
    }

    public final class d extends C1313970kIV {
        public d() {
            super("footer");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1299030juP(abstractC1317090kNX);
        }
    }

    public final class e extends C1313970kIV {
        public e() {
            super("page");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1299030juP(abstractC1317090kNX);
        }
    }

    public final class f extends C1313970kIV {
        public f() {
            super("image");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1315460kKu(abstractC1317090kNX);
        }
    }

    public final class g extends C1313970kIV {
        public g() {
            super("svg");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1312390kFx(abstractC1317090kNX);
        }
    }

    public final class h extends C1313970kIV {
        public h() {
            super("x-lottie");
        }

        @Override // X.C1313970kIV
        public final AbstractC1313520kHm<?> LIZIZ(AbstractC1317090kNX abstractC1317090kNX) {
            return new C1290850jhD(abstractC1317090kNX);
        }
    }

    public static List LIZ() {
        return C1697810uHb.LJIIJJI(new a(), new b(), new c(), new d(), new e(), new f(), new g(), new h());
    }
}
