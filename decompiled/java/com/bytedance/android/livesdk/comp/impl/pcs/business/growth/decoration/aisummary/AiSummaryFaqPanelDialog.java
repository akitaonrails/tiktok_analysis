package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812590xGj;
import X.C0TND;
import X.C1119920fFW;
import X.C1143680frq;
import X.C1143780fs0;
import X.C20736316Cj;
import X.C384050F3z;
import X.C418440Gaw;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C748880TZe;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
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
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.aisummary.AISummaryApi;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryFaqPanelDialog;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.LiveBoardsPageDialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.text.a0;
import tikcast.api.anchor_tool.SubmitLLMTitleFeedbackReq;

/* JADX INFO: loaded from: classes13.dex */
public final class AiSummaryFaqPanelDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmHELIOSE0Oio7PSd9LCAvJj0yPCwjJ2EyITY5JCIyOjxiCCYAPSghKD0qDiQ9GS49LSkIIC4/JyI=";
    public ImageView LLJLLL;
    public TextView LLJZ;
    public TextView LLJZIJLIL;
    public TextView LLL;
    public AbstractC1812590xGj LLLF;
    public String LLLFF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.draggable = false;
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        DataChannel dataChannelLJ;
        FragmentManager fragmentManager;
        String strValueOf;
        if (i == 999) {
            return;
        }
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(C475510Ikn.LJ(this));
        String str = this.LLLFF;
        if (str != null && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
            C0TND c0tnd = LiveBoardsPageDialogFragment.LLJILJILJ;
            if (jLJJLIIIJ == 0) {
                strValueOf = null;
            } else {
                strValueOf = String.valueOf(jLJJLIIIJ);
            }
            C0TND.LIZ(c0tnd, str, strValueOf, C475510Ikn.LJ(this), null, null, 8).show(fragmentManager, "LiveBoardsPageDialogFragment");
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJLLL = (ImageView) view.findViewById(R.id.hos);
        this.LLJZ = (TextView) view.findViewById(R.id.hox);
        this.LLJZIJLIL = (TextView) view.findViewById(R.id.hoz);
        this.LLL = (TextView) view.findViewById(R.id.hp0);
        C1143680frq.LJIIJ(this.LLJLLL, C1143780fs0.LJIIJJI("tiktok_live_broadcast_normal_1", "ttlive_ai_summary_boards_instruction.png"), ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
        TextView textView = this.LLJZIJLIL;
        if (textView != null) {
            textView.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C497740JfY.LIZLLL(R.attr.ezs, getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C497740JfY.LJIJI(2131851224)));
        }
        TextView textView2 = this.LLL;
        if (textView2 != null) {
            textView2.setText(C500260Jjc.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C497740JfY.LIZLLL(R.attr.ezs, getContext()), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C497740JfY.LJIJI(2131851225)));
        }
        String strLJIJI = C497740JfY.LJIJI(2131851223);
        String strLJIJJ = C497740JfY.LJIJJ(2131851222, strLJIJI);
        SpannableString spannableString = new SpannableString(strLJIJJ);
        int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezq, getContext())), iLJJJ, length, 33);
        C1119920fFW.LJ(getContext(), spannableString, iLJJJ, length, 33, 7, 500);
        C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.0TMK
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
            }

            @Override // android.text.style.ClickableSpan
            public final void onClick(View view2) {
                long jLJJLIIIJ;
                List<C1812850xH9> list;
                C1812850xH9 c1812850xH9;
                String str;
                SubmitLLMTitleFeedbackReq submitLLMTitleFeedbackReq = new SubmitLLMTitleFeedbackReq();
                AiSummaryFaqPanelDialog aiSummaryFaqPanelDialog = this.LL;
                DataChannel dataChannelLJ = C475510Ikn.LJ(aiSummaryFaqPanelDialog);
                if (dataChannelLJ != null) {
                    jLJJLIIIJ = C500260Jjc.LJJLIIIJ(dataChannelLJ);
                } else {
                    jLJJLIIIJ = 0;
                }
                submitLLMTitleFeedbackReq.roomId = jLJJLIIIJ;
                AbstractC1812590xGj abstractC1812590xGj = aiSummaryFaqPanelDialog.LLLF;
                if (abstractC1812590xGj != null && (list = abstractC1812590xGj.LL) != null && (c1812850xH9 = (C1812850xH9) C13LP.LJJJLL(list)) != null && (str = c1812850xH9.LIZ) != null) {
                    submitLLMTitleFeedbackReq.resultKey = str;
                    submitLLMTitleFeedbackReq.like = 2;
                    C480460Ism.LIZ().getClass();
                    ((AISummaryApi) C480460Ism.LIZLLL(AISummaryApi.class)).aiSummaryFeedback(submitLLMTitleFeedbackReq).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
                    C0U4R c0u4r = new C0U4R();
                    c0u4r.LJII = C475510Ikn.LJ(this.LL);
                    c0u4r.LIZJ = "ttlive_AIsummary_toastReported";
                    c0u4r.LIZLLL = 2131851027;
                    c0u4r.LJFF = true;
                    C766270U4b.LJIIJ(c0u4r);
                }
            }
        }, iLJJJ, length, 33);
        TextView textView3 = this.LLJZ;
        if (textView3 != null) {
            textView3.setText(spannableString);
        }
        TextView textView4 = this.LLJZ;
        if (textView4 != null) {
            textView4.setMovementMethod(LinkMovementMethod.getInstance());
        }
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e1y);
        if (liveIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
            liveIconView.setBackground(c384050F3z.LIZ(view.getContext()));
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0TML
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.close(1);
                }
            });
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fy4, viewGroup, false);
    }
}
