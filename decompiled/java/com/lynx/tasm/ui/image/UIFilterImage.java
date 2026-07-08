package com.lynx.tasm.ui.image;

import X.AbstractC1320720kTO;
import X.C1312920kGo;
import X.C1315650kLD;
import X.C1315960kLi;
import X.C1322200kVm;
import X.InterfaceC1312540kGC;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.behavior.ui.UIBody;
import com.lynx.tasm.utils.ColorUtils;
import j27.s;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class UIFilterImage extends UIImage<C1315650kLD> {
    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onLayoutUpdated() {
        super.onLayoutUpdated();
        ((C1315650kLD) this.mView).markShadowDirty();
    }

    public UIFilterImage(s sVar) {
        super(sVar, null);
    }

    @Override // com.lynx.tasm.ui.image.UIImage, com.lynx.tasm.behavior.ui.LynxUI
    /* JADX INFO: renamed from: LJJIIZI, reason: merged with bridge method [inline-methods] */
    public final C1315650kLD createView(Context context) {
        this.mDraweeControllerBuilder = C1322200kVm.LIZJ();
        AbstractC1320720kTO abstractC1320720kTO = this.mDraweeControllerBuilder;
        this.mContext.getClass();
        C1315650kLD c1315650kLD = new C1315650kLD(context, abstractC1320720kTO, null, null, this);
        c1315650kLD.setImageLoaderCallback(new C1315960kLi() { // from class: X.0jwH
            @Override // X.C1315960kLi
            public final void LJ(int i, int i2) {
                Map<String, C1299120juY> map = this.LIZ.mEvents;
                if (map != null && map.containsKey("load")) {
                    C1289960jfm c1289960jfm = new C1289960jfm(this.LIZ.getSign(), "load");
                    c1289960jfm.LIZIZ(Integer.valueOf(i2), "height");
                    c1289960jfm.LIZIZ(Integer.valueOf(i), "width");
                    this.LIZ.mContext.LLIZ.LIZIZ(c1289960jfm);
                }
            }

            @Override // X.C1315960kLi
            public final void LIZLLL(LynxError lynxError, int i, int i2) {
                C1289960jfm c1289960jfm = new C1289960jfm(this.LIZ.getSign(), "error");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(lynxError.LJ());
                sbLIZ.append(": ");
                sbLIZ.append(lynxError.LIZLLL());
                c1289960jfm.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "errMsg");
                c1289960jfm.LIZIZ(Integer.valueOf(i), "lynx_categorized_code");
                c1289960jfm.LIZIZ(Integer.valueOf(i2), "error_code");
                this.LIZ.mContext.LLIZ.LIZIZ(c1289960jfm);
            }
        });
        return c1315650kLD;
    }

    @InterfaceC1312540kGC(name = "drop-shadow")
    public void setDropShadow(String str) {
        if (str == null) {
            ((C1315650kLD) this.mView).setShadowOffsetX(0);
            ((C1315650kLD) this.mView).setShadowOffsetY(0);
            ((C1315650kLD) this.mView).setShadowColor(0);
            ((C1315650kLD) this.mView).setShadowRadius(0);
            return;
        }
        String[] strArrSplit = str.split(" +");
        try {
            if (strArrSplit.length == 4) {
                UIBody uIBody = this.mContext.LLJILJILJ;
                ((C1315650kLD) this.mView).setShadowOffsetX(Math.round(C1312920kGo.LIZIZ(strArrSplit[0], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LLJJJ)));
                ((C1315650kLD) this.mView).setShadowOffsetY(Math.round(C1312920kGo.LIZIZ(strArrSplit[1], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LLJJJ)));
                ((C1315650kLD) this.mView).setShadowRadius(Math.round(C1312920kGo.LIZIZ(strArrSplit[2], uIBody.mFontSize, this.mFontSize, uIBody.getWidth(), uIBody.getHeight(), 0.0f, this.mContext.LLJJJ)));
                ((C1315650kLD) this.mView).setShadowColor(ColorUtils.LIZIZ(strArrSplit[3]));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LynxLog.w("UIShadowImage", "Parse error for drop-shadow!");
    }

    public UIFilterImage(s sVar, Object obj) {
        super(sVar, obj);
    }
}
