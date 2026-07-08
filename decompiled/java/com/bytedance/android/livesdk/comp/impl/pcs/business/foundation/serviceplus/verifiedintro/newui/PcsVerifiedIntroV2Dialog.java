package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.newui;

import X.C011Z;
import X.C0IJT;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C1697810uHb;
import X.C197039127h;
import X.C19EG;
import X.C474500IjA;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveSmbAudienceBadgeDetailSchemaSetting;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.verifiedintro.newui.PcsVerifiedIntroV2Dialog;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsVerifiedIntroV2Dialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nHELIOSISoiZzw2OjMlKiojJDA/Zzk2OiwqICo3ISs4OyB9JiA7PCZ9GCY/HyohISMlLCsaJjE+JhlhDCwtJSA0";
    public boolean LLJZIJLIL;
    public boolean LLL;
    public String LLLFFI;
    public String LLLFZ;
    public String LLLI;
    public String LLJLLL = "";
    public String LLJZ = "";
    public String LLLF = "";
    public String LLLFF = "";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.draggable = true;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Resources.Theme theme;
        super.onCreate(bundle);
        C19EG activity = getActivity();
        if (activity != null && (theme = activity.getTheme()) != null) {
            theme.applyStyle(C011Z.LIZ.LJIIIZ(), false);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        boolean z;
        boolean z2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("avatar");
        } else {
            string = null;
        }
        String str = "";
        if (string == null) {
            string = "";
        }
        this.LLJLLL = string;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("nickname")) == null) {
            string2 = "";
        }
        this.LLJZ = string2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("has_kyb_verified");
        } else {
            z = false;
        }
        this.LLJZIJLIL = z;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            z2 = arguments4.getBoolean("has_kyc_verified");
        } else {
            z2 = false;
        }
        this.LLL = z2;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (string3 = arguments5.getString("industry_display_name")) == null) {
            string3 = "";
        }
        this.LLLF = string3;
        Bundle arguments6 = getArguments();
        if (arguments6 != null && (string7 = arguments6.getString("kyb_identification")) != null) {
            str = string7;
        }
        this.LLLFF = str;
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            string4 = arguments7.getString("anchor_id");
        } else {
            string4 = null;
        }
        this.LLLFFI = string4;
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            string5 = arguments8.getString("show_entrance");
        } else {
            string5 = null;
        }
        this.LLLFZ = string5;
        Bundle arguments9 = getArguments();
        if (arguments9 != null) {
            string6 = arguments9.getString("previous_page");
        } else {
            string6 = null;
        }
        this.LLLI = string6;
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.v2_profile_image);
        if (c1322110kVd != null) {
            c1322110kVd.setImageURI(this.LLJLLL);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.v2_medal_icon);
        if (imageView != null) {
            imageView.setImageResource(R.drawable.f75);
        }
        TextView textView = (TextView) view.findViewById(R.id.v2_nickname);
        if (textView != null) {
            textView.setText(this.LLJZ);
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.v2_credential_container);
        ArrayList arrayList = new ArrayList();
        if (this.LLLF.length() > 0) {
            arrayList.add(this.LLLF);
        }
        if (this.LLJZIJLIL && this.LLLFF.length() > 0) {
            arrayList.add(this.LLLFF);
        }
        if (this.LLL) {
            arrayList.add(getString(2131850972));
        }
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            if (arrayList.isEmpty()) {
                C786410Ut5.LJZL(8, linearLayout);
            } else {
                C786410Ut5.LJZL(0, linearLayout);
                int iLIZIZ = (int) C497740JfY.LIZIZ(4.0f);
                LayoutInflater layoutInflaterNe = C786410Ut5.ne(linearLayout.getContext());
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        TextView textView2 = (TextView) C786410Ut5.Td(layoutInflaterNe, R.layout.gte, linearLayout, false);
                        textView2.setText((String) obj);
                        if (i > 0) {
                            ((LinearLayout.LayoutParams) textView2.getLayoutParams()).topMargin = iLIZIZ;
                        }
                        linearLayout.addView(textView2);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
        }
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.v2_got_it_button);
        if (c197039127h != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ey7, view.getContext());
            if (numLIZJ != null) {
                gradientDrawable.setColor(numLIZJ.intValue());
            }
            c197039127h.setBackground(gradientDrawable);
            c197039127h.setBackgroundRadius(16);
            C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.0JLz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    PcsVerifiedIntroV2Dialog pcsVerifiedIntroV2Dialog = this.LL;
                    String str2 = PcsVerifiedIntroV2Dialog._pnsPageId;
                    pcsVerifiedIntroV2Dialog.uS("click", null);
                    this.LL.close(1);
                }
            });
        }
        View viewFindViewById = view.findViewById(R.id.v2_close_button);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0JLy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Context context;
                    IActionHandlerService iActionHandlerService;
                    PcsVerifiedIntroV2Dialog pcsVerifiedIntroV2Dialog = this.LL;
                    pcsVerifiedIntroV2Dialog.uS("click", "faq");
                    String value = LiveSmbAudienceBadgeDetailSchemaSetting.INSTANCE.getValue();
                    if (value.length() != 0 && (context = pcsVerifiedIntroV2Dialog.getContext()) != null && (iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)) != null) {
                        iActionHandlerService.handle(context, value);
                    }
                }
            }, viewFindViewById);
        }
        uS("show", null);
    }

    public final void uS(String str, String str2) {
        Object obj;
        Object obj2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_verification_info_page");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(this.LLLFFI, "anchor_id");
        c474500IjALIZ.LJJII(this.LLLFZ, "show_entrance");
        String str3 = "1";
        if (this.LLJZIJLIL) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj, "has_kyb_verified");
        if (this.LLL) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(obj2, "has_kyc_verified");
        if (this.LLLF.length() <= 0) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str3, "has_industry_verified");
        c474500IjALIZ.LJJII(this.LLLI, "previous_page");
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "click_position");
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g_b, viewGroup, false);
    }
}
