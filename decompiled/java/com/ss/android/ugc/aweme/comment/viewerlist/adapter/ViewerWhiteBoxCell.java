package com.ss.android.ugc.aweme.comment.viewerlist.adapter;

import X.C01GW;
import X.C0C64;
import X.C0LAB;
import X.C1158250gFL;
import X.C1176850gjL;
import X.C1308910kAL;
import X.C20684815ws;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C431260Gvc;
import X.C444920HcY;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ACListenerS121S0200000_18;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.viewerlist.adapter.ViewerWhiteBoxCell;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.services.publish.IAVPublishWhiteBoxService;
import com.zhiliaoapp.musically.R;
import java.util.UUID;
import kotlin.jvm.internal.AFwS206S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class ViewerWhiteBoxCell extends PowerCell<C1158250gFL> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 124));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS562S0100000_18(this, 123));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 122));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(86));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 125));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1158250gFL c1158250gFL = (C1158250gFL) interfaceC1891350zJl;
        super.onBindItemView(c1158250gFL);
        C786410Ut5.a9((TuxIconView) this.LLILLL.getValue(), new ACListenerS121S0200000_18(this, c1158250gFL, 80));
        String string = null;
        if (c1158250gFL.LLILLJJLI) {
            TuxIconView tuxIconView = (TuxIconView) this.LL.getValue();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_trophy;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView.setTuxIcon(c419910GdJ);
            Resources resources = this.itemView.getResources();
            long j = c1158250gFL.LLILLL;
            String quantityString = resources.getQuantityString(2131755186, (int) j, String.valueOf(C1176850gjL.LIZ(1, Long.valueOf(j), "")));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_play_milestone", true) == 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_shoot_again", true) == 1) {
                string = this.itemView.getResources().getString(2131829933);
            }
            L5(quantityString, string, c1158250gFL);
        } else {
            TuxIconView tuxIconView2 = (TuxIconView) this.LL.getValue();
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_color_celebrate;
            c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            tuxIconView2.setTuxIcon(c419910GdJ2);
            Resources resources2 = this.itemView.getResources();
            long j2 = c1158250gFL.LL;
            String quantityString2 = resources2.getQuantityString(2131755185, (int) j2, String.valueOf(C1176850gjL.LIZ(1, Long.valueOf(j2), "")));
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_cold_start_traffic", true) == 1 && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_show_comment_shoot_again", true) == 1) {
                string = this.itemView.getResources().getString(2131829933);
            }
            L5(quantityString2, string, c1158250gFL);
        }
        I5(c1158250gFL.LLILZ.getAid(), c1158250gFL.LLILZIL, "create_post_tab_show", c1158250gFL.LLILLJJLI);
        this.itemView.setTag(c1158250gFL);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup, int i) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.a2e, viewGroup, false);
    }

    public final void L5(String str, String str2, final C1158250gFL c1158250gFL) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), 0, str.length(), 33);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ui, this.itemView.getContext());
        if (numLIZJ != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, str.length(), 33);
        }
        if (str2 != null) {
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            int length2 = spannableStringBuilder.length();
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(62, false), length, length2, 33);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1n, this.itemView.getContext());
            if (numLIZJ2 != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), length, length2, 34);
            }
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0hPg
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    ViewerWhiteBoxCell viewerWhiteBoxCell = this.LL;
                    C1158250gFL c1158250gFL2 = c1158250gFL;
                    boolean z = c1158250gFL2.LLILLJJLI;
                    String aid = c1158250gFL2.LLILZ.getAid();
                    String str3 = c1158250gFL.LLILZIL;
                    viewerWhiteBoxCell.getClass();
                    ViewerWhiteBoxCell.I5(aid, str3, "create_post_tab_click", z);
                    ViewerWhiteBoxCell viewerWhiteBoxCell2 = this.LL;
                    String aid2 = c1158250gFL.LLILZ.getAid();
                    String str4 = c1158250gFL.LLILZIL;
                    IAVPublishWhiteBoxService iAVPublishWhiteBoxService = (IAVPublishWhiteBoxService) viewerWhiteBoxCell2.LLILZ.getValue();
                    if (iAVPublishWhiteBoxService != null) {
                        iAVPublishWhiteBoxService.recordWhiteBoxCardClick(aid2);
                    }
                    String string = UUID.randomUUID().toString();
                    IRecordMobService iRecordMobService = (IRecordMobService) PluggableExtentionKt.pluggableSpi$default(IRecordMobService.class, false, false, false, 14, null);
                    if (iRecordMobService != null) {
                        if (str4 == null) {
                            str4 = "";
                        }
                        iRecordMobService.LIZIZ(new C1449410nox(string, "views_panel", str4, null, null, null, null, null, 248), new C0LAB(), null);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("aweme://openShoot?shoot_way=views_panel&shoot_from_view_panel_aweme_id=");
                    sbLIZ.append(aid2);
                    sbLIZ.append("&creation_id=");
                    sbLIZ.append(string);
                    SmartRouter.buildRoute(viewerWhiteBoxCell2.itemView.getContext(), C2188811AlT.LIZIZ(sbLIZ)).open();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1n, this.LL.itemView.getContext());
                    if (numLIZJ3 != null) {
                        textPaint.setColor(numLIZJ3.intValue());
                    }
                }
            }, length, length2, 34);
        }
        ((TextView) this.LLILLJJLI.getValue()).setText(spannableStringBuilder);
        ((TextView) this.LLILLJJLI.getValue()).setMovementMethod(C431260Gvc.LIZ);
    }

    public static void I5(String str, String str2, String str3, boolean z) {
        String str4;
        if (z) {
            str4 = "views_panel_highest_view_toast_show";
        } else {
            str4 = "views_panel_extra_view_toast_show";
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("group_id", str);
        c0lab.LJ("enter_from", str2);
        c0lab.LJ("action_type", str3);
        c0lab.LJ("shoot_way", "views_panel");
        C20684815ws.LJIILLIIL(str4, c0lab.LIZ);
    }
}
