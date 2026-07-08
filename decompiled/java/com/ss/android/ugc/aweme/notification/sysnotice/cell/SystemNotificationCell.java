package com.ss.android.ugc.aweme.notification.sysnotice.cell;

import X.C01GW;
import X.C098200Yq;
import X.C0OPQ;
import X.C0OPX;
import X.C1075780e6K;
import X.C123100dR;
import X.C1246460iXc;
import X.C1246520iXi;
import X.C1246530iXj;
import X.C1388190mED;
import X.C13BV;
import X.C1618770sE7;
import X.C1720106oR;
import X.C189200o6;
import X.C1907070zj7;
import X.C1907410zjf;
import X.C1907420zjg;
import X.C1907430zjh;
import X.C1907440zji;
import X.C1907450zjj;
import X.C1907460zjk;
import X.C1907480zjm;
import X.C1907600zjy;
import X.C1907940zkW;
import X.C19724912Fj;
import X.C1AF0;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C262040AOs;
import X.C340400DWc;
import X.C384050F3z;
import X.C418440Gaw;
import X.C443090HZb;
import X.C452501pT;
import X.C635440OwA;
import X.C635610OwR;
import X.C686150Qvl;
import X.C786410Ut5;
import X.C800330VaR;
import X.C814420VxA;
import X.C866950Xzh;
import X.EnumC1246450iXb;
import X.EnumC1905020zfo;
import X.EnumC1907390zjd;
import X.EnumC1907470zjl;
import X.InterfaceC1891350zJl;
import X.InterfaceC1906920zis;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCombineSetting;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notification.perf.NoticeVideoManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class SystemNotificationCell extends PowerCell<C1246520iXi> implements View.OnClickListener {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 332));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 333));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 330));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 329));

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.a_w;
    }

    public final void I5() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((Number) C262040AOs.LIZ.getValue()).intValue() == 1) {
            ViewGroup.LayoutParams layoutParams = P5().getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
                return;
            }
            if (P5().getHasAction()) {
                marginLayoutParams.height = -2;
                if (!C635610OwR.LIZ()) {
                    marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                }
            } else {
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.height = 0;
            }
            C1907430zjh c1907430zjhP5 = P5();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1907430zjhP5);
            c1907430zjhP5.setLayoutParams(marginLayoutParams);
        }
    }

    public final C1907430zjh P5() {
        return (C1907430zjh) this.LLILZ.getValue();
    }

    public final C1907480zjm R5() {
        return (C1907480zjm) this.LLILLL.getValue();
    }

    public final List<C443090HZb> S5() {
        NoticeChannelInfo noticeChannelInfo;
        GroupUnsubscribeSetting next;
        SubscribeCombineSetting subscribeCombineSetting;
        C1246520iXi item = getItem();
        if (item == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        MusNotice musNotice = item.LL;
        if (!C635610OwR.LIZ()) {
            c6(musNotice, arrayList, item);
            d6(musNotice, arrayList, item);
            return arrayList;
        }
        d6(musNotice, arrayList, item);
        if (musNotice.supportUnsubscribe() && (noticeChannelInfo = musNotice.channelInfo) != null) {
            int i = noticeChannelInfo.group;
            List<GroupUnsubscribeSetting> list = C635440OwA.LIZ;
            if (list != null) {
                Iterator<GroupUnsubscribeSetting> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next.group == i) {
                        break;
                    }
                }
                GroupUnsubscribeSetting groupUnsubscribeSetting = next;
                if (groupUnsubscribeSetting != null && (subscribeCombineSetting = groupUnsubscribeSetting.subscribeCombineSetting) != null && C866950Xzh.LIZIZ(subscribeCombineSetting.categorySettings)) {
                    arrayList.add(new C443090HZb(C1618770sE7.LIZJ(2131849509), new AwS135S0201000_9(this, i, groupUnsubscribeSetting, 1), R.raw.icon_gear, null, 0, null, 0, false, false, null, 760));
                }
            }
        }
        c6(musNotice, arrayList, item);
        return arrayList;
    }

    public final Context T5() {
        return this.itemView.getContext();
    }

    public final void L5() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (C635610OwR.LIZ()) {
            ViewGroup.LayoutParams layoutParams = P5().getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                C1907430zjh c1907430zjhP5 = P5();
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1907430zjhP5);
                c1907430zjhP5.setLayoutParams(marginLayoutParams2);
            }
            ViewGroup.LayoutParams layoutParams2 = R5().getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            C1907480zjm c1907480zjmR5 = R5();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1907480zjmR5);
            c1907480zjmR5.setLayoutParams(marginLayoutParams);
        }
    }

    public final void U5() {
        MusNotice musNotice;
        List<InterfaceC1906920zis> list;
        C1246520iXi item = getItem();
        if (item == null || (musNotice = item.LL) == null) {
            return;
        }
        C1246520iXi item2 = getItem();
        C1907600zjy c1907600zjy = new C1907600zjy(musNotice, item2 != null ? item2.LLILLL : 0, true);
        C1246520iXi item3 = getItem();
        if (item3 == null || (list = item3.LLILLJJLI) == null) {
            return;
        }
        Iterator<InterfaceC1906920zis> it2 = list.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1907600zjy);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(this, this.itemView.findViewById(R.id.ww7));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        MusNotice musNotice;
        Function2<MusNotice, Function0<Unit>, Unit> function2;
        super.onViewAttachedToWindow();
        C1246520iXi item = getItem();
        if (item == null || (musNotice = item.LL) == null) {
            return;
        }
        try {
            C1246520iXi item2 = getItem();
            if (item2 == null || (function2 = item2.LLILZLL) == null) {
                return;
            }
            function2.invoke(musNotice, new AwS572S0100000_28(this, 331));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.SHOW;
            c1246460iXc.getClass();
            throw C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, e, null);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        ((C1907420zjg) this.LLILLJJLI.getValue()).LIZLLL();
        R5().z0();
        P5().LIZJ();
    }

    public static void N5(C1246520iXi c1246520iXi) {
        String str;
        String str2;
        NoticeUITemplate noticeUITemplate;
        NoticeUITemplate noticeUITemplate2;
        String str3;
        GeneralTemplateNotice generalTemplateNotice = c1246520iXi.LL.templateNotice;
        if (generalTemplateNotice == null || (str3 = generalTemplateNotice.schemaUrl) == null || str3.length() == 0) {
            GeneralTemplateNotice generalTemplateNotice2 = c1246520iXi.LL.templateNotice;
            if (generalTemplateNotice2 != null && (noticeUITemplate2 = generalTemplateNotice2.uiTemplate) != null) {
                str = noticeUITemplate2.rightSchemaUrl;
            } else {
                str = null;
            }
            if (!C123100dR.LIZ(str)) {
                GeneralTemplateNotice generalTemplateNotice3 = c1246520iXi.LL.templateNotice;
                if (generalTemplateNotice3 != null && (noticeUITemplate = generalTemplateNotice3.uiTemplate) != null) {
                    str2 = noticeUITemplate.bannerSchemaUrl;
                } else {
                    str2 = null;
                }
                if (!C123100dR.LIZ(str2)) {
                    return;
                }
            }
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            MusNotice musNotice = c1246520iXi.LL;
            c1246460iXc.getClass();
            C1246460iXc.LIZ(musNotice, "no_schema_url_error", null);
        }
    }

    public final void W5(String str) {
        MusNotice musNotice;
        if (str.length() == 0) {
            return;
        }
        Uri uriLIZLLL = C1907940zkW.LIZLLL(str);
        MusNotice musNotice2 = null;
        if (uriLIZLLL == null) {
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            C1246520iXi item = getItem();
            if (item != null) {
                musNotice = item.LL;
            } else {
                musNotice = null;
            }
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.CLICK;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid router url: ");
            sbLIZ.append(str);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            c1246460iXc.getClass();
            C1AF0.LJ(C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, illegalArgumentException, null));
            return;
        }
        C1246520iXi item2 = getItem();
        if (item2 != null) {
            musNotice2 = item2.LL;
        }
        try {
            Activity activityLIZ = C1388190mED.LIZ(T5());
            if (activityLIZ != null) {
                C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
                NoticeVideoManager noticeVideoManager = NoticeVideoManager.LL;
                C686150Qvl c686150Qvl = new C686150Qvl(str);
                String strLIZIZ = C1907940zkW.LIZIZ(uriLIZLLL, "show_comment");
                if (strLIZIZ == null) {
                    strLIZIZ = CardStruct.IStatusCode.DEFAULT;
                }
                c686150Qvl.LIZIZ("comment_force_open_reply", strLIZIZ);
                String strLIZIZ2 = C1907940zkW.LIZIZ(uriLIZLLL, "enter_method");
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = "click";
                }
                c686150Qvl.LIZIZ("enter_method", strLIZIZ2);
                noticeVideoManager.getClass();
                NoticeVideoManager.LIZLLL(c686150Qvl, str);
                c19724912FjLIZLLL.LJI(activityLIZ, c686150Qvl.LIZJ());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc2 = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb2 = EnumC1246450iXb.CLICK;
            c1246460iXc2.getClass();
            throw C1246460iXc.LIZIZ(musNotice2, enumC1246450iXb2, e, null);
        }
    }

    public final void b6(String str) {
        String strLIZIZ;
        Uri uriLIZLLL;
        String strLIZIZ2;
        int i;
        int i2;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C1246520iXi item = getItem();
            if (item == null || (strLIZIZ = C1907410zjf.LIZIZ(item)) == null || (uriLIZLLL = C1907940zkW.LIZLLL(strLIZIZ)) == null || (strLIZIZ2 = C1907940zkW.LIZIZ(uriLIZLLL, "bulletin_board_id")) == null) {
                return;
            }
            String strLIZIZ3 = C1907940zkW.LIZIZ(uriLIZLLL, "bulletin_account_status");
            if (strLIZIZ3 != null) {
                i = CastIntegerProtector.parseInt(strLIZIZ3);
            } else {
                i = 1;
            }
            String strLIZIZ4 = C1907940zkW.LIZIZ(uriLIZLLL, "is_subscribed");
            if (strLIZIZ4 != null) {
                i2 = CastIntegerProtector.parseInt(strLIZIZ4);
            } else {
                i2 = -1;
            }
            linkedHashMap.put("enter_from", "official_message_page");
            linkedHashMap.put("action_type", str);
            if (Intrinsics.LJFF(str, "click")) {
                linkedHashMap.put("click_type", "enter_cell");
            }
            linkedHashMap.put("channel_status", String.valueOf(i));
            linkedHashMap.put("is_subscribed", String.valueOf(i2));
            C0OPQ c0opq = C0OPQ.LIZ;
            Boolean bool = Boolean.FALSE;
            c0opq.getClass();
            C0OPQ.LJ(bool, strLIZIZ2, linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("entrance cell report failed: ");
            sbLIZ.append(e);
            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1246520iXi c1246520iXi = (C1246520iXi) interfaceC1891350zJl;
        MusNotice musNotice = c1246520iXi.LL;
        try {
            super.onBindItemView(c1246520iXi);
            U5();
            try {
                String strLIZIZ = C1907410zjf.LIZIZ(c1246520iXi);
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    View view = (View) this.LL.getValue();
                    if (view != null) {
                        view.setBackground(C800330VaR.LIZIZ(T5(), R.drawable.ah7));
                    }
                } else {
                    View view2 = (View) this.LL.getValue();
                    if (view2 != null) {
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZJ = Float.valueOf(T5().getResources().getDimensionPixelSize(R.dimen.ay));
                        c384050F3z.LIZ = Integer.valueOf(C1618770sE7.LIZ(R.attr.zq));
                        view2.setBackground(c384050F3z.LIZ(T5()));
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            ((C1907420zjg) this.LLILLJJLI.getValue()).LIZ(c1246520iXi, S5());
            R5().setIncreaseClickAreaMethod(new C340400DWc(this));
            R5().i0(c1246520iXi, new C1907440zji(this));
            P5().LIZ(c1246520iXi, new C1907450zjj(this));
            L5();
            I5();
            N5(c1246520iXi);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.SHOW;
            c1246460iXc.getClass();
            throw C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, e, null);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MusNotice musNotice;
        MusNotice musNotice2;
        if (view == null) {
            return;
        }
        C1246520iXi item = getItem();
        String strLIZIZ = null;
        if (item != null) {
            musNotice = item.LL;
        } else {
            musNotice = null;
        }
        try {
            C1246520iXi item2 = getItem();
            if (item2 != null) {
                strLIZIZ = C1907410zjf.LIZIZ(item2);
            }
            if (strLIZIZ != null && strLIZIZ.length() != 0) {
                a6(view, strLIZIZ, EnumC1907470zjl.ROOT);
                return;
            }
            C1246520iXi item3 = getItem();
            if (item3 != null && (musNotice2 = item3.LL) != null) {
                musNotice2.hasRead = true;
            }
            ((C1907420zjg) this.LLILLJJLI.getValue()).LIZJ();
            R5().n0();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.CLICK;
            c1246460iXc.getClass();
            throw C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, e, null);
        }
    }

    public final void X5(EnumC1905020zfo enumC1905020zfo, EnumC1907470zjl enumC1907470zjl) {
        String str;
        String str2;
        C1246520iXi item = getItem();
        if (item == null) {
            return;
        }
        MusNotice musNotice = item.LL;
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
            Integer numValueOf = null;
            if (generalTemplateNotice != null) {
                str = generalTemplateNotice.messageExtra;
            } else {
                str = null;
            }
            c2344009Gk.LJII(C1075780e6K.LIZ(str));
            C1907410zjf.LIZ(c2344009Gk, item);
            c2344009Gk.LJFF("action_type", enumC1905020zfo.getValue());
            if (enumC1905020zfo == EnumC1905020zfo.Show) {
                str2 = "";
            } else if (C1907460zjk.LIZ[enumC1907470zjl.ordinal()] == 1) {
                str2 = "view_more";
            } else {
                str2 = "click_content";
            }
            c2344009Gk.LJFF("enter_method", str2);
            c2344009Gk.LJFF("category_type", String.valueOf(musNotice.channelCategory));
            c2344009Gk.LJFF("subscribe_status", musNotice.unsubscribeStatusToMob());
            C1246520iXi item2 = getItem();
            if (item2 != null) {
                numValueOf = Integer.valueOf(item2.LLILLL);
            }
            c2344009Gk.LJ(numValueOf, "client_order");
            c2344009Gk.LIZLLL(musNotice.createTime, "message_time");
            c2344009Gk.LJFF("page_name", "official_message_mix");
            C20684815ws.LJIILLIIL("official_message_inner_message", c2344009Gk.LIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C2187451AjH.LIZ;
            C1720106oR.LIZLLL(e);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C1246520iXi c1246520iXi = (C1246520iXi) interfaceC1891350zJl;
        MusNotice musNotice = c1246520iXi.LL;
        try {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next instanceof C1246530iXj) {
                    if (next != null) {
                        ((C1907420zjg) this.LLILLJJLI.getValue()).LIZIZ(c1246520iXi, S5());
                        R5().LLJ = c1246520iXi;
                        return;
                    }
                }
            }
            super.onBindItemView(c1246520iXi, list);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.SHOW;
            c1246460iXc.getClass();
            throw C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, e, null);
        }
    }

    public static void c6(MusNotice musNotice, List list, C1246520iXi c1246520iXi) {
        GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
        if (generalTemplateNotice != null && !generalTemplateNotice.shouldKeep) {
            ArrayList arrayList = (ArrayList) list;
            arrayList.add(new C443090HZb(C1618770sE7.LIZJ(2131849510), new AwS572S0100000_28(c1246520iXi, 334), R.raw.icon_trash_bin, null, 0, null, C635610OwR.LIZ() ? 1 : 0, false, false, null, 696));
        }
    }

    public final boolean V5(View view, String str, EnumC1907470zjl enumC1907470zjl) {
        MusNotice musNotice;
        GeneralTemplateNotice generalTemplateNotice;
        EnumC1907390zjd enumC1907390zjd;
        int i;
        List<InterfaceC1906920zis> list;
        C1246520iXi item = getItem();
        if (item != null && (musNotice = item.LL) != null && (generalTemplateNotice = musNotice.templateNotice) != null) {
            int i2 = C1907460zjk.LIZ[enumC1907470zjl.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    enumC1907390zjd = EnumC1907390zjd.Middle;
                } else {
                    enumC1907390zjd = EnumC1907390zjd.Right;
                }
            } else {
                enumC1907390zjd = EnumC1907390zjd.Root;
            }
            C1246520iXi item2 = getItem();
            if (item2 != null) {
                i = item2.LLILLL;
            } else {
                i = 0;
            }
            C1907070zj7 c1907070zj7 = new C1907070zj7(generalTemplateNotice, view, str, enumC1907390zjd, i, "official_message_mix", true, generalTemplateNotice.LIZIZ, null);
            C1246520iXi item3 = getItem();
            if (item3 != null && (list = item3.LLILLJJLI) != null) {
                Iterator<InterfaceC1906920zis> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (it2.next().LIZIZ(c1907070zj7)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void a6(View view, String str, EnumC1907470zjl enumC1907470zjl) {
        MusNotice musNotice;
        MusNotice musNotice2;
        MusNotice musNotice3;
        if (view == null) {
            return;
        }
        C1246520iXi item = getItem();
        String templateId = null;
        if (item != null) {
            musNotice = item.LL;
        } else {
            musNotice = null;
        }
        try {
            C1246520iXi item2 = getItem();
            if (item2 != null && (musNotice3 = item2.LL) != null) {
                musNotice3.hasRead = true;
            }
            ((C1907420zjg) this.LLILLJJLI.getValue()).LIZJ();
            C1246520iXi item3 = getItem();
            if (item3 != null && (musNotice2 = item3.LL) != null) {
                templateId = musNotice2.getTemplateId();
            }
            if (Intrinsics.LJFF(templateId, "Tpl_TikTok_6435")) {
                b6("click");
            }
            if (!V5(view, str, enumC1907470zjl)) {
                W5(str);
            }
            X5(EnumC1905020zfo.Click, enumC1907470zjl);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1246460iXc c1246460iXc = C1246460iXc.LIZ;
            EnumC1246450iXb enumC1246450iXb = EnumC1246450iXb.CLICK;
            c1246460iXc.getClass();
            throw C1246460iXc.LIZIZ(musNotice, enumC1246450iXb, e, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r19, java.util.List<X.C443090HZb> r20, X.C1246520iXi r21) {
        /*
            r18 = this;
            r3 = r20
            r5 = r19
            boolean r0 = r5.supportUnsubscribe()
            r1 = 1
            if (r0 != r1) goto L58
            boolean r0 = r5.isUnsubscribe()
            r6 = 0
            if (r0 != r1) goto L79
            r4 = 1
        L13:
            java.lang.String r0 = r5.categoryTitle
            if (r0 == 0) goto L2a
            if (r4 == 0) goto L69
            android.content.Context r2 = r18.T5()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r0
            r0 = 2131849512(0x7f117128, float:1.933256E38)
            java.lang.String r7 = r2.getString(r0, r1)
        L28:
            if (r7 != 0) goto L37
        L2a:
            if (r4 == 0) goto L5d
            android.content.Context r1 = r18.T5()
            r0 = 2131837849(0x7f114399, float:1.9308905E38)
            java.lang.String r7 = r1.getString(r0)
        L37:
            if (r4 == 0) goto L59
            r9 = 2130772547(0x7f010243, float:1.7148215E38)
        L3c:
            X.0HZb r6 = new X.0HZb
            kotlin.jvm.internal.AwS105S0210000_28 r8 = new kotlin.jvm.internal.AwS105S0210000_28
            r0 = 2
            r1 = r21
            r8.<init>(r1, r5, r4, r0)
            r10 = 0
            r11 = 0
            r17 = 760(0x2f8, float:1.065E-42)
            r12 = r10
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r10
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r6)
        L58:
            return
        L59:
            r9 = 2130774986(0x7f010bca, float:1.7153162E38)
            goto L3c
        L5d:
            android.content.Context r1 = r18.T5()
            r0 = 2131837848(0x7f114398, float:1.9308903E38)
            java.lang.String r7 = r1.getString(r0)
            goto L37
        L69:
            android.content.Context r2 = r18.T5()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r6] = r0
            r0 = 2131849511(0x7f117127, float:1.9332558E38)
            java.lang.String r7 = r2.getString(r0, r1)
            goto L28
        L79:
            r4 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.sysnotice.cell.SystemNotificationCell.d6(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, java.util.List, X.0iXi):void");
    }
}
