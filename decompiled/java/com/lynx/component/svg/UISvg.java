package com.lynx.component.svg;

import X.C1289620jfE;
import X.C1289960jfm;
import X.C1290350jgP;
import X.C1299120juY;
import X.C1301610jyZ;
import X.C1DX7;
import X.C2257191DWj;
import X.C417500GYq;
import X.EnumC1311070kDp;
import X.InterfaceC1290410jgV;
import X.InterfaceC1312540kGC;
import Y.ARunnableS120S0100000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.lynx.base.log.LynxLog;
import com.lynx.component.svg.UISvg;
import com.lynx.serval.svg.SVGRender;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.behavior.ui.LynxUI;
import j27.s;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class UISvg extends LynxUI<C417500GYq> {
    public String LL;
    public volatile String LLILLJJLI;
    public final C1290350jgP LLILLL;
    public volatile C1DX7 LLILZ;
    public volatile C2257191DWj LLILZIL;
    public boolean LLILZLL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public volatile SVGRender LLJ;
    public volatile boolean LLJI;

    public UISvg() {
        throw null;
    }

    public final void LJJIIZI() {
        if (this.LLILZLL) {
            LJJIJIIJIL(this.LLILLJJLI, false);
        } else if (LynxEnv.inst().enableSvgAsync()) {
            C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 43));
        } else {
            C1289620jfE.LIZJ(new ARunnableS120S0100000_20(this, 40));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final EnumC1311070kDp getMeaningfulContentStatus() {
        return this.LLILZIL != null ? EnumC1311070kDp.PRESENTED : EnumC1311070kDp.PENDING;
    }

    public final void LJJIJIIJI() {
        if (LynxEnv.inst().enableSvgAsync()) {
            C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 41));
        } else {
            this.LLILLL.LIZ();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void destroy() {
        super.destroy();
        this.LLJI = true;
        this.LLJ = null;
        LJJIJIIJI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onDetach() {
        super.onDetach();
        LJJIJIIJI();
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.LLILZ.LIZ(getWidth(), getHeight());
        if (this.LLILZLL) {
            this.LLIZ = true;
        } else if (this.LLILZIL != null) {
            LJJIIZI();
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onNodeReady() {
        super.onNodeReady();
        if (this.LLILZLL && this.LLIZ) {
            this.LLIZ = false;
            if (TextUtils.isEmpty(this.LLILLJJLI)) {
                ((C417500GYq) this.mView).setImageDrawable(null);
            } else {
                LJJIJIIJIL(this.LLILLJJLI, true);
            }
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        if (!this.LLIZLLLIL) {
            if (this.LLILZLL) {
                return;
            }
            if (TextUtils.isEmpty(this.LLILLJJLI) && TextUtils.isEmpty(this.LL)) {
                ((C417500GYq) this.mView).setImageDrawable(null);
                return;
            } else {
                if (this.LLIZ) {
                    this.LLIZ = false;
                    C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 42));
                    return;
                }
                return;
            }
        }
        this.LLIZLLLIL = false;
        if (!this.LL.startsWith("data:image/svg+xml;base64")) {
            this.LLILLL.LIZJ(this.LL, new InterfaceC1290410jgV() { // from class: X.0kFy
                @Override // X.InterfaceC1290380jgS
                public final void onStart() {
                }

                @Override // X.InterfaceC1290380jgS
                public final void onSuccess() {
                }

                @Override // X.InterfaceC1290380jgS
                public final void onError(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestSrc error! the src is ");
                    sbLIZ.append(this.LIZ.LL);
                    sbLIZ.append(" error message is");
                    sbLIZ.append(str);
                    LynxLog.e("lynx_UISvg", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC1290410jgV
                public final void LIZ(String str, C2257191DWj c2257191DWj) {
                    UISvg uISvg = this.LIZ;
                    if (uISvg.LLILZLL) {
                        uISvg.LLILLJJLI = str;
                        this.LIZ.LJJIJIIJIL(str, true);
                    } else if (LynxEnv.inst().enableSvgAsync()) {
                        C1301610jyZ.LJ().execute(new ARunnableS89S0200000_20(uISvg, c2257191DWj, 132));
                    } else {
                        C1289620jfE.LIZJ(new ARunnableS89S0200000_20(uISvg, c2257191DWj, 133));
                    }
                }
            });
            return;
        }
        String str = new String(Base64.decode(this.LL.substring(26).getBytes(Charset.defaultCharset()), 0), Charset.defaultCharset());
        if (TextUtils.isEmpty(str)) {
            ((C417500GYq) this.mView).setImageDrawable(null);
            this.LLILLJJLI = null;
        } else {
            if (str.equals(this.LLILLJJLI)) {
                return;
            }
            this.LLILLJJLI = str;
            if (this.LLILZLL) {
                LJJIJIIJIL(this.LLILLJJLI, true);
            } else {
                C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 210));
            }
        }
    }

    public final void LJJIJ(C2257191DWj c2257191DWj) {
        float height;
        float width;
        Map<String, C1299120juY> map = this.mEvents;
        if (map != null && map.containsKey("load")) {
            C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "load");
            if (c2257191DWj == null) {
                height = getHeight();
            } else if (c2257191DWj.LIZ != null) {
                height = c2257191DWj.LIZ().LIZLLL;
            } else {
                throw new IllegalArgumentException("SVG document is empty");
            }
            c1289960jfm.LIZIZ(Float.valueOf(height), "height");
            if (c2257191DWj == null) {
                width = getWidth();
            } else if (c2257191DWj.LIZ != null) {
                width = c2257191DWj.LIZ().LIZJ;
            } else {
                throw new IllegalArgumentException("SVG document is empty");
            }
            c1289960jfm.LIZIZ(Float.valueOf(width), "width");
            this.mContext.LLIZ.LIZIZ(c1289960jfm);
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxUI
    public final View createView(Context context) {
        return new C417500GYq(context);
    }

    @InterfaceC1312540kGC(name = "content")
    public void setContent(String str) {
        if (TextUtils.isEmpty(str)) {
            ((C417500GYq) this.mView).setImageDrawable(null);
            this.LLILLJJLI = null;
        } else {
            if (str.equals(this.LLILLJJLI)) {
                return;
            }
            this.LLILLJJLI = str;
            this.LLIZ = true;
        }
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "enable-serval-svg")
    public void setEnableServalSvg(boolean z) {
        this.LLILZLL = z;
        if (z && this.LLJ == null) {
            C1301610jyZ.LJ().execute(new ARunnableS120S0100000_20(this, 48));
        }
    }

    @InterfaceC1312540kGC(name = "src")
    public void setSource(String str) {
        if (TextUtils.isEmpty(str)) {
            this.LL = null;
            ((C417500GYq) this.mView).setImageDrawable(null);
        } else {
            if (str.equals(this.LL)) {
                return;
            }
            this.LL = str;
            this.LLIZLLLIL = true;
        }
    }

    public UISvg(s sVar, Object obj) {
        super(sVar, obj);
        this.LLILZ = new C1DX7(sVar.LLJILJILJ.mFontSize, this.mFontSize);
        this.LLILLL = new C1290350jgP(sVar, this);
    }

    public final void LJJIJIIJIL(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            ((C417500GYq) this.mView).setImageDrawable(null);
        } else {
            C1301610jyZ.LJ().execute(new ARunnableS5S1110000_20(this, str, z, 2));
        }
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void updateLayout(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Rect rect) {
        super.updateLayout(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, rect);
        this.LLILZ.LIZ(getWidth(), getHeight());
        if (this.LLILZIL != null && !this.LLILZLL) {
            LJJIIZI();
        }
    }
}
