package com.ss.android.ugc.aweme.share.improve.pkg;

import X.AbstractC1375550ltp;
import X.C08HM;
import X.C0M7Y;
import X.C0VSJ;
import X.C1233040iBy;
import X.C1370940lmO;
import X.C1371430lnB;
import X.C1374720lsU;
import X.C1375540lto;
import X.C1376480lvK;
import X.C1377200lwU;
import X.C1389890mGx;
import X.C1697810uHb;
import X.C2188811AlT;
import X.C2203008k8;
import X.C2427709fH;
import X.C259800zU;
import X.C621180OYa;
import X.InterfaceC1369790lkX;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.common.utility.BitmapUtils;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.web.share.model.WebShareInfo;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS299S0300000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class HybridImageSharePackage extends SharePackage {
    public Function0<? extends Object> callback;
    public WebShareInfo.HybridContainerInfo hybridContainerInfo;
    public boolean isHybridLoadFailed;
    public boolean isHybridLoadFinish;
    public int shareMode;
    public static final C1376480lvK Companion = new C1376480lvK();
    public static final List<String> NOT_SUPPORT_LINK_CHANNEL_LIST = C1697810uHb.LJIIJJI("whatsapp_status", "instagram", "instagram_story", "snapchat");
    public static final List<String> NOT_SUPPORT_PHOTO_CHANNEL_LIST = Collections.singletonList("copy");
    public static final List<String> NOT_SUPPORT_LINK_AND_PHOTO_CHANNEL_LIST = C1697810uHb.LJIIJJI("whatsapp_status", "copy", "messenger", "instagram", "instagram_story", "facebook", "reddit", "facebook_lite", "line", "messenger_lite", "kakaotalk", "kakao_story", "facebook_group");

    public HybridImageSharePackage(C1370940lmO c1370940lmO) {
        super(c1370940lmO);
        this.shareMode = 3;
    }

    public static void LJJI(InterfaceC1369790lkX interfaceC1369790lkX, String str, Context context) {
        C1375540lto c1375540lto = new C1375540lto(C2203008k8.LIZ(context, new C0VSJ(str)), null, null, null, null, false, 252);
        c1375540lto.LIZIZ("media_type", "image/png");
        interfaceC1369790lkX.LJJJIL(c1375540lto, context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, X.0lnB] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, X.0lnB] */
    public final void LJJ(InterfaceC1369790lkX interfaceC1369790lkX, String str, Context context) throws Throwable {
        String strLIZJ = C1377200lwU.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC1369790lkX, this.description);
        String strLIZJ2 = C1374720lsU.LIZJ(str, this.itemType, interfaceC1369790lkX.key(), this.extras.getInt("web_biz_scene_num", 0), this);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new C1371430lnB(strLIZJ2, strLIZJ, 4);
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email")) {
            c259800zU.element = new C1371430lnB(strLIZJ2, this.title, strLIZJ);
        }
        if (C621180OYa.LIZIZ.LJII(C621180OYa.LIZIZ.LJIIIZ(this.itemType, this.url).getNum())) {
            SharePackage.LJIJJLI(this, this, (AbstractC1375550ltp) c259800zU.element, new AwS299S0300000_21(interfaceC1369790lkX, (InterfaceC1369790lkX) c259800zU, (C259800zU<C1371430lnB>) context, (Context) 0));
        } else {
            interfaceC1369790lkX.LJJIFFI((C1371430lnB) c259800zU.element, context, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final void LJIIIZ(Context context, InterfaceC1369790lkX interfaceC1369790lkX, View view, Function0<Unit> function0) {
        if (this.isHybridLoadFailed) {
            if (view != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIIZ(2131845924);
                c1389890mGx.LJIIJJI();
                return;
            }
            return;
        }
        if (!this.isHybridLoadFinish) {
            if (view != null) {
                C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                c1389890mGx2.LJIIIZ(2131845925);
                c1389890mGx2.LJIIJJI();
                return;
            }
            return;
        }
        super.LJIIIZ(context, interfaceC1369790lkX, view, function0);
    }

    @Override // com.ss.android.ugc.aweme.share.base.model.BaseSharePackage
    public final boolean LJII(InterfaceC1369790lkX interfaceC1369790lkX, Context context, View view, C0M7Y c0m7y, Function1<? super Boolean, Unit> function1) throws Throwable {
        Object objInvoke;
        boolean z;
        C1375540lto c1375540lto;
        C621180OYa.LIZIZ.LJJLI(0, interfaceC1369790lkX.key(), "others_video_share_list");
        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "chat_merge")) {
            return false;
        }
        if (this.shareMode == 3) {
            LJJ(interfaceC1369790lkX, this.url, context);
            function1.invoke(Boolean.TRUE);
            return true;
        }
        Function0<? extends Object> function0 = this.callback;
        if (function0 != null) {
            objInvoke = function0.invoke();
        } else {
            objInvoke = null;
        }
        Bitmap bitmap = (Bitmap) objInvoke;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReferralImageSharePackage bitmap is null == ");
        if (bitmap == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (bitmap != null) {
            String strLJIILLIIL = C2427709fH.LJIILLIIL(context);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            String str = "";
            sbLIZ3.append("");
            sbLIZ3.append(System.currentTimeMillis());
            sbLIZ2.append(C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ3)));
            sbLIZ2.append(".png");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (BitmapUtils.saveBitmapToSD(bitmap, strLJIILLIIL, strLIZIZ)) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLJIILLIIL);
                sbLIZ4.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                if (strLIZIZ2 != null) {
                    int i = this.shareMode;
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                LJJ(interfaceC1369790lkX, this.url, context);
                            }
                        } else {
                            LJJI(interfaceC1369790lkX, strLIZIZ2, context);
                        }
                    } else if (NOT_SUPPORT_LINK_AND_PHOTO_CHANNEL_LIST.contains(interfaceC1369790lkX.key())) {
                        if (!NOT_SUPPORT_LINK_CHANNEL_LIST.contains(interfaceC1369790lkX.key())) {
                            LJJ(interfaceC1369790lkX, this.url, context);
                        } else {
                            LJJI(interfaceC1369790lkX, strLIZIZ2, context);
                        }
                    } else {
                        String str2 = this.url;
                        String strLIZJ = C1377200lwU.LIZJ(this.extras.getBoolean("enable_copylink_desc"), interfaceC1369790lkX, this.description);
                        String strLIZJ2 = C1374720lsU.LIZJ(str2, this.itemType, interfaceC1369790lkX.key(), this.extras.getInt("web_biz_scene_num", 0), this);
                        SharePackage.Companion.getClass();
                        if (strLIZJ2.length() > 0) {
                            c1375540lto = new C1375540lto(C2203008k8.LIZ(context, new C0VSJ(strLIZIZ2)), strLIZJ, null, strLIZJ2, null, false, 192);
                        } else {
                            c1375540lto = new C1375540lto(C2203008k8.LIZ(context, new C0VSJ(strLIZIZ2)), "", null, "", null, false, 192);
                        }
                        if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "email") || Intrinsics.LJFF(interfaceC1369790lkX.key(), "reddit")) {
                            c1375540lto.LIZLLL = this.title;
                        }
                        String str3 = c1375540lto.LJ;
                        if (str3 != null) {
                            str = str3;
                        }
                        c1375540lto.LIZIZ("content_url", str);
                        c1375540lto.LIZIZ("media_type", "image/png");
                        interfaceC1369790lkX.LJJJIL(c1375540lto, context, null);
                    }
                }
            }
            function1.invoke(Boolean.TRUE);
            return true;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(2131845924);
        c1233040iBy.LIZLLL();
        function1.invoke(Boolean.FALSE);
        return true;
    }
}
