package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary;

import X.AbstractC1812500xGa;
import X.AbstractC1812820xH6;
import X.C0KPJ;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1161920gLG;
import X.C13LP;
import X.C16F5;
import X.C1812240xGA;
import X.C1812600xGk;
import X.C1812670xGr;
import X.C1812750xGz;
import X.C1812850xH9;
import X.C1813080xHW;
import X.C20337914i1;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C930940aKi;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.aisummary.AiSummaryTextStylePanelView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAISummaryBoardSetting;
import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class AiSummaryTextStylePanelView extends PowerCell<C1812600xGk> {
    public final MviViewModel<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6> LL = (MviViewModel) ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).createViewModel(AiSummaryViewModel.class);
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public ImageView LLILZLL;
    public C1812600xGk LLIZ;
    public Integer LLIZLLLIL;

    public AiSummaryTextStylePanelView() {
        C1813080xHW.LIZ = "design_1";
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        Integer num = this.LLIZLLLIL;
        if (num == null || num.intValue() != 3) {
            Integer num2 = this.LLIZLLLIL;
            if (num2 == null || num2.intValue() != 4) {
                P5(1, this.LLILLJJLI);
                P5(1, this.LLILLL);
                P5(2, this.LLILZ);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: N5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C1812600xGk c1812600xGk) {
        super.onBindItemView(c1812600xGk);
        this.LLIZ = c1812600xGk;
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C500260Jjc.LJIILIIL(this.LLILLL);
        C500260Jjc.LJIILIIL(this.LLILZ);
        C1812850xH9 c1812850xH9 = (C1812850xH9) C13LP.LJJJLZIJ(0, c1812600xGk.LL);
        if (c1812850xH9 != null) {
            I5(this.LLILLJJLI, c1812850xH9, 0);
        }
        C1812850xH9 c1812850xH92 = (C1812850xH9) C13LP.LJJJLZIJ(1, c1812600xGk.LL);
        if (c1812850xH92 != null) {
            I5(this.LLILLL, c1812850xH92, 1);
        }
        C1812850xH9 c1812850xH93 = (C1812850xH9) C13LP.LJJJLZIJ(2, c1812600xGk.LL);
        if (c1812850xH93 != null) {
            I5(this.LLILZ, c1812850xH93, 2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fya, viewGroup, false);
        L5(0, viewTd, true);
        return viewTd;
    }

    public final void P5(int i, View view) {
        C1812850xH9 c1812850xH9;
        if (view == null) {
            return;
        }
        Object tag = view.getTag();
        if ((tag instanceof C1812850xH9) && (c1812850xH9 = (C1812850xH9) tag) != null) {
            this.LL.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "show", "", "design_1", "", i)));
        }
    }

    public final void I5(final View view, final C1812850xH9 c1812850xH9, final int i) {
        C500260Jjc.LLFFF(view);
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.y3o);
            if (textView != null) {
                textView.setText(c1812850xH9.LIZ);
            }
            C16F5 c16f5 = (C16F5) view.findViewById(R.id.use_button);
            if (c16f5 != null) {
                C786410Ut5.l8(c16f5, new View.OnClickListener() { // from class: X.0xGs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        ViewGroup viewGroup;
                        MviViewModel<C1812670xGr, AbstractC1812500xGa, AbstractC1812820xH6> mviViewModel = this.LL.LL;
                        C1812850xH9 c1812850xH92 = c1812850xH9;
                        View view3 = view;
                        if (view3 instanceof ViewGroup) {
                            viewGroup = (ViewGroup) view3;
                        } else {
                            viewGroup = null;
                        }
                        mviViewModel.vQ2(new C1812480xGY(c1812850xH92, viewGroup, true));
                        this.LL.LL.vQ2(new C1812240xGA(new C1812750xGz(c1812850xH9, "click", "display", "design_1", "", i)));
                    }
                });
            }
            view.setTag(c1812850xH9);
        }
    }

    public final void L5(int i, View view, boolean z) {
        Long lValueOf;
        C20337914i1<Long> c20337914i1;
        Long lLIZIZ;
        this.LLIZLLLIL = Integer.valueOf(i);
        this.LLILLJJLI = view.findViewById(R.id.l23);
        this.LLILLL = view.findViewById(R.id.l3q);
        this.LLILZ = view.findViewById(R.id.l49);
        this.LLILZIL = view.findViewById(R.id.hor);
        this.LLILZLL = (ImageView) view.findViewById(R.id.cjy);
        if (!z) {
            C500260Jjc.LJIILIIL(view.findViewById(R.id.ko9));
            C500260Jjc.LJIILIIL(this.LLILZIL);
            ImageView imageView = this.LLILZLL;
            if (imageView != null) {
                C500260Jjc.LJIILIIL(imageView);
            }
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        if (LiveAISummaryBoardSetting.INSTANCE.broadcastDialogStyle() == 2 && i != 4 && (((lLIZIZ = (c20337914i1 = C0KPJ.ff).LIZIZ()) != null && lLIZIZ.longValue() == 0) || Intrinsics.LJFF(c20337914i1.LIZIZ(), lValueOf))) {
            ImageView imageView2 = this.LLILZLL;
            if (imageView2 != null) {
                C500260Jjc.LLFFF(imageView2);
                C1143680frq.LJIIJ(imageView2, C1143780fs0.LJIIJJI("tiktok_live_broadcast_demand_13", "live_ai_summary_broadcast_headline.png"), ImageView.ScaleType.FIT_CENTER, null, false, null, 48);
            }
            c20337914i1.LJFF(lValueOf);
        }
        View view2 = this.LLILZIL;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0xGt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    AiSummaryTextStylePanelView aiSummaryTextStylePanelView = this.LL;
                    C1812600xGk c1812600xGk = aiSummaryTextStylePanelView.LLIZ;
                    if (c1812600xGk != null) {
                        aiSummaryTextStylePanelView.LL.vQ2(new C1812510xGb(c1812600xGk));
                    }
                }
            }, view2);
        }
    }
}
