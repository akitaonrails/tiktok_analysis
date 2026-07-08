package com.ss.android.ugc.aweme.tako.multipletemplate.gallery;

import X.C01GW;
import X.C0PEM;
import X.C1163730gOB;
import X.C1389890mGx;
import X.C1852930yJn;
import X.C1852950yJp;
import X.C1853010yJv;
import X.C1853060yK0;
import X.C1862330yYx;
import X.C19EG;
import X.C2097608Jq;
import X.C23250099c;
import X.C452501pT;
import X.C540120LGg;
import X.EnumC1154810g9n;
import X.EnumC1853160yKA;
import X.InterfaceC0148002o;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS13S0410000_27;
import kotlin.jvm.internal.AwS236S0300000_27;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoPhotoChooseViewModel extends AssemViewModel<C1853060yK0> {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public boolean LL;
    public int LLILLJJLI;
    public boolean LLILZIL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public int LLJIJIL;
    public C1853010yJv LLJILJIL;
    public int LLILLL = -1;
    public int LLILZ = -1;
    public final HashMap<String, C1163730gOB> LLILZLL = new HashMap<>();

    public final void zQ2() {
        String enterFrom;
        String enterMethod;
        String str;
        String str2;
        String str3;
        String pageSource;
        String modeSource;
        Map<String, String> commonMobParams;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1853010yJv c1853010yJv = this.LLJILJIL;
        String str4 = "";
        if (c1853010yJv == null || (enterFrom = c1853010yJv.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1853010yJv c1853010yJv2 = this.LLJILJIL;
        if (c1853010yJv2 == null || (enterMethod = c1853010yJv2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1853010yJv c1853010yJv3 = this.LLJILJIL;
        if (c1853010yJv3 == null || (commonMobParams3 = c1853010yJv3.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
            str = "";
        }
        C1853010yJv c1853010yJv4 = this.LLJILJIL;
        if (c1853010yJv4 == null || (commonMobParams2 = c1853010yJv4.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
            str2 = "";
        }
        C1853010yJv c1853010yJv5 = this.LLJILJIL;
        if (c1853010yJv5 == null || (commonMobParams = c1853010yJv5.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
            str3 = "";
        }
        C1853010yJv c1853010yJv6 = this.LLJILJIL;
        if (c1853010yJv6 == null || (pageSource = c1853010yJv6.getPageSource()) == null) {
            pageSource = "";
        }
        C1853010yJv c1853010yJv7 = this.LLJILJIL;
        String mode = c1853010yJv7 != null ? c1853010yJv7.getMode() : null;
        C1853010yJv c1853010yJv8 = this.LLJILJIL;
        if (c1853010yJv8 != null && (modeSource = c1853010yJv8.getModeSource()) != null) {
            str4 = modeSource;
        }
        C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "slide", "", null, mode, str4, null, null, null, vQ2(false), 47360);
    }

    public TakoPhotoChooseViewModel() {
        new BPEAHandler(Looper.getMainLooper());
        this.LLIZ = true;
        this.LLJ = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(186));
        this.LLJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(185));
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1853060yK0(C540120LGg.LIZLLL() ? EnumC1853160yKA.FULL_GRANTED : C540120LGg.LJ() ? EnumC1853160yKA.PARTIAL_GRANTED : EnumC1853160yKA.DENIED, 64511);
    }

    public final void BQ2(EnumC1853160yKA enumC1853160yKA) {
        setState(new AwS606S0100000_27(enumC1853160yKA, 257));
    }

    public final Map<String, String> vQ2(boolean z) {
        String templateType;
        String groupId;
        String str;
        String str2;
        String str3;
        String strIsCameraShow;
        String strIsCover;
        C1853010yJv c1853010yJv = this.LLJILJIL;
        Map<String, String> commonMobParams = null;
        if (c1853010yJv != null) {
            commonMobParams = c1853010yJv.getCommonMobParams();
        }
        Pair[] pairArr = new Pair[5];
        C1853010yJv c1853010yJv2 = this.LLJILJIL;
        String str4 = "";
        if (c1853010yJv2 == null || (templateType = c1853010yJv2.getTemplateType()) == null) {
            templateType = "";
        }
        pairArr[0] = new Pair("template_type", templateType);
        C1853010yJv c1853010yJv3 = this.LLJILJIL;
        if (c1853010yJv3 == null || (groupId = c1853010yJv3.getGroupId()) == null) {
            groupId = "";
        }
        pairArr[1] = new Pair("group_id", groupId);
        if (commonMobParams == null || (str = commonMobParams.get("search_id")) == null) {
            str = "";
        }
        pairArr[2] = new Pair("search_id", str);
        if (commonMobParams == null || (str2 = commonMobParams.get("screen_type")) == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("screen_type", str2);
        if (commonMobParams == null || (str3 = commonMobParams.get("push_id")) == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("push_id", str3);
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (z) {
            C1853010yJv c1853010yJv4 = this.LLJILJIL;
            if (c1853010yJv4 == null || (strIsCameraShow = c1853010yJv4.isCameraShow()) == null) {
                strIsCameraShow = "";
            }
            mapLJIIJ.put("is_camera_show", strIsCameraShow);
            C1853010yJv c1853010yJv5 = this.LLJILJIL;
            if (c1853010yJv5 != null && (strIsCover = c1853010yJv5.isCover()) != null) {
                str4 = strIsCover;
            }
            mapLJIIJ.put("is_cover", str4);
        }
        return mapLJIIJ;
    }

    public final void wQ2(Context context) {
        C1852950yJp.LIZ.getClass();
        C1852950yJp.LIZIZ.LIZJ = System.currentTimeMillis();
        C23250099c.LIZLLL(getAssemVMScope(), C0PEM.LIZJ, null, new C1852930yJn(this, context, null), 2);
    }

    public final void AQ2(TikTokMediaModel tikTokMediaModel, boolean z) {
        String enterFrom;
        String enterMethod;
        String str;
        String str2;
        String str3;
        String pageSource;
        String modeSource;
        Map<String, String> commonMobParams;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        if (!z) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            C1853010yJv c1853010yJv = this.LLJILJIL;
            String str4 = "";
            if (c1853010yJv == null || (enterFrom = c1853010yJv.getEnterFrom()) == null) {
                enterFrom = "";
            }
            C1853010yJv c1853010yJv2 = this.LLJILJIL;
            if (c1853010yJv2 == null || (enterMethod = c1853010yJv2.getEnterMethod()) == null) {
                enterMethod = "";
            }
            C1853010yJv c1853010yJv3 = this.LLJILJIL;
            String mode = null;
            if (c1853010yJv3 == null || (commonMobParams3 = c1853010yJv3.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
                str = "";
            }
            C1853010yJv c1853010yJv4 = this.LLJILJIL;
            if (c1853010yJv4 == null || (commonMobParams2 = c1853010yJv4.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
                str2 = "";
            }
            C1853010yJv c1853010yJv5 = this.LLJILJIL;
            if (c1853010yJv5 == null || (commonMobParams = c1853010yJv5.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
                str3 = "";
            }
            C1853010yJv c1853010yJv6 = this.LLJILJIL;
            if (c1853010yJv6 == null || (pageSource = c1853010yJv6.getPageSource()) == null) {
                pageSource = "";
            }
            C1853010yJv c1853010yJv7 = this.LLJILJIL;
            if (c1853010yJv7 != null) {
                mode = c1853010yJv7.getMode();
            }
            C1853010yJv c1853010yJv8 = this.LLJILJIL;
            if (c1853010yJv8 != null && (modeSource = c1853010yJv8.getModeSource()) != null) {
                str4 = modeSource;
            }
            C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "delete_image", "", null, mode, str4, null, null, null, vQ2(true), 47360);
        }
        withState(new AwS393S0200000_27(tikTokMediaModel, this, 56));
    }

    public final void yQ2(TikTokMediaModel tikTokMediaModel, C19EG c19eg, EnumC1154810g9n enumC1154810g9n) {
        String enterFrom;
        String enterMethod;
        String str;
        String str2;
        String str3;
        String pageSource;
        String mode;
        String modeSource;
        Map<String, String> commonMobParams;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1853010yJv c1853010yJv = this.LLJILJIL;
        String str4 = "";
        if (c1853010yJv == null || (enterFrom = c1853010yJv.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1853010yJv c1853010yJv2 = this.LLJILJIL;
        if (c1853010yJv2 == null || (enterMethod = c1853010yJv2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1853010yJv c1853010yJv3 = this.LLJILJIL;
        String quantityString = null;
        if (c1853010yJv3 == null || (commonMobParams3 = c1853010yJv3.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
            str = "";
        }
        C1853010yJv c1853010yJv4 = this.LLJILJIL;
        if (c1853010yJv4 == null || (commonMobParams2 = c1853010yJv4.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
            str2 = "";
        }
        C1853010yJv c1853010yJv5 = this.LLJILJIL;
        if (c1853010yJv5 == null || (commonMobParams = c1853010yJv5.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
            str3 = "";
        }
        C1853010yJv c1853010yJv6 = this.LLJILJIL;
        if (c1853010yJv6 == null || (pageSource = c1853010yJv6.getPageSource()) == null) {
            pageSource = "";
        }
        C1853010yJv c1853010yJv7 = this.LLJILJIL;
        if (c1853010yJv7 != null) {
            mode = c1853010yJv7.getMode();
        } else {
            mode = null;
        }
        C1853010yJv c1853010yJv8 = this.LLJILJIL;
        if (c1853010yJv8 != null && (modeSource = c1853010yJv8.getModeSource()) != null) {
            str4 = modeSource;
        }
        C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "select_image", "", null, mode, str4, null, null, null, vQ2(true), 47360);
        int size = getState().LLIZ.size() + this.LLILLJJLI;
        int iIntValue = this.LLILLL;
        if (iIntValue < 0) {
            iIntValue = ((Number) this.LLJ.getValue()).intValue();
        }
        if (size >= iIntValue) {
            if (c19eg != null) {
                Resources resources = c19eg.getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755041, iIntValue, Integer.valueOf(iIntValue));
                }
                if (c19eg != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                    c1389890mGx.LJIIJ(quantityString);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            return;
        }
        withState(new AwS236S0300000_27(tikTokMediaModel, enumC1154810g9n, this, 15));
    }

    public final void xQ2(C19EG c19eg, TikTokMediaModel tikTokMediaModel, Fragment fragment, boolean z) {
        withState(new AwS13S0410000_27(tikTokMediaModel, this, z, fragment, c19eg, 0));
    }
}
