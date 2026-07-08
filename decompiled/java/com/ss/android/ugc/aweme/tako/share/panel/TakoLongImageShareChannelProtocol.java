package com.ss.android.ugc.aweme.tako.share.panel;

import X.AbstractC1376390lvB;
import X.C1697810uHb;
import X.C516560KNq;
import X.C844470XAv;
import X.InterfaceC1369790lkX;
import X.InterfaceC1371860lns;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol;
import com.ss.android.ugc.aweme.tako.share.panel.TakoLongImageSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TakoLongImageShareChannelProtocol extends TTShareChannelProtocol {
    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final List<InterfaceC1369790lkX> KB0() {
        String strLJJIJL;
        List<InterfaceC1369790lkX> listLJIILJJIL = C1697810uHb.LJIILJJIL(new InterfaceC1369790lkX() { // from class: X.0lnL
            @Override // X.InterfaceC1369790lkX
            public final boolean LIZJ() {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final int LJIIJJI() {
                return 0;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIIL(C1371420lnA c1371420lnA, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIILLIIL(Context context, AbstractC1375550ltp abstractC1375550ltp) {
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIIZILJ(Context context) {
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJIJ(C1374270lrl c1374270lrl, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final void LJIL() {
            }

            @Override // X.InterfaceC1369790lkX
            public final void LJJI() {
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJIII() {
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJIIJ(AbstractC1375550ltp abstractC1375550ltp, Context context, C0M7Y c0m7y) {
                return true;
            }

            @Override // X.InterfaceC1369790lkX
            public final void LJJIIJZLJL(int i) {
            }

            @Override // X.InterfaceC1369790lkX
            public final void LJJIJIL(View view, boolean z) {
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJJIL(C1375540lto c1375540lto, Context context, C0M7Y c0m7y) {
                return false;
            }

            @Override // X.InterfaceC1370450llb
            public final int LJJJJLI() {
                return 101;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJJLIIL() {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final float LJJL() {
                return 0.34f;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJLI() {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final boolean LJJLIIIJJI() {
                return false;
            }

            @Override // X.InterfaceC1369790lkX
            public final String key() {
                return "tako_share_download_long_image";
            }

            @Override // X.InterfaceC1369790lkX
            public final String label() {
                return C2213981Bky.LIZIZ.getApplicationContext().getString(2131822533);
            }

            @Override // X.InterfaceC1369790lkX
            public final void LJIJI(C424540Gkm c424540Gkm, boolean z) {
                c424540Gkm.setImageDrawable(LJJII(c424540Gkm.getContext(), z));
            }

            @Override // X.InterfaceC1369790lkX
            public final Drawable LJJII(Context context, boolean z) {
                if (context == null) {
                    return null;
                }
                return new TuxIconDrawable(context, R.raw.icon_color_arrow_down_to_line_fill);
            }
        });
        for (InterfaceC1369790lkX interfaceC1369790lkX : super.KB0()) {
            InterfaceC1369790lkX interfaceC1369790lkX2 = interfaceC1369790lkX;
            if (!Intrinsics.LJFF(interfaceC1369790lkX2.key(), "chat_merge")) {
                if ((interfaceC1369790lkX2 instanceof AbstractC1376390lvB) && (strLJJIJL = ((AbstractC1376390lvB) interfaceC1369790lkX2).LJJIJL()) != null && strLJJIJL.length() != 0) {
                    C844470XAv.LIZ.getClass();
                    if (C516560KNq.LIZ(C844470XAv.LIZ(), strLJJIJL)) {
                    }
                }
                listLJIILJJIL.add(interfaceC1369790lkX);
            }
        }
        return listLJIILJJIL;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final Set<String> V41(List<? extends InterfaceC1369790lkX> list) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final boolean oM() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.share.config.TTShareChannelProtocol, com.ss.android.ugc.aweme.share.core.protocol.ShareChannelProtocol
    public final InterfaceC1371860lns LK0() {
        return new InterfaceC1371860lns() { // from class: X.0m5d
            @Override // X.InterfaceC1371860lns
            public final void LIZIZ(BaseSharePackage baseSharePackage, List list) {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1371860lns
            public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                TakoLongImageSharePackage takoLongImageSharePackage;
                if (!(baseSharePackage instanceof TakoLongImageSharePackage) || (takoLongImageSharePackage = (TakoLongImageSharePackage) baseSharePackage) == null || !z) {
                    return;
                }
                String str = "";
                if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "tako_share_download_long_image")) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str2 = takoLongImageSharePackage.commonParams.get("enter_from");
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = takoLongImageSharePackage.commonParams.get("enter_method");
                    if (str3 == null) {
                        str3 = "";
                    }
                    String str4 = takoLongImageSharePackage.commonParams.get("process_id");
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = takoLongImageSharePackage.commonParams.get("tako_session_id");
                    if (str5 != null) {
                        str = str5;
                    }
                    C1862330yYx.LJJ(c1862330yYx, str2, str3, str4, str, takoLongImageSharePackage.commonParams.get("tako_chat_id"), "share_generate_image_page", "download", null, null, null, null, null, null, null, C2097908Jt.LIZJ(new Pair("message_id", takoLongImageSharePackage.mobMessageId)), 49024);
                    return;
                }
                Function0<Unit> function0 = takoLongImageSharePackage.onExternalShareSuccess;
                if (function0 != null) {
                    function0.invoke();
                }
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                String str6 = takoLongImageSharePackage.commonParams.get("enter_from");
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = takoLongImageSharePackage.commonParams.get("enter_method");
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = takoLongImageSharePackage.commonParams.get("process_id");
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = takoLongImageSharePackage.commonParams.get("tako_session_id");
                if (str9 != null) {
                    str = str9;
                }
                C1862330yYx.LJJ(c1862330yYx2, str6, str7, str8, str, takoLongImageSharePackage.commonParams.get("tako_chat_id"), "share_generate_image_page", "click_external_app", null, null, null, null, null, null, null, C2097608Jq.LJIIIIZZ(new Pair("message_id", takoLongImageSharePackage.mobMessageId), new Pair("app_name", interfaceC1369790lkX.key())), 49024);
            }
        };
    }

    public TakoLongImageShareChannelProtocol(BaseSharePackage baseSharePackage) {
        super(baseSharePackage);
    }
}
