package com.ss.android.ugc.aweme.notification.vh;

import X.AbstractC1906870zin;
import X.AbstractViewOnClickListenerC1907000zj0;
import X.C01GW;
import X.C1242270iQr;
import X.C1242450iR9;
import X.C1243340iSa;
import X.C1245020iVI;
import X.C1360500lVY;
import X.C13BV;
import X.C13LP;
import X.C1440005kM;
import X.C1570820qym;
import X.C1900870zZ7;
import X.C1903780zdo;
import X.C1905050zfr;
import X.C1905080zfu;
import X.C1905130zfz;
import X.C1906140zhc;
import X.C1906860zim;
import X.C1906880zio;
import X.C1907110zjB;
import X.C1907120zjC;
import X.C1907160zjG;
import X.C1907300zjU;
import X.C1907530zjr;
import X.C1907600zjy;
import X.C418440Gaw;
import X.C424560Gko;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1154130g8h;
import X.EnumC1260920iuw;
import X.EnumC1905020zfo;
import X.EnumC1906160zhe;
import X.EnumC1906270zhp;
import X.EnumC1906770zid;
import X.EnumC624380OeK;
import X.InterfaceC1906840zik;
import X.InterfaceC1906920zis;
import X.InterfaceC1907020zj2;
import X.InterfaceC1907310zjV;
import Y.AObserverS230S0100000_28;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeGroupAttrs;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class MTTemplateNotificationHolder extends AbstractC1906870zin implements InterfaceC1907020zj2, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJI = 0;
    public final Function1<Integer, Unit> LL;
    public MusNotice LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public String LLIZ;
    public List<? extends InterfaceC1906920zis> LLIZLLLIL;
    public C1905130zfz LLJ;
    public String LLJI;
    public String LLJIJIL;
    public NotificationDetailVM LLJILJIL;
    public C1242270iQr LLJILJILJ;
    public boolean LLJILLL;
    public final C01GW LLJJ;

    @Override // X.InterfaceC1907020zj2
    public final View.OnLongClickListener c2() {
        return this;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getEnterMethod() {
        return "notification";
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1907020zj2
    public final HashMap<String, String> D1() {
        String string;
        HashMap<String, String> map = new HashMap<>();
        BaseNotice baseNotice = this.mMTBaseNotice;
        map.put("account_type", baseNotice != null ? baseNotice.getAccountType() : null);
        String str = C1900870zZ7.LIZ;
        if (str != null) {
            map.put("inbox_position", str);
        }
        BaseNotice baseNotice2 = this.mMTBaseNotice;
        if (baseNotice2 == null || (string = Integer.valueOf(baseNotice2.type).toString()) == null) {
            string = "";
        }
        map.put("notice_message_type", string);
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik != null) {
            interfaceC1906840zik.Dx2();
        }
        map.put("sort_option_name", null);
        InterfaceC1906840zik interfaceC1906840zik2 = this.vm;
        if (interfaceC1906840zik2 != null) {
            interfaceC1906840zik2.Dx2();
        }
        map.put("notification_tab_name", null);
        return map;
    }

    @Override // X.InterfaceC1907020zj2
    public final void LJJIL() {
        Function1<Integer, Unit> function1 = this.LL;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(getWrappedAdapterPosition()));
        }
    }

    public final void R5() {
        MusNotice musNotice = this.LLILLJJLI;
        if (musNotice != null) {
            C1907600zjy c1907600zjy = new C1907600zjy(musNotice, this.LLILZLL, this.LLILZ);
            Iterator<? extends InterfaceC1906920zis> it2 = this.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(c1907600zjy);
            }
        }
    }

    @Override // X.InterfaceC1907020zj2
    public final void a4() {
        MusNotice musNotice = this.LLILLJJLI;
        if (musNotice != null) {
            musNotice.hasRead = true;
            GeneralTemplateNotice generalTemplateNotice = musNotice.templateNotice;
            if (generalTemplateNotice != null) {
                generalTemplateNotice.hasRead = true;
            }
        }
    }

    @Override // X.AbstractC1906870zin
    public final Observer<C1243340iSa> createAliasObserver() {
        return new AObserverS230S0100000_28(this, 37);
    }

    @Override // X.InterfaceC1907020zj2
    public final String getAccountType() {
        MusNotice musNotice = this.LLILLJJLI;
        if (musNotice != null) {
            return musNotice.getAccountType();
        }
        return null;
    }

    @Override // X.AbstractC1906870zin
    public final User getUserFromNotice() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        MusNotice musNotice = this.LLILLJJLI;
        if (musNotice == null || (generalTemplateNotice = musNotice.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || list.size() != 1) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    @Override // X.AbstractC1906870zin
    public final boolean isFromAggregatedAvatar() {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        Integer numValueOf;
        MusNotice musNotice = this.LLILLJJLI;
        return (musNotice == null || (generalTemplateNotice = musNotice.templateNotice) == null || (noticeUITemplate = generalTemplateNotice.uiTemplate) == null || (titleTemplate = noticeUITemplate.titleTemplate) == null || (list = titleTemplate.fromUsers) == null || (numValueOf = Integer.valueOf(list.size())) == null || numValueOf.intValue() <= 1) ? false : true;
    }

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final boolean needLongClick() {
        GeneralTemplateNotice generalTemplateNotice;
        MusNotice musNotice = this.LLILLJJLI;
        return (musNotice == null || (generalTemplateNotice = musNotice.templateNotice) == null || generalTemplateNotice.shouldKeep) ? false : true;
    }

    @Override // X.InterfaceC1907020zj2
    public final InterfaceC1907310zjV u0() {
        return (InterfaceC1907310zjV) this.LLJJ.getValue();
    }

    @Override // X.AbstractC1906850zil
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik != null) {
            interfaceC1906840zik.UJ(this.LLILLJJLI, new AwS572S0100000_28(this, 463));
            return;
        }
        NotificationDetailVM notificationDetailVM = this.LLJILJIL;
        if (notificationDetailVM != null) {
            notificationDetailVM.UJ(this.LLILLJJLI, new AwS572S0100000_28(this, 464));
        }
    }

    @Override // X.ViewOnClickListenerC1906680ziU
    public final LifecycleOwner requireLifeCycleOwner() {
        return super.requireLifeCycleOwner();
    }

    @Override // X.InterfaceC1907020zj2
    public final EnumC1906770zid LJJLIIIJLJLI() {
        return this.imgInfo;
    }

    @Override // X.InterfaceC1907020zj2
    public final int Q4() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1907020zj2
    public final C1905130zfz S0() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1907020zj2
    public final Fragment getCurFragment() {
        return this.mFragment;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getEnterFrom() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1907020zj2
    public final List<InterfaceC1906920zis> getInterceptors() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getPageName() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1907020zj2
    public final EnumC1906270zhp getScenario() {
        return this.scenario;
    }

    @Override // X.InterfaceC1907020zj2
    public final String getTabName() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1907020zj2
    public final String i0() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1907020zj2
    public final boolean i3() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1907020zj2
    public final String v5() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1907020zj2
    public final void LLD(EnumC1154130g8h enumC1154130g8h) {
        S5(EnumC1905020zfo.Click, enumC1154130g8h);
        a4();
        onItemClickFinish();
    }

    public final void N5(SmartRoute smartRoute) {
        C1905050zfr c1905050zfr;
        BaseNotice baseNotice;
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        C1905130zfz c1905130zfz = this.LLJ;
        if (c1905130zfz != null && (c1905050zfr = c1905130zfz.LIZIZ) != null && c1905050zfr.LJFF && (baseNotice = this.mMTBaseNotice) != null && (generalTemplateNotice = baseNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null) {
            smartRoute.withParam("recommend_enter_profile_params", recommendParamsOfUser(user, EnumC1260920iuw.INBOX_NOTICE));
        }
    }

    @Override // X.AbstractC1906850zil
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        C1907120zjC c1907120zjC = (C1907120zjC) this.itemView.findViewById(R.id.pf0);
        applyCoverSize(i, c1907120zjC.getRightNotificationCoverFromXml());
        applyCoverSize(i, c1907120zjC.getRightNotificationCoverWithIconFromXml().getNotificationStickerCoverFromXml());
        ViewGroup.LayoutParams layoutParams = c1907120zjC.getRightNotificationCoverWithIconFromXml().getLayoutParams();
        layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) + i;
        layoutParams.height = i + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    @Override // X.AbstractC1906870zin, X.AbstractC1906850zil
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void applyNewStyle(X.C1906880zio r6) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder.applyNewStyle(X.0zio):void");
    }

    @Override // X.InterfaceC1907020zj2
    public final boolean c3(String str) {
        GeneralTemplateNotice generalTemplateNotice;
        NoticeUITemplate noticeUITemplate;
        TitleTemplate titleTemplate;
        List<User> list;
        User user;
        String accountType;
        MusNotice musNotice = this.LLILLJJLI;
        if (musNotice != null && (generalTemplateNotice = musNotice.templateNotice) != null && (noticeUITemplate = generalTemplateNotice.uiTemplate) != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list = titleTemplate.fromUsers) != null && (user = (User) C13LP.LJJJLL(list)) != null && C1245020iVI.LIZLLL(user)) {
            String str2 = C1900870zZ7.LIZ;
            EnumC1260920iuw enumC1260920iuw = EnumC1260920iuw.RELATION_LABEL;
            BaseNotice baseNotice = this.mMTBaseNotice;
            if (baseNotice != null) {
                accountType = baseNotice.getAccountType();
            } else {
                accountType = null;
            }
            enterProfileWithRecommendParams(user, "notification_page", str2, enumC1260920iuw, true, accountType);
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r21) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder.onClick(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    @Override // X.InterfaceC1907020zj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(android.view.View r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r0 = r10.LLILLJJLI
            r9 = 0
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r3 = r0.templateNotice
            if (r3 == 0) goto L4e
            java.lang.Long r2 = r3.nid     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L3d
            r2.longValue()     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.notice.repo.list.bean.ActionToReportStruct r0 = r3.actions     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3d
            boolean r1 = r0.click     // Catch: java.lang.Throwable -> L3f
            r0 = 1
            if (r1 != r0) goto L3d
            long r5 = r2.longValue()     // Catch: java.lang.Throwable -> L3f
            com.ss.android.ugc.aweme.notification.api.NotificationApi$Api r4 = com.ss.android.ugc.aweme.notification.api.NotificationApi.LIZ()     // Catch: java.lang.Throwable -> L3f
            X.0565 r0 = X.AnonymousClass0565.NOTICE_ACTION_CLICK     // Catch: java.lang.Throwable -> L3f
            int r7 = r0.getValue()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r8 = r3.actionMeta     // Catch: java.lang.Throwable -> L3f
            X.11NZ r1 = r4.reportNoticeAction(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L3f
            X.11RO r0 = X.C11S5.LIZ()     // Catch: java.lang.Throwable -> L3f
            X.11Hw r0 = r1.LJL(r0)     // Catch: java.lang.Throwable -> L3f
            X.01kM r0 = r0.LJJLJ()     // Catch: java.lang.Throwable -> L3f
        L39:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L3f
            goto L4b
        L3d:
            r0 = r9
            goto L39
        L3f:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L4b:
            X.C189200o6.m1boximpl(r0)
        L4e:
            r10.onItemClick()
            r10.markHasRead(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder.q(android.view.View):void");
    }

    @Override // X.InterfaceC1907020zj2
    public final void v(int i) {
        EnumC624380OeK enumC624380OeK;
        NoticeGroupAttrs noticeGroupAttrsLJI = C1903780zdo.LJI(i);
        if (noticeGroupAttrsLJI != null) {
            enumC624380OeK = noticeGroupAttrsLJI.clearOccasion;
        } else {
            enumC624380OeK = null;
        }
        if (enumC624380OeK == EnumC624380OeK.AfterClick && C1903780zdo.LJIIJJI(i)) {
            C1903780zdo.LIZJ(i);
            C1440005kM.LIZ(new C1570820qym());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MTTemplateNotificationHolder(View view, Function1<? super Integer, Unit> function1) {
        Lifecycle lifecycle;
        super(view);
        this.LL = function1;
        this.LLILZLL = -1;
        this.LLIZ = "";
        this.LLIZLLLIL = C13BV.INSTANCE;
        this.LLJILLL = true;
        this.LLJJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(315));
        C786410Ut5.I7(this, view);
        view.setOnLongClickListener(this);
        C1906140zhc c1906140zhc = C1906140zhc.LIZ;
        View viewFindViewById = view.findViewById(R.id.pf1);
        EnumC1906160zhe enumC1906160zhe = EnumC1906160zhe.CELL;
        c1906140zhc.getClass();
        C1906140zhc.LIZ(viewFindViewById, enumC1906160zhe, 0.0f);
        LifecycleOwner lifecycleOwnerRequireLifeCycleOwner = super.requireLifeCycleOwner();
        if (lifecycleOwnerRequireLifeCycleOwner != null && (lifecycle = lifecycleOwnerRequireLifeCycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x01d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(X.EnumC1905020zfo r15, X.EnumC1154130g8h r16) {
        /*
            Method dump skipped, instruction units count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder.S5(X.0zfo, X.0g8h):void");
    }

    @Override // X.C1906860zim
    public final void onNameClicked(View view, User user, int i) {
        q(view);
    }

    @Override // X.InterfaceC1907020zj2
    public final C1360500lVY LLILLL(List list, Integer num, MusNotice musNotice, String str) {
        return getClickableNameSpan(list, num, musNotice, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[PHI: r1
      0x0048: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:17:0x0046, B:15:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[PHI: r1
      0x0063: PHI (r1v10 java.lang.String) = (r1v3 java.lang.String), (r1v11 java.lang.String) binds: [B:10:0x0033, B:8:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1907020zj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s4(com.ss.android.ugc.aweme.profile.model.User r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
        /*
            r5 = this;
            X.09Gk r4 = new X.09Gk
            r4.<init>()
            java.lang.String r1 = r5.LLILZIL
            java.lang.String r0 = "enter_from"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "position"
            r4.LJIIIIZZ(r0, r8)
            java.lang.String r0 = "account_type"
            r4.LJIIIIZZ(r0, r9)
            if (r6 == 0) goto L68
            java.lang.String r1 = r6.getUid()
        L1c:
            java.lang.String r0 = "to_user_id"
            r4.LJIIIIZZ(r0, r1)
            java.lang.String r0 = "enter_method"
            r4.LJIIIIZZ(r0, r7)
            X.1D0F r3 = X.C1D0F.LIZ
            java.lang.String r2 = ""
            if (r3 == 0) goto L32
            java.lang.String r1 = r3.LIZ()
            if (r1 != 0) goto L63
        L32:
            r1 = r2
            if (r3 != 0) goto L63
            r0 = 0
        L36:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.LJ(r0, r1)
            if (r3 == 0) goto L45
            java.lang.String r1 = r3.LIZIZ()
            if (r1 != 0) goto L48
        L45:
            r1 = r2
            if (r3 == 0) goto L4f
        L48:
            java.lang.String r0 = r3.LIZJ()
            if (r0 == 0) goto L4f
            r2 = r0
        L4f:
            r4.LJIIIIZZ(r1, r2)
            java.lang.String r2 = "profile_entrance_id"
            long r0 = java.lang.System.currentTimeMillis()
            r4.LIZLLL(r0, r2)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "enter_personal_detail"
            X.C20684815ws.LJIILLIIL(r0, r1)
            return
        L63:
            boolean r0 = r3.isConnected()
            goto L36
        L68:
            r1 = 0
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.vh.MTTemplateNotificationHolder.s4(com.ss.android.ugc.aweme.profile.model.User, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // X.InterfaceC1907020zj2
    public final void l5(String str, String str2, BaseNotice baseNotice, boolean z, C1242270iQr c1242270iQr) {
        String enterFrom;
        C1242450iR9 c1242450iR9 = C1906860zim.Companion;
        InterfaceC1906840zik interfaceC1906840zik = this.vm;
        if (interfaceC1906840zik != null) {
            enterFrom = interfaceC1906840zik.getEnterFrom();
        } else {
            enterFrom = null;
        }
        C1242450iR9.LIZ(c1242450iR9, str, str2, enterFrom, baseNotice, z, this.LLILZIL, D1(), c1242270iQr, null, null, 768);
    }

    @Override // X.InterfaceC1907020zj2
    public final void x5(TuxTextView tuxTextView, List list, Integer num, MusNotice musNotice, String str) {
        setTemplateClickableNameText(tuxTextView, list, num, musNotice, str);
    }

    public static void P5(MTTemplateNotificationHolder mTTemplateNotificationHolder, MusNotice musNotice, int i, String str, String str2, String str3, boolean z, List list, boolean z2, String str4, C1242270iQr c1242270iQr, String str5, C1906880zio c1906880zio, int i2) {
        MusNotice musNotice2;
        GeneralTemplateNotice generalTemplateNotice;
        boolean z3 = z2;
        C1906880zio c1906880zio2 = c1906880zio;
        String str6 = str5;
        C1242270iQr c1242270iQr2 = c1242270iQr;
        String str7 = str4;
        boolean z4 = false;
        if ((i2 & 256) != 0) {
            z3 = false;
        }
        UrlModel urlModel = null;
        if ((i2 & 512) != 0) {
            str7 = null;
        }
        if ((i2 & 1024) != 0) {
            c1242270iQr2 = null;
        }
        if ((i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str6 = null;
        }
        if ((i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c1906880zio2 = null;
        }
        mTTemplateNotificationHolder.LLILLJJLI = musNotice;
        mTTemplateNotificationHolder.LLILLL = str2;
        mTTemplateNotificationHolder.LLILZ = z;
        mTTemplateNotificationHolder.LLILZIL = str3;
        mTTemplateNotificationHolder.LLJI = str7;
        mTTemplateNotificationHolder.LLJIJIL = str6;
        mTTemplateNotificationHolder.LLIZ = str;
        mTTemplateNotificationHolder.LLILZLL = i;
        mTTemplateNotificationHolder.LLJILJILJ = c1242270iQr2;
        mTTemplateNotificationHolder.LLIZLLLIL = list;
        C1905130zfz c1905130zfzLIZ = C1905080zfu.LIZ(musNotice);
        mTTemplateNotificationHolder.LLJ = c1905130zfzLIZ;
        if (c1905130zfzLIZ != null) {
            c1905130zfzLIZ.LIZJ();
        }
        ((AbstractViewOnClickListenerC1907000zj0) mTTemplateNotificationHolder.itemView.findViewById(R.id.peb)).LIZ(musNotice, mTTemplateNotificationHolder, c1242270iQr2);
        ((C1907160zjG) mTTemplateNotificationHolder.itemView.findViewById(R.id.peh)).setCanShowRelationLabel(mTTemplateNotificationHolder.LLJILLL);
        ((AbstractViewOnClickListenerC1907000zj0) mTTemplateNotificationHolder.itemView.findViewById(R.id.peh)).LIZ(musNotice, mTTemplateNotificationHolder, c1242270iQr2);
        ((AbstractViewOnClickListenerC1907000zj0) mTTemplateNotificationHolder.itemView.findViewById(R.id.pf0)).LIZ(musNotice, mTTemplateNotificationHolder, c1242270iQr2);
        if (z3) {
            C786410Ut5.LLLLLLIL(((C1907120zjC) mTTemplateNotificationHolder.itemView.findViewById(R.id.pf0)).getIvNotificationRedDotFromXml(), 8);
        }
        ((C1907530zjr) mTTemplateNotificationHolder.itemView.findViewById(R.id.pdq)).LIZ(musNotice, mTTemplateNotificationHolder);
        C1907300zjU notificationHeadSingleFromXml = ((C1907110zjB) mTTemplateNotificationHolder.itemView.findViewById(R.id.peb)).getNotificationHeadSingleFromXml();
        if (notificationHeadSingleFromXml != null) {
            NoticeUITemplate noticeUITemplate = musNotice.templateNotice.uiTemplate;
            if (noticeUITemplate != null) {
                urlModel = noticeUITemplate.avatarBadgeUrl;
            }
            mTTemplateNotificationHolder.addTypeIconToAvatar(notificationHeadSingleFromXml, urlModel, true);
        }
        if (mTTemplateNotificationHolder.LLJILJILJ == null && (musNotice2 = mTTemplateNotificationHolder.LLILLJJLI) != null && (generalTemplateNotice = musNotice2.templateNotice) != null && generalTemplateNotice.type != null) {
            z4 = true;
        }
        mTTemplateNotificationHolder.checkAndGetStory(z4);
        MusNotice musNotice3 = mTTemplateNotificationHolder.LLILLJJLI;
        if (musNotice3 != null) {
            C1907600zjy c1907600zjy = new C1907600zjy(musNotice3, mTTemplateNotificationHolder.LLILZLL, mTTemplateNotificationHolder.LLILZ);
            Iterator<? extends InterfaceC1906920zis> it2 = mTTemplateNotificationHolder.LLIZLLLIL.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c1907600zjy);
            }
        }
        C1907160zjG c1907160zjG = (C1907160zjG) mTTemplateNotificationHolder.itemView.findViewById(R.id.peh);
        mTTemplateNotificationHolder.resetContentTopMargin(c1907160zjG.getNotification_name(), c1907160zjG.getNotificationContentFromXml(), c1907160zjG.getMutualRelationViewFromXml(), c1907160zjG.getTitle_container().getVisibility());
        mTTemplateNotificationHolder.markUnreadIfNeed(musNotice.hasRead, mTTemplateNotificationHolder.itemView, z3);
        C424560Gko rightNotificationCoverFromXml = ((C1907120zjC) mTTemplateNotificationHolder.itemView.findViewById(R.id.pf0)).getRightNotificationCoverFromXml();
        mTTemplateNotificationHolder.applyCoverSize(c1906880zio2, rightNotificationCoverFromXml);
        mTTemplateNotificationHolder.applyCoverBorder(c1906880zio2, rightNotificationCoverFromXml);
    }
}
