package com.ss.android.ugc.aweme.poi.detail.claim;

import X.C1185040gwY;
import X.C1189060h32;
import X.C1189570h3r;
import X.C1189580h3s;
import X.C1205490hTX;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1697810uHb;
import X.C1EMR;
import X.C339190DRl;
import X.C416800GVy;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiBusinessAccountInfo;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiClaimManageToolModel;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiClaimTrackModel;
import com.ss.android.ugc.aweme.poi.detail.claim.data.PoiDetailClaimResponse;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import com.zhiliaoapp.musically.R;
import java.util.List;
import org.json.JSONObject;
import wh6.AbS508S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailClaimAssem extends PoiDetailBaseAssem<PoiDetailClaimResponse> {
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public SmartImageView LLJL;
    public LinearLayout LLJLIL;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e2p;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem
    public final boolean yp() {
        return true;
    }

    public static SpannableStringBuilder Ep(PoiBusinessAccountInfo poiBusinessAccountInfo) {
        String str;
        String str2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        boolean z;
        Boolean boolValueOf4;
        boolean z2;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (poiBusinessAccountInfo != null) {
            try {
                str = poiBusinessAccountInfo.nick;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(c1emr, "get_subtitle_str", null, e);
                return spannableStringBuilder;
            }
        } else {
            str = null;
        }
        if (poiBusinessAccountInfo != null) {
            str2 = poiBusinessAccountInfo.ownerText;
        } else {
            str2 = null;
        }
        boolean z4 = false;
        if (str != null) {
            if (str.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolValueOf = Boolean.valueOf(z3);
        } else {
            boolValueOf = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf)) {
            if (str2 != null) {
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolValueOf4 = Boolean.valueOf(z2);
            } else {
                boolValueOf4 = null;
            }
            if (C1189060h32.LJIILJJIL(boolValueOf4)) {
                spannableStringBuilder.append((CharSequence) str);
                SpannableString spannableString = new SpannableString(" ");
                float f = 2;
                C786410Ut5.p2(spannableString, new C416800GVy((int) C339190DRl.LIZ(f)), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) "·");
                SpannableString spannableString2 = new SpannableString(" ");
                C786410Ut5.p2(spannableString2, new C416800GVy((int) C339190DRl.LIZ(f)), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString2);
                spannableStringBuilder.append((CharSequence) str2);
                return spannableStringBuilder;
            }
        }
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf2 = Boolean.valueOf(z);
        } else {
            boolValueOf2 = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf2)) {
            spannableStringBuilder.append((CharSequence) str);
            return spannableStringBuilder;
        }
        if (str2 != null) {
            if (str2.length() > 0) {
                z4 = true;
            }
            boolValueOf3 = Boolean.valueOf(z4);
        } else {
            boolValueOf3 = null;
        }
        if (C1189060h32.LJIILJJIL(boolValueOf3)) {
            spannableStringBuilder.append((CharSequence) str2);
        }
        return spannableStringBuilder;
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, X.InterfaceC1173970geh
    public final void CG1(BaseComponentData baseComponentData) {
        String str;
        String str2;
        PoiDetailClaimResponse poiDetailClaimResponse = (PoiDetailClaimResponse) baseComponentData;
        super.CG1(poiDetailClaimResponse);
        if (!poiDetailClaimResponse.isValid()) {
            Bp(false);
            return;
        }
        Bp(true);
        try {
            PoiBusinessAccountInfo businessAccountInfo = poiDetailClaimResponse.getBusinessAccountInfo();
            TuxTextView tuxTextView = this.LLJJL;
            if (tuxTextView != null) {
                if (businessAccountInfo == null) {
                    str2 = null;
                } else {
                    str2 = businessAccountInfo.title;
                }
                tuxTextView.setText(str2);
            }
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(Ep(businessAccountInfo));
            }
            if (businessAccountInfo == null || (str = businessAccountInfo.headerImg) == null) {
                str = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJIJJLI(R.drawable.ct9);
            c1331670kl3LJIIIZ.LJJIIZ(R.drawable.ct9);
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LIZ = true;
            c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIZ.LJJ(this.LLJL);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            Fp(poiDetailClaimResponse.getManageToolList());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "load_tab_content", null, e);
        }
    }

    public final void Fp(List<PoiClaimManageToolModel> list) {
        DisplayMetrics displayMetrics;
        int i;
        String str;
        ViewGroup.LayoutParams layoutParams;
        if (list != null && !list.isEmpty()) {
            Context context = getContext();
            if (context != null) {
                Resources resources = context.getResources();
                int i2 = 0;
                if (resources != null && (displayMetrics = resources.getDisplayMetrics()) != null && (i = displayMetrics.widthPixels) != 0) {
                    float fLIZ = (i - C339190DRl.LIZ(320)) / 2;
                    LinearLayout linearLayout = this.LLJLIL;
                    if (linearLayout != null && (layoutParams = linearLayout.getLayoutParams()) != null && (layoutParams instanceof LinearLayout.LayoutParams)) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        int i3 = (int) fLIZ;
                        marginLayoutParams.setMarginStart(i3);
                        marginLayoutParams.setMarginEnd(i3);
                        LinearLayout linearLayout2 = this.LLJLIL;
                        if (linearLayout2 != null) {
                            C786410Ut5.d6(linearLayout2, layoutParams);
                        }
                    }
                    for (PoiClaimManageToolModel poiClaimManageToolModel : list) {
                        int i4 = i2 + 1;
                        if (i2 >= 0) {
                            PoiClaimManageToolModel poiClaimManageToolModel2 = poiClaimManageToolModel;
                            if (i2 < 3) {
                                C1189570h3r c1189570h3r = new C1189570h3r(context);
                                try {
                                    TuxIconView tuxIconView = c1189570h3r.LL;
                                    if (tuxIconView != null) {
                                        tuxIconView.setImageDrawable(c1189570h3r.LIZ(poiClaimManageToolModel2.iconUrl));
                                    }
                                    c1189570h3r.LLILZIL = poiClaimManageToolModel2.bizType;
                                    View view = c1189570h3r.LLILLL;
                                    if (view != null) {
                                        C786410Ut5.I7(new AbS508S0200000_18(poiClaimManageToolModel2, c1189570h3r, 31), view);
                                    }
                                    C1189580h3s.LIZ.getClass();
                                    PoiClaimTrackModel poiClaimTrackModel = poiClaimManageToolModel2.showTrackModel;
                                    if (poiClaimTrackModel != null && (str = poiClaimTrackModel.eventName) != null) {
                                        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                                        JSONObject jSONObjectLIZ = C1189580h3s.LIZ(poiClaimTrackModel.eventParamsModel);
                                        c1185040gwY.getClass();
                                        C1185040gwY.LIZJ(str, jSONObjectLIZ, null);
                                    } else {
                                        C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                                        C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
                                        Throwable th = new Throwable();
                                        c1205490hTX.getClass();
                                        C1205490hTX.LIZLLL(c1emr, "show_params_is_null", null, th);
                                    }
                                    TuxTextView tuxTextView = c1189570h3r.LLILLJJLI;
                                    if (tuxTextView != null) {
                                        tuxTextView.setText(poiClaimManageToolModel2.text);
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    C1205490hTX c1205490hTX2 = C1205490hTX.LIZ;
                                    C1EMR c1emr2 = C1EMR.POI_DETAIL_CLAIM;
                                    c1205490hTX2.getClass();
                                    C1205490hTX.LIZLLL(c1emr2, "bind_data", null, e);
                                }
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                if (i2 < 2) {
                                    layoutParams2.setMarginEnd((int) C339190DRl.LIZ(12));
                                }
                                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1189570h3r);
                                c1189570h3r.setLayoutParams(layoutParams2);
                                LinearLayout linearLayout3 = this.LLJLIL;
                                if (linearLayout3 != null) {
                                    linearLayout3.addView(c1189570h3r);
                                }
                            }
                            i2 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    return;
                }
                C339190DRl.LIZIZ(this.LLJLIL);
                return;
            }
            return;
        }
        C1205490hTX c1205490hTX3 = C1205490hTX.LIZ;
        C1EMR c1emr3 = C1EMR.POI_DETAIL_CLAIM;
        Throwable th2 = new Throwable();
        c1205490hTX3.getClass();
        C1205490hTX.LIZLLL(c1emr3, "load_entrance_fail", null, th2);
        C339190DRl.LIZIZ(this.LLJLIL);
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBaseAssem, com.ss.android.ugc.aweme.slash.component.glue.BaseSlashGlueSlotAssemComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.qz0);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.qyz);
        this.LLJLIL = (LinearLayout) view.findViewById(R.id.nge);
        this.LLJL = (SmartImageView) view.findViewById(R.id.qy_);
    }
}
