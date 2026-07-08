package com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2;

import X.AbstractC19486711Lt;
import X.C01GW;
import X.C0HZQ;
import X.C0I0B;
import X.C0I31;
import X.C0Z37;
import X.C0Z72;
import X.C0Z73;
import X.C0Z7H;
import X.C0Z86;
import X.C0Z8A;
import X.C0Z8G;
import X.C0Z8L;
import X.C0Z93;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZJ7;
import X.C0ZK1;
import X.C0ZKF;
import X.C11RO;
import X.C11S5;
import X.C1336205Ku;
import X.C1360520lVa;
import X.C1383370m6R;
import X.C13BV;
import X.C13LP;
import X.C1492305sn;
import X.C15438062q;
import X.C1609500rzA;
import X.C1697810uHb;
import X.C1906880zio;
import X.C1908030zkf;
import X.C19724012Fa;
import X.C19EG;
import X.C1AF0;
import X.C2097608Jq;
import X.C2152008bu;
import X.C2188811AlT;
import X.C278900AwS;
import X.C292980Be4;
import X.C342790DcD;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419060Gbw;
import X.C426750GoL;
import X.C427920GqE;
import X.C429290GsR;
import X.C452501pT;
import X.C618720OOo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C878950Ydx;
import X.C880460YgO;
import X.C885310YoD;
import X.C888350Yt7;
import X.C888490YtL;
import X.C888510YtN;
import X.C890610Ywl;
import X.C894750Z8f;
import X.C895150Z9t;
import X.C895200Z9y;
import X.C897370ZIh;
import X.C897490ZIt;
import X.C960203pA;
import X.EnumC1605470rsf;
import X.EnumC880480YgQ;
import X.EnumC887810YsF;
import X.InterfaceC1398730mVD;
import X.InterfaceC1493505sz;
import X.InterfaceC1508640pMU;
import X.InterfaceC1891350zJl;
import X.InterfaceC879010Ye3;
import X.InterfaceC888500YtM;
import X.InterfaceC894770Z8h;
import X.InterfaceC897380ZIi;
import Y.ACallableS410S0100000_2;
import Y.ARunnableS20S0201000_14;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.analytics.IMSayhiAnalytics;
import com.ss.android.ugc.aweme.im.service.chat.InboxSocPubStatusViewModel;
import com.ss.android.ugc.aweme.im.service.utils.IAccessibilityUtils;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class SessionListSingleChatVH extends SessionListIMBaseVH<C0Z8L, C888350Yt7> implements C0Z37<C0Z7H>, InterfaceC1508640pMU {
    public C1609500rzA LLLILZJ;
    public C427920GqE LLLILZLLLI;
    public final C01GW LLLIZZ;
    public final C01GW LLLJ;
    public final C01GW LLLJIL;
    public final C01GW LLLJL;
    public final C01GW LLLL;
    public final C01GW LLLLII;
    public boolean LLLLIIIILLL;
    public final C01GW LLLLIIL;
    public InterfaceC1398730mVD LLLLIILL;
    public final C01GW LLLLIILLL;
    public final AwS593S0100000_14 LLLLIL;
    public final AwS593S0100000_14 LLLLILI;

    public String T() {
        return "SessionListSingleChatVH";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public String b6() {
        return "single_chat_vh";
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean w6() {
        return true;
    }

    private final C427920GqE t7() {
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLLILZLLLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.a6g);
            this.LLLILZLLLI = (C427920GqE) callbackFindViewById;
        }
        return (C427920GqE) callbackFindViewById;
    }

    public final void A7() {
        C19EG activity;
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle;
        InboxSocPubStatusViewModel inboxSocPubStatusViewModelX7;
        if (this.LLLLIIIILLL || (activity = getActivity()) == null || (lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(activity, null, false)) == null || (inboxSocPubStatusViewModelX7 = x7()) == null) {
            return;
        }
        this.LLLLIIIILLL = true;
        lifecycleOwnerRequireMainSAFLifecycle.getLifecycle().addObserver(inboxSocPubStatusViewModelX7);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLLJIL.getValue();
    }

    public void O7() {
        if (this instanceof NewSessionListSingleChatVH) {
            return;
        }
        try {
            View viewFindViewById = this.itemView.findViewById(R.id.bir);
            if (viewFindViewById != null) {
                C895200Z9y.LIZ(viewFindViewById);
            }
            C1609500rzA c1609500rzAV7 = v7();
            if (c1609500rzAV7 != null) {
                C895200Z9y.LIZ(c1609500rzAV7);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "SessionListSingleChatVH optimizeAvatarView error");
        }
    }

    public final void P7() {
        C0Z8L c0z8l = (C0Z8L) this.LLJJIJIIJIL;
        if (c0z8l == null) {
            return;
        }
        C0ZE7 c0ze7S7 = s7();
        c0ze7S7.LIZJ = c0z8l.getUid();
        c0ze7S7.LJII = Boolean.valueOf(C429290GsR.LIZ(c0z8l.getActivityStatusViewData()));
        C897490ZIt.LIZIZ(c0ze7S7);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean V6() {
        return DMInboxChangeRightZoneClickableSizeExp.INSTANCE.isEnabled();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z9B
    public final C0HZQ b() {
        return (C0HZQ) this.LLLLIIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onAttach() {
        String uid;
        InboxSocPubStatusViewModel inboxSocPubStatusViewModelX7;
        Set<String> setLg0;
        C1609500rzA c1609500rzAV7;
        EnumC1605470rsf mode;
        Map<String, Serializable> mapTR0;
        Set<String> setLg02;
        super.onAttach();
        C0Z8L c0z8l = (C0Z8L) this.LLJJIJIIJIL;
        if (c0z8l == null) {
            return;
        }
        IMUser imUser = c0z8l.getImUser();
        if (imUser != null && (uid = imUser.getUid()) != null && (inboxSocPubStatusViewModelX7 = x7()) != null && (setLg0 = inboxSocPubStatusViewModelX7.lg0()) != null && !setLg0.contains(uid)) {
            C1609500rzA c1609500rzAV72 = v7();
            if ((c1609500rzAV72 != null ? c1609500rzAV72.getMode() : null) != EnumC1605470rsf.NONE && (c1609500rzAV7 = v7()) != null && (mode = c1609500rzAV7.getMode()) != null) {
                L7(mode);
                InboxSocPubStatusViewModel inboxSocPubStatusViewModelX72 = x7();
                if (inboxSocPubStatusViewModelX72 != null && (setLg02 = inboxSocPubStatusViewModelX72.lg0()) != null) {
                    setLg02.add(uid);
                }
                InboxSocPubStatusViewModel inboxSocPubStatusViewModelX73 = x7();
                if (inboxSocPubStatusViewModelX73 != null && (mapTR0 = inboxSocPubStatusViewModelX73.tR0()) != null) {
                    mapTR0.put(uid, mode);
                }
            }
        }
        C888490YtL c888490YtL = C888490YtL.LIZ;
        boolean zI7 = i7();
        int i = this.LLILZIL;
        C11RO c11roLIZ = C11S5.LIZ();
        InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        c888490YtL.getClass();
        InterfaceC879010Ye3 pageKey = c0z8l.getPageKey();
        if (pageKey == null) {
            pageKey = new C878950Ydx(null, FilterTabType.OVERALL, Collections.singleton(EnumC880480YgQ.ALL), SystemClock.elapsedRealtime(), 19);
        }
        Map<EnumC887810YsF, Map<InterfaceC879010Ye3, Set<String>>> map = C888490YtL.LIZIZ;
        EnumC887810YsF enumC887810YsF = EnumC887810YsF.CHAT_SHOW;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        Object linkedHashMap2 = linkedHashMap.get(enumC887810YsF);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            linkedHashMap.put(enumC887810YsF, linkedHashMap2);
        }
        Map map2 = (Map) linkedHashMap2;
        Object linkedHashSet = map2.get(pageKey);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet();
            map2.put(pageKey, linkedHashSet);
        }
        Set set = (Set) linkedHashSet;
        EnumC887810YsF enumC887810YsF2 = EnumC887810YsF.TTSOCIAL_CHAT_CELL_SHOW;
        Object linkedHashMap3 = linkedHashMap.get(enumC887810YsF2);
        if (linkedHashMap3 == null) {
            linkedHashMap3 = new LinkedHashMap();
            linkedHashMap.put(enumC887810YsF2, linkedHashMap3);
        }
        Map map3 = (Map) linkedHashMap3;
        Object linkedHashSet2 = map3.get(pageKey);
        if (linkedHashSet2 == null) {
            linkedHashSet2 = new LinkedHashSet();
            map3.put(pageKey, linkedHashSet2);
        }
        Set set2 = (Set) linkedHashSet2;
        ArrayList arrayList = new ArrayList();
        if (set.add(c0z8l.getSessionId())) {
            arrayList.add(new ARunnableS20S0201000_14(c0z8l, i, interfaceC1493505szLIZIZ, 3));
        }
        if (set2.add(c0z8l.getSessionId())) {
            arrayList.add(new ARunnableS20S0201000_14(c0z8l, i, interfaceC1493505szLIZIZ, 5));
        }
        if (zI7) {
            EnumC887810YsF enumC887810YsF3 = EnumC887810YsF.CAMERA_ICON_SHOW;
            Object linkedHashMap4 = linkedHashMap.get(enumC887810YsF3);
            if (linkedHashMap4 == null) {
                linkedHashMap4 = new LinkedHashMap();
                linkedHashMap.put(enumC887810YsF3, linkedHashMap4);
            }
            Map map4 = (Map) linkedHashMap4;
            Object linkedHashSet3 = map4.get(pageKey);
            if (linkedHashSet3 == null) {
                linkedHashSet3 = new LinkedHashSet();
                map4.put(pageKey, linkedHashSet3);
            }
            if (((Set) linkedHashSet3).add(c0z8l.getSessionId())) {
                arrayList.add(new ARunnableS20S0201000_14(c0z8l, i, interfaceC1493505szLIZIZ, 1));
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC19486711Lt.LJIIL(new ACallableS410S0100000_2(arrayList, 8)).LJIJJLI(c11roLIZ).LJIIZILJ();
        }
    }

    public final C0ZE7 s7() {
        return (C0ZE7) this.LLLLIILLL.getValue();
    }

    public Boolean u7() {
        C0Z8L c0z8l = (C0Z8L) this.LLJJIJIIJIL;
        return Boolean.valueOf(C429290GsR.LIZ(c0z8l != null ? c0z8l.getActivityStatusViewData() : null));
    }

    public final C1609500rzA v7() {
        View view = this.itemView;
        KeyEvent.Callback callbackFindViewById = this.LLLILZJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = view.findViewById(R.id.i8h);
            this.LLLILZJ = (C1609500rzA) callbackFindViewById;
        }
        return (C1609500rzA) callbackFindViewById;
    }

    public final InboxSocPubStatusViewModel x7() {
        return (InboxSocPubStatusViewModel) this.LLLLII.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    /* JADX INFO: renamed from: z7, reason: merged with bridge method [inline-methods] */
    public final C342790DcD b7() {
        return (C342790DcD) this.LLLJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Map<String, String> S5() {
        Map<String, String> mapS5 = super.S5();
        mapS5.put("has_icon", String.valueOf(i7()));
        C885310YoD c885310YoD = C885310YoD.LIZ;
        C0Z8L c0z8l = (C0Z8L) this.LLJJIJIIJIL;
        Boolean boolValueOf = c0z8l != null ? Boolean.valueOf(c0z8l.getShowStarIcon()) : null;
        C0Z8L c0z8l2 = (C0Z8L) this.LLJJIJIIJIL;
        List<C880460YgO> chatLabels = c0z8l2 != null ? c0z8l2.getChatLabels() : null;
        c885310YoD.getClass();
        String strLJIILLIIL = C885310YoD.LJIILLIIL(boolValueOf, chatLabels, null);
        if (strLJIILLIIL.length() > 0) {
            mapS5.put("chat_label", strLJIILLIIL);
        }
        return mapS5;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z32
    public final void onDetach() {
        super.onDetach();
        IDMAvatarLoader iDMAvatarLoaderC6 = C6();
        if (iDMAvatarLoaderC6 != null) {
            iDMAvatarLoaderC6.LIZ();
        }
        C0ZJ7.LIZ(this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public Function1<C0Z8L, Unit> U5() {
        return this.LLLLILI;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final Function1<C0Z8L, Unit> V5() {
        return this.LLLLIL;
    }

    public SessionListSingleChatVH(View view) {
        super(view);
        I7(view.getContext(), (ViewGroup) this.itemView.findViewById(R.id.uud));
        NewSessionListSingleChatVH newSessionListSingleChatVH = (NewSessionListSingleChatVH) this;
        this.LLLIZZ = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 477));
        this.LLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 474));
        this.LLLJIL = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 473));
        this.LLLJL = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 478));
        this.LLLL = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 471));
        this.LLLLII = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 476));
        this.LLLLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 475));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS558S0100000_14(newSessionListSingleChatVH, 470));
        this.LLLLIL = new AwS593S0100000_14(newSessionListSingleChatVH, 53);
        this.LLLLILI = new AwS593S0100000_14(newSessionListSingleChatVH, 52);
    }

    public static void Q7(C0Z8L c0z8l) {
        String string;
        if (c0z8l.getShowSayHiButton()) {
            C895150Z9t value = C895150Z9t.LIZ.getValue();
            String strLIZ = C888510YtN.LIZ(c0z8l);
            String uid = c0z8l.getUid();
            IMUser imUser = c0z8l.getImUser();
            value.getClass();
            IMSayhiAnalytics imSayhiAnalytics = C1336205Ku.LIZ(false).getImSayhiAnalytics();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("enter_from", strLIZ);
            pairArr[1] = new Pair("enter_method", "cell");
            if (imUser == null || (string = Integer.valueOf(imUser.getFollowStatus()).toString()) == null) {
                string = "";
            }
            pairArr[2] = new Pair("relation_tag", string);
            imSayhiAnalytics.LIZJ(uid, C2097608Jq.LJIIJ(pairArr));
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH
    public final void L5(InterfaceC888500YtM interfaceC888500YtM) {
        String secUid;
        C0Z8L c0z8l = (C0Z8L) interfaceC888500YtM;
        Object avatar = c0z8l.getAvatar();
        if (avatar != null && !(avatar instanceof UrlModel)) {
            super.L5(c0z8l);
            return;
        }
        IMUser imUser = c0z8l.getImUser();
        c0z8l.getSessionId();
        if (imUser != null && (secUid = imUser.getSecUid()) != null) {
            secUid.length();
        }
        IAccessibilityUtils.LIZ.getClass();
        IAccessibilityUtils iAccessibilityUtilsLIZ = C0I31.LIZ();
        if (iAccessibilityUtilsLIZ != null) {
            iAccessibilityUtilsLIZ.LIZ(c6(), c0z8l.getImUser());
        }
        IDMAvatarLoader iDMAvatarLoaderC6 = C6();
        if (iDMAvatarLoaderC6 == null) {
            return;
        }
        iDMAvatarLoaderC6.LIZIZ(c0z8l.getUid(), (UrlModel) avatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) this.LLJJJJJIL.getValue(), 95));
    }

    public void L7(EnumC1605470rsf enumC1605470rsf) {
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLLLIILL;
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LJIIIIZZ(enumC1605470rsf);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH, com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListBaseVH, X.C0Z34
    public final void LLLLJ(C1906880zio c1906880zio) {
        super.LLLLJ(c1906880zio);
        int i = c1906880zio.LIZ;
        if (i != -1) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            C1609500rzA c1609500rzAV7 = v7();
            if (c1609500rzAV7 != null) {
                C618720OOo.LIZIZ(c1609500rzAV7, iLIZIZ, iLIZIZ);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void i6(C0Z72 c0z72) {
        CharSequence charSequence;
        C0Z8A c0z8a;
        CharSequence content;
        super.i6(c0z72);
        TuxTextView tuxTextViewX5 = X5();
        if (tuxTextViewX5 != null) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            CharSequence charSequence2 = "";
            if (c0z72 == null || (charSequence = c0z72.chatHint) == null) {
                charSequence = "";
            }
            c1360520lVa.LIZIZ(charSequence);
            if (c0z72 != null && (c0z8a = c0z72.contentType) != null && (content = c0z8a.getContent()) != null) {
                charSequence2 = content;
            }
            c1360520lVa.LIZIZ(charSequence2);
            tuxTextViewX5.setText(c1360520lVa.LIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final boolean k7(C0Z86 c0z86) {
        FilterTabType filterTabType;
        Object value;
        C0Z8L c0z8l = (C0Z8L) c0z86;
        if (!c0z8l.isMute() && c0z8l.getSessionUnreadViewState() != null) {
            Iterator<Object> it2 = C19724012Fa.LIZJ(S6()).iterator();
            while (true) {
                C2152008bu c2152008bu = (C2152008bu) it2;
                if (c2152008bu.hasNext()) {
                    Object next = c2152008bu.next();
                    C342790DcD c342790DcDB7 = b7();
                    c342790DcDB7.getClass();
                    if (((Number) C278900AwS.LIZ.getValue()).intValue() == 1) {
                        value = c342790DcDB7.LJIIJ.getValue();
                    } else {
                        value = c342790DcDB7.LJIIIZ.getValue();
                    }
                    if (Intrinsics.LJFF(next, value)) {
                        break;
                    }
                } else if (!c0z8l.isBlock()) {
                    C878950Ydx pageKey = c0z8l.getPageKey();
                    if (pageKey != null) {
                        filterTabType = pageKey.LLILLL;
                    } else {
                        filterTabType = null;
                    }
                    if (filterTabType != FilterTabType.SPAM) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    /* JADX INFO: renamed from: n7, reason: merged with bridge method [inline-methods] */
    public void f6(C0Z8L c0z8l) {
        if (c0z8l.getActivityStatusViewData() != null) {
            C1492305sn.LIZ().LJIILLIIL(System.currentTimeMillis());
        }
        C0ZE7 c0ze7S7 = s7();
        c0ze7S7.LIZJ = c0z8l.getUid();
        c0ze7S7.LJII = Boolean.valueOf(C429290GsR.LIZ(c0z8l.getActivityStatusViewData()));
        C0ZJ7.LIZIZ(this.itemView, c0z8l.getUid(), Boolean.valueOf(C429290GsR.LIZ(c0z8l.getActivityStatusViewData())));
        if (c0z8l.getPriority() > 0) {
            C427920GqE c427920GqET7 = t7();
            if (c427920GqET7 != null) {
                c427920GqET7.LIZ(Integer.valueOf(R.attr.c7));
            }
        } else {
            C427920GqE c427920GqET72 = t7();
            if (c427920GqET72 != null) {
                c427920GqET72.LIZ(Integer.valueOf(R.attr.bx));
            }
        }
        C427920GqE c427920GqET73 = t7();
        if (c427920GqET73 != null) {
            c427920GqET73.setActivityStatus(c0z8l.getActivityStatusViewData());
        }
        C0ZE7 c0ze7S72 = s7();
        c0ze7S72.LJII = Boolean.valueOf(C429290GsR.LIZ(c0z8l.getActivityStatusViewData()));
        c0ze7S72.LIZJ = c0z8l.getUid();
        C0ZE7 c0ze7LIZ = c0ze7S72.LIZ();
        InterfaceC897380ZIi.LIZIZ.getClass();
        C897370ZIh.LIZ().LJIIJJI();
        C0ZE8.LJIIIZ(c0ze7LIZ);
    }

    public void p7(C0Z8L c0z8l) {
        InterfaceC1398730mVD interfaceC1398730mVDLIZ;
        C19EG activity = getActivity();
        if (activity != null) {
            InterfaceC1398730mVD interfaceC1398730mVD = null;
            LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(activity, null, false);
            if (lifecycleOwnerRequireMainSAFLifecycle != null && this.LLLLIILL == null) {
                InterfaceC894770Z8h interfaceC894770Z8h = (InterfaceC894770Z8h) this.LLLL.getValue();
                if (interfaceC894770Z8h != null) {
                    interfaceC1398730mVDLIZ = interfaceC894770Z8h.LIZ(v7(), lifecycleOwnerRequireMainSAFLifecycle, C888510YtN.LIZ(c0z8l), "chat_list", true, new AwS593S0100000_14(this, 51), new AwS558S0100000_14(this, 472));
                } else {
                    interfaceC1398730mVDLIZ = null;
                }
                if (interfaceC1398730mVDLIZ instanceof InterfaceC1398730mVD) {
                    interfaceC1398730mVD = interfaceC1398730mVDLIZ;
                }
                this.LLLLIILL = interfaceC1398730mVD;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void q6(C0Z72 c0z72) {
        boolean z;
        super.q6(c0z72);
        C1908030zkf c1908030zkf = C1908030zkf.LIZ;
        Context context = this.itemView.getContext();
        TuxTextView tuxTextViewA6 = a6();
        if (tuxTextViewA6 == null) {
            return;
        }
        if (c0z72 != null) {
            z = c0z72.showVerifyIcon;
        } else {
            z = false;
        }
        c1908030zkf.getClass();
        C1908030zkf.LJFF(context, tuxTextViewA6, z, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [X.13BV] */
    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void r6(C0Z86 c0z86) {
        ?? arrayList;
        int i;
        int i2;
        int i3;
        C0Z8L c0z8l = (C0Z8L) c0z86;
        super.r6(c0z8l);
        List<C880460YgO> chatLabels = c0z8l.getChatLabels();
        int i4 = 0;
        if (chatLabels == null) {
            arrayList = C13BV.INSTANCE;
        } else if (chatLabels.size() == 1) {
            arrayList = Collections.singletonList(new Pair(((C880460YgO) ListProtector.get(chatLabels, 0)).displayText, ((C880460YgO) ListProtector.get(chatLabels, 0)).uiConfig));
        } else if (chatLabels.size() >= 2) {
            if (((Number) C292980Be4.LIZ.getValue()).intValue() != 1) {
                arrayList = Collections.singletonList(new Pair(C13LP.LJJLIIIJ(chatLabels, " · ", null, null, 0, null, AFwS248S0000000_14.get$arr$(509), 30), ((C880460YgO) ListProtector.get(chatLabels, 0)).uiConfig));
            } else {
                arrayList = new ArrayList(C15438062q.LJIJJ(chatLabels, 10));
                for (C880460YgO c880460YgO : chatLabels) {
                    arrayList.add(new Pair(c880460YgO.displayText, c880460YgO.uiConfig));
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        LinearLayout linearLayout = (LinearLayout) this.LLLJ.getValue();
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
        }
        View view = (View) this.LLLJ.getValue();
        if (view != null) {
            if (!arrayList.isEmpty()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJLLLLLL(i3, view);
        }
        if (!arrayList.isEmpty()) {
            C1383370m6R.LIZIZ((View) this.LLJILJIL.getValue(), AFwS248S0000000_14.get$arr$(508));
            int i5 = 0;
            for (Object obj : arrayList) {
                int i6 = i5 + 1;
                AttributeSet attributeSet = null;
                if (i5 >= 0) {
                    Pair pair = (Pair) obj;
                    TuxTextView tuxTextView = new TuxTextView(this.itemView.getContext(), attributeSet, 6, i4);
                    tuxTextView.setText((CharSequence) pair.getFirst());
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setGravity(8388611);
                    C0Z8G c0z8g = (C0Z8G) pair.getSecond();
                    if (c0z8g != null) {
                        tuxTextView.setTuxFont(c0z8g.textFont);
                        boolean zLIZIZ = C960203pA.LIZIZ(tuxTextView.getContext());
                        if (zLIZIZ) {
                            i = c0z8g.textColorHexDark;
                        } else {
                            i = c0z8g.textColorHex;
                        }
                        if (i != 0) {
                            tuxTextView.setTextColor(i);
                        } else {
                            tuxTextView.setTextColorRes(c0z8g.textColor);
                        }
                        if (zLIZIZ) {
                            i2 = c0z8g.backGroundColorHexDark;
                        } else {
                            i2 = c0z8g.backGroundColorHex;
                        }
                        if (i2 != 0 || c0z8g.backGroundColor > 0) {
                            C426750GoL.LJIIL(tuxTextView, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(1.5d)))), 16);
                            C384050F3z c384050F3z = new C384050F3z();
                            if (i2 != 0) {
                                c384050F3z.LIZ = Integer.valueOf(i2);
                            } else {
                                c384050F3z.LIZIZ = Integer.valueOf(c0z8g.backGroundColor);
                            }
                            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                            tuxTextView.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
                        }
                    } else {
                        tuxTextView.setTuxFont(72);
                        tuxTextView.setTextColorRes(R.attr.a1k);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    if (i5 > 0) {
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    }
                    ViewGroup viewGroup = (ViewGroup) this.LLLJ.getValue();
                    if (viewGroup != null) {
                        viewGroup.addView(tuxTextView, layoutParams);
                    }
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public void r7(C0Z8L c0z8l) {
        A7();
        InboxSocPubStatusViewModel inboxSocPubStatusViewModelX7 = x7();
        if (inboxSocPubStatusViewModelX7 != null) {
            inboxSocPubStatusViewModelX7.yb2(c0z8l, this.LLLLIILL);
        }
        InboxSocPubStatusViewModel inboxSocPubStatusViewModelX72 = x7();
        if (inboxSocPubStatusViewModelX72 != null) {
            inboxSocPubStatusViewModelX72.i72(this.LLLLIILL, c0z8l.getImUser());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x014c A[PHI: r5
      0x014c: PHI (r5v8 X.0YtM) = (r5v7 X.0YtM), (r5v12 X.0YtM) binds: [B:45:0x013a, B:52:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u6(X.C0Z86 r19) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListSingleChatVH.u6(X.0Z86):void");
    }

    public void I7(Context context, ViewGroup viewGroup) {
        C786410Ut5.Sd(R.layout.du0, C786410Ut5.ne(context), viewGroup);
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        I5((C890610Ywl) interfaceC1891350zJl, i);
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    /* JADX INFO: renamed from: N7, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void j7(C0Z8L c0z8l, int i) {
        ViewGroup viewGroup;
        int i2;
        p7(c0z8l);
        super.j7(c0z8l, i);
        r7(c0z8l);
        View view = (View) this.LLLIZZ.getValue();
        if (view != null) {
            if (c0z8l.isTCM()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
        }
        if (((Boolean) C0Z93.LIZLLL.getValue()).booleanValue()) {
            if (C0Z93.LIZIZ()) {
                O7();
            }
            if (C0Z93.LIZJ()) {
                try {
                    C427920GqE c427920GqET7 = t7();
                    if (c427920GqET7 != null) {
                        C895200Z9y.LIZ(c427920GqET7);
                    }
                    FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.uud);
                    if (frameLayout != null) {
                        C895200Z9y.LIZ(frameLayout);
                    }
                    LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.vbv);
                    if (linearLayout != null) {
                        C895200Z9y.LIZ(linearLayout);
                    }
                    C419060Gbw c419060Gbw = (C419060Gbw) this.itemView.findViewById(R.id.y1z);
                    if (c419060Gbw != null) {
                        C895200Z9y.LIZ(c419060Gbw);
                    }
                    LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.evm);
                    if (linearLayout2 != null) {
                        C895200Z9y.LIZ(linearLayout2);
                    }
                    C419060Gbw c419060Gbw2 = (C419060Gbw) this.itemView.findViewById(R.id.gy3);
                    if (c419060Gbw2 != null) {
                        C895200Z9y.LIZ(c419060Gbw2);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.m82);
                    if (viewGroup2 != null) {
                        C895200Z9y.LIZ(viewGroup2);
                    }
                    FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.wa6);
                    if (frameLayout2 != null) {
                        C895200Z9y.LIZ(frameLayout2);
                    }
                    View viewFindViewById = this.itemView.findViewById(R.id.user_name);
                    if (viewFindViewById != null) {
                        C895200Z9y.LIZ(viewFindViewById);
                    }
                    View viewFindViewById2 = this.itemView.findViewById(R.id.m69);
                    if (viewFindViewById2 != null) {
                        C895200Z9y.LIZ(viewFindViewById2);
                    }
                    View viewFindViewById3 = this.itemView.findViewById(R.id.m6e);
                    if (viewFindViewById3 != null) {
                        C895200Z9y.LIZ(viewFindViewById3);
                    }
                    ViewGroup viewGroup3 = (ViewGroup) this.LLJL.getValue();
                    if (viewGroup3 != null) {
                        C895200Z9y.LIZ(viewGroup3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJFF(e, "SessionListSingleChatVH optimizeBackgroundContainers error");
                }
            }
            if (((Boolean) C0Z93.LJI.getValue()).booleanValue()) {
                try {
                    if (!(this instanceof NewSessionListSingleChatVH)) {
                        C1609500rzA c1609500rzAV7 = v7();
                        if (c1609500rzAV7 != null) {
                            c1609500rzAV7.setLayerType(2, null);
                        }
                        View viewFindViewById4 = this.itemView.findViewById(R.id.bir);
                        if (viewFindViewById4 != null) {
                            viewFindViewById4.setLayerType(2, null);
                        }
                        C427920GqE c427920GqET72 = t7();
                        if (c427920GqET72 != null) {
                            c427920GqET72.setLayerType(2, null);
                        }
                    }
                    this.itemView.setDrawingCacheEnabled(false);
                    FrameLayout frameLayout3 = (FrameLayout) this.itemView.findViewById(R.id.uud);
                    if (frameLayout3 != null) {
                        frameLayout3.setLayerType(2, null);
                    }
                    C786410Ut5.T4(this.itemView, 1.0f);
                    View view2 = this.itemView;
                    if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C1AF0.LJFF(e2, "SessionListSingleChatVH applyDrawingOptimizations error");
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Applied overdraw optimizations: bg=");
            sbLIZ.append(C0Z93.LIZJ());
            sbLIZ.append(", avatar=");
            sbLIZ.append(C0Z93.LIZIZ());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.chatlist.impl.ui.viewholder.v2.SessionListIMBaseVH
    public final void e6(C0Z86 c0z86, boolean z) {
        CharSequence text;
        TuxTextView tuxTextViewX5 = X5();
        if (tuxTextViewX5 != null && (text = tuxTextViewX5.getText()) != null) {
            C0Z73.LIZ.getClass();
            if (TextUtils.equals(text, C894750Z8f.LIZJ.getValue())) {
                TuxTextView tuxTextViewX52 = X5();
                if (tuxTextViewX52 != null) {
                    tuxTextViewX52.setTuxFont(52);
                    tuxTextViewX52.setTextColorRes(R.attr.a1h);
                    return;
                }
                return;
            }
            super.e6(c0z86, z);
        }
    }
}
