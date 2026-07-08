package com.ss.android.ugc.aweme.story.widget.guide;

import X.C013C;
import X.C0OM1;
import X.C1251150ifB;
import X.C1295960jpS;
import X.C1387040mCM;
import X.C1388190mED;
import X.C1390920mIc;
import X.C1391850mK7;
import X.C14MJ;
import X.C1595350rcL;
import X.C1598170rgt;
import X.C1600610rkp;
import X.C1607400rvm;
import X.C1608320rxG;
import X.C1618440sDa;
import X.C1840470xzh;
import X.C197039127h;
import X.C19EG;
import X.C20684815ws;
import X.C295190Bhd;
import X.C384050F3z;
import X.C614770O9j;
import X.C786410Ut5;
import X.EnumC1606080rte;
import X.InterfaceC1891350zJl;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.widget.SmallStoryWidget;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS459S0200000_24;
import kotlin.jvm.internal.AwS551S0100000_7;
import wh6.AbS703S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryWidgetGuideInboxCell extends PowerCell<C1598170rgt> {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public int LLILLL = 1;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.r7;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("notification_page", "enter_from");
        pairArr[1] = new Pair(Integer.valueOf(this.LLILLL), "is_first");
        C1598170rgt item = getItem();
        pairArr[2] = new Pair(item != null ? item.LLILZ : null, "widget_type");
        C20684815ws.LJIJI("add_widget_show", pairArr);
        C1595350rcL.LIZJ(this, "widget", null, 0, null, null, 126);
    }

    public final void I5() {
        C1598170rgt item = getItem();
        if (item == null) {
            return;
        }
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("notification_page", "enter_from");
        pairArr[1] = new Pair(Integer.valueOf(this.LLILLL), "is_first");
        C1598170rgt item2 = getItem();
        pairArr[2] = new Pair(item2 != null ? item2.LLILZ : null, "widget_type");
        C20684815ws.LJIJI("click_add_widget", pairArr);
        int iLIZ = C1595350rcL.LIZ(this);
        C1595350rcL.LIZIZ(this, "widget", null, null, iLIZ, null, null, 110);
        C614770O9j.LIZIZ.LIZJ().LJI(iLIZ - 1, "notification_page", null, getItem() != null ? "widget" : "", null, "", null);
        C1840470xzh.LIZ().storeBoolean("keva_key_widget_guide_dialog_appeared", true);
        final String str = item.LL ? "first" : "fixed";
        C1600610rkp c1600610rkp = new Object() { // from class: X.0rkp
        };
        final Context context = this.itemView.getContext();
        c1600610rkp.getClass();
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            ((IUgCommonService) ServiceManager.get().getService(IUgCommonService.class)).LJIIIZ();
            final View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.r8, null);
            final C1295960jpS c1295960jpS = (C1295960jpS) viewLJLLJ.findViewById(R.id.jd2);
            c1295960jpS.setRepeatMode(1);
            c1295960jpS.setRepeatCount(-1);
            C14MJ.LJIIJJI(c1295960jpS);
            final C013C c013c = new C013C();
            C786410Ut5.U8((C197039127h) viewLJLLJ.findViewById(R.id.afi), new View.OnClickListener() { // from class: X.0JBX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C849850XVn.LIZIZ.LIZJ().LJIJI("add_story_to_home_screen_nscreen", "add_widget_btn", true);
                    String str2 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJ(viewLJLLJ, C343970De7.LIZ);
                    Context context2 = context;
                    if (Build.VERSION.SDK_INT >= 26 && AppWidgetManager.getInstance(context2).isRequestPinAppWidgetSupported()) {
                        c013c.element = true;
                        AppWidgetManager.getInstance(context).requestPinAppWidget(new ComponentName(context, (Class<?>) SmallStoryWidget.class), null, null);
                    }
                }
            });
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS551S0100000_7(viewLJLLJ, 615));
            c0om1.LIZIZ(c1251150ifB);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
            c1390920mIc.LJIIIIZZ(1);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIJIL = c0om1;
            tuxSheet.LLJJJ = null;
            tuxSheet.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0MBp
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    String str2;
                    if (c013c.element) {
                        str2 = "done";
                    } else {
                        str2 = "close";
                    }
                    C20684815ws.LJIJI("click_story_widget_guide", new Pair("notification_page", "enter_from"), new Pair(str, "trigger_type"), new Pair(str2, "click_type"), new Pair(1, "page"));
                    c1295960jpS.cancelAnimation();
                    c013c.element = false;
                }
            };
            C1391850mK7.LIZIZ(tuxSheet, "add_story_to_home_screen_nscreen");
            tuxSheet.show(c19egLIZIZ.getSupportFragmentManager(), "story_widget_guide");
            c1295960jpS.playAnimation();
            C20684815ws.LJIJI("story_widget_guide_show", new Pair("notification_page", "enter_from"), new Pair(str, "trigger_type"), new Pair(1, "page"));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C1595350rcL.LIZLLL(this);
        this.LL = (TuxIconView) this.itemView.findViewById(R.id.k1_);
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.foa);
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            tuxIconView.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        C786410Ut5.I7(new AbS703S0100000_24(this, 9), this.itemView);
        TuxTextView tuxTextView = this.LLILLJJLI;
        C1607400rvm c1607400rvm = C1607400rvm.LIZIZ;
        EnumC1606080rte enumC1606080rte = EnumC1606080rte.INBOX_TOP_LIST;
        View view = this.itemView;
        c1607400rvm.LIZIZ(enumC1606080rte, new C1608320rxG(view, view.findViewById(R.id.bi2), this.LL, tuxTextView, (TuxIconView) null, 48), C295190Bhd.LIZIZ());
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1598170rgt c1598170rgt = (C1598170rgt) interfaceC1891350zJl;
        super.onBindItemView(c1598170rgt);
        this.LLILLL = c1598170rgt.LL ? 1 : 0;
        TuxIconView tuxIconView = this.LL;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(c1598170rgt.LLILLJJLI);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1598170rgt.LLILLL);
        }
        C1387040mCM.LIZ(this.itemView, new AwS459S0200000_24(this, c1598170rgt, 9));
        if (c1598170rgt.LL && C1840470xzh.LIZ().getLong("keva_key_widget_guide_appear_time", -1L) < 0) {
            C1840470xzh.LIZ().storeLong("keva_key_widget_guide_appear_time", System.currentTimeMillis());
        }
        TuxIconView tuxIconView2 = this.LL;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AbS703S0100000_24(this, 17), tuxIconView2);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1618440sDa.LIZIZ.LJJ().LIZLLL(viewGroup.getContext(), null, R.layout.r7, viewGroup, false);
    }
}
