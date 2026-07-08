package com.bytedance.android.livesdk.toolbar;

import X.C0HTI;
import X.C0IJT;
import X.C0IR5;
import X.C1087000eOQ;
import X.C1119170fEJ;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C16F5;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C418440Gaw;
import X.C474500IjA;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.toolbar.AiGeneratedContentSheetFragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes8.dex */
public final class AiGeneratedContentSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9PCojJSHELIOS0yOmsNIAg2JiA+KDs2LAYjJzs2JjEfISo2PAM+KCg+LSs4";
    public final DataChannel LLJLLL;
    public C16F5 LLJZ;
    public C16F5 LLJZIJLIL;

    public AiGeneratedContentSheetFragment() {
        this(null);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS142S0100000_7(this, 106)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    public AiGeneratedContentSheetFragment(DataChannel dataChannel) {
        this.LLJLLL = dataChannel;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.isHeaderFloating = true;
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long jLongValue;
        C0IR5 c0ir5;
        Long l;
        super.onViewCreated(view, bundle);
        this.LLJZ = (C16F5) view.findViewById(R.id.end);
        this.LLJZIJLIL = (C16F5) view.findViewById(R.id.ao3);
        ImageView imageView = (ImageView) view.findViewById(R.id.jek);
        if (imageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.sf;
            imageView.setImageDrawable(c0hti.LIZ(imageView.getContext()));
        }
        String strLocalLanguage = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).localLanguage(getContext());
        if (strLocalLanguage == null) {
            strLocalLanguage = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://www.tiktok.com/community-guidelines/");
        sbLIZ.append(strLocalLanguage);
        sbLIZ.append("/integrity-authenticity/?cgversion=2023&height=60%25&transition_animation=bottom&gravity=bottom");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C16F5 c16f5 = this.LLJZ;
        if (c16f5 != null) {
            c16f5.setText(uS(2131850522, 2131850519, strLIZIZ));
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("https://www.tiktok.com/tns-inapp/pages/ai-generated-content?hide_nav_bar=1&enter_from=video_detail&lang=");
        sbLIZ2.append(strLocalLanguage);
        sbLIZ2.append("&height=60%25&transition_animation=bottom&gravity=bottom");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        C16F5 c16f52 = this.LLJZIJLIL;
        if (c16f52 != null) {
            c16f52.setText(uS(2131850520, 2131850518, strLIZIZ2));
            c16f52.setLinksClickable(true);
            c16f52.setMovementMethod(LinkMovementMethod.getInstance());
            c16f52.setHighlightColor(0);
        }
        String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("show_live_aigc_pop_up");
        c474500IjALIZ.LJIJJLI(this.LLJLLL);
        c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
        DataChannel dataChannel = this.LLJLLL;
        if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxu, viewGroup, false);
    }

    public final SpannableString uS(int i, int i2, final String str) {
        final String strLJIJI = C497740JfY.LJIJI(i2);
        String strLJIJJ = C497740JfY.LJIJJ(i, strLJIJI);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        SpannableString spannableString = new SpannableString(strLJIJJ);
        C1119920fFW.LJ(getContext(), spannableString, 0, iLJJJ, 17, 6, 400);
        C1119920fFW.LJ(getContext(), spannableString, iLJJJ, iLJJJ + strLJIJI.length(), 17, 6, 500);
        C1119920fFW.LJ(getContext(), spannableString, iLJJJ + strLJIJI.length(), spannableString.length(), 17, 6, 400);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex3, getContext())), 0, spannableString.length(), 17);
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezz, getContext())), iLJJJ, strLJIJI.length() + iLJJJ, 17);
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0J9P
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view) {
                long jLongValue;
                C0IR5 c0ir5;
                Long l;
                Context context = this.LL.getContext();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("aweme://webview_popup?url=");
                sbLIZ.append(Uri.encode(str));
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
                smartRouteBuildRoute.withParam("title", strLJIJI);
                smartRouteBuildRoute.withParam("show_separate_line", true);
                smartRouteBuildRoute.open();
                AiGeneratedContentSheetFragment aiGeneratedContentSheetFragment = this.LL;
                aiGeneratedContentSheetFragment.getClass();
                String strCurrentRegionCode = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentRegionCode();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("click_links_in_live_aigc_pop_up");
                c474500IjALIZ.LJIJJLI(aiGeneratedContentSheetFragment.LLJLLL);
                c474500IjALIZ.LJJII(strCurrentRegionCode, "country_code");
                DataChannel dataChannel = aiGeneratedContentSheetFragment.LLJLLL;
                if (dataChannel != null && (c0ir5 = (C0IR5) dataChannel.gg0(C1087000eOQ.class)) != null && (l = c0ir5.LIZLLL) != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "user_id");
                c474500IjALIZ.LIZ();
                this.LL.close(1);
            }
        }, iLJJJ, strLJIJI.length() + iLJJJ, 17);
        return spannableString;
    }
}
