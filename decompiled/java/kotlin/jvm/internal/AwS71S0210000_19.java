package kotlin.jvm.internal;

import X.AbstractC1223800hx4;
import X.C09AY;
import X.C0D5L;
import X.C0HZQ;
import X.C0SY7;
import X.C1223990hxN;
import X.C1224840hyk;
import X.C1233790iDB;
import X.C1233810iDD;
import X.C1233960iDS;
import X.C1234050iDb;
import X.C1235760iGM;
import X.C1240060iNI;
import X.C1251330ifT;
import X.C127A;
import X.C127K;
import X.C1308910kAL;
import X.C1365110lcz;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C13LP;
import X.C15438062q;
import X.C1954807lC;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C291001Au;
import X.C340190DVh;
import X.C419910GdJ;
import X.C447550Hgn;
import X.C511901z3;
import X.C985403tE;
import X.EnumC1216650hlX;
import X.EnumC1223630hwn;
import X.EnumC1233840iDG;
import X.EnumC1251790igD;
import X.InterfaceC1224160hxe;
import X.InterfaceC1891350zJl;
import android.content.Context;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.IOneClickLoginService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS71S0210000_19 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        if (awS71S0210000_19.z2) {
            ((IOneClickLoginService) ServiceManager.get().getService(IOneClickLoginService.class)).LIZ(((BaseLoginMethod) awS71S0210000_19.l0).getUid());
        }
        String str = LoginMethodListFragment._pnsPageId;
        C1240060iNI.LIZ();
        C19EG activity = ((LoginMethodListFragment) awS71S0210000_19.l1).getActivity();
        if (activity != null) {
            C0D5L.LIZIZ(activity);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        RelationButton relationButton = (RelationButton) awS71S0210000_19.l0;
        C447550Hgn.LIZIZ(relationButton, new AwS100S0110000_13(relationButton, awS71S0210000_19.z2, 1));
        ((AbsRecUserCell) awS71S0210000_19.l1).f6((C0SY7) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        AwS71S0210000_19 awS71S0210000_192 = new AwS71S0210000_19((TwoStepVerificationActivityViewModel) awS71S0210000_19.l0, (TwoStepVerificationActivityViewModel) awS71S0210000_19.z2, (boolean) awS71S0210000_19.l1, (List<String>) 9);
        ((TwoStepVerificationActivityViewModel) awS71S0210000_19.l0).UQ2((String) obj, awS71S0210000_192);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        int iIntValue;
        if (awS71S0210000_19.z2) {
            C1233960iDS c1233960iDS = C1233960iDS.LIZ;
            String verifyTypeFromMethod = ((TwoStepVerificationActivityAssem) awS71S0210000_19.l0).LLJJL.getVerifyTypeFromMethod(((C1233790iDB) awS71S0210000_19.l1).LIZJ);
            String enterFrom = ((TwoStepVerificationActivityAssem) awS71S0210000_19.l0).getEnterFrom();
            c1233960iDS.getClass();
            C2344009Gk c2344009GkLIZ = C1233960iDS.LIZ();
            c2344009GkLIZ.LJIIIIZZ("method_edited", C1233960iDS.LIZIZ(verifyTypeFromMethod));
            c2344009GkLIZ.LJIIIIZZ("enter_from", enterFrom);
            C20684815ws.LJIILLIIL("twosv_setup_popup_click_remove", c2344009GkLIZ.LIZ);
        }
        TwoStepVerificationActivityAssem twoStepVerificationActivityAssem = (TwoStepVerificationActivityAssem) awS71S0210000_19.l0;
        EnumC1233840iDG enumC1233840iDG = ((C1233790iDB) awS71S0210000_19.l1).LIZJ;
        boolean z = awS71S0210000_19.z2;
        Context context = twoStepVerificationActivityAssem.getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            if (z) {
                int i = C1233810iDD.LIZ[enumC1233840iDG.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                c1397580mTM.LJI(context.getString(2131857375));
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            c1397580mTM.LJI(context.getString(2131857379));
                        }
                    } else {
                        c1397580mTM.LJI(context.getString(2131857376));
                    }
                } else {
                    c1397580mTM.LJI(context.getString(2131857380));
                }
                C1233960iDS c1233960iDS2 = C1233960iDS.LIZ;
                String verifyTypeFromMethod2 = twoStepVerificationActivityAssem.LLJJL.getVerifyTypeFromMethod(enumC1233840iDG);
                String enterFrom2 = twoStepVerificationActivityAssem.getEnterFrom();
                c1233960iDS2.getClass();
                C2344009Gk c2344009GkLIZ2 = C1233960iDS.LIZ();
                c2344009GkLIZ2.LJIIIIZZ("method_edited", C1233960iDS.LIZIZ(verifyTypeFromMethod2));
                c2344009GkLIZ2.LJIIIIZZ("enter_from", enterFrom2);
                C20684815ws.LJIILLIIL("twosv_remove_second_popup", c2344009GkLIZ2.LIZ);
                c1397580mTM.LIZIZ(context.getString(2131857378));
                C985403tE.LIZ(c1397580mTM, new AwS228S0300000_19(context, twoStepVerificationActivityAssem, enumC1233840iDG, 37));
            } else {
                C1233960iDS c1233960iDS3 = C1233960iDS.LIZ;
                String verifyTypeFromMethod3 = twoStepVerificationActivityAssem.LLJJL.getVerifyTypeFromMethod(enumC1233840iDG);
                String enterFrom3 = twoStepVerificationActivityAssem.getEnterFrom();
                c1233960iDS3.getClass();
                C2344009Gk c2344009GkLIZ3 = C1233960iDS.LIZ();
                c2344009GkLIZ3.LJIIIIZZ("method_edited", C1233960iDS.LIZIZ(verifyTypeFromMethod3));
                c2344009GkLIZ3.LJIIIIZZ("enter_from", enterFrom3);
                C20684815ws.LJIILLIIL("twosv_turnoff_popup", c2344009GkLIZ3.LIZ);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                c1397580mTM.LJIIIZ = new C340190DVh(context, R.raw.icon_3pt_exclamation_mark_circle, Integer.valueOf(iIntValue), 8);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_3pt_exclamation_mark_circle;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
                C1235760iGM.LIZIZ(c1397580mTM, c419910GdJ.LIZ(context));
                c1397580mTM.LJI(context.getString(2131857384));
                c1397580mTM.LIZIZ(context.getString(2131857381));
                C985403tE.LIZ(c1397580mTM, new AwS228S0300000_19(context, twoStepVerificationActivityAssem, enumC1233840iDG, 38));
            }
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C127K c127k = (C127K) obj;
        c127k.setTitle(((Context) awS71S0210000_19.l0).getString(2131839215));
        C127A c127a = new C127A((Context) awS71S0210000_19.l0);
        boolean z = awS71S0210000_19.z2;
        Function1 function1 = (Function1) awS71S0210000_19.l1;
        c127a.LJIILJJIL(z);
        c127a.LJIILLIIL(new C511901z3(function1, 7));
        c127k.setAccessory(c127a);
        c127k.setInset(EnumC1216650hlX.PADDING_32);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS71S0210000_19 r3, java.lang.Object r4) throws java.lang.Throwable {
        /*
            X.0mTU r4 = (X.C1397660mTU) r4
            java.lang.Object r1 = r3.l0
            X.0lcz r1 = (X.C1365110lcz) r1
            boolean r0 = r3.z2
            r1.LIZJ(r0)
            java.lang.Object r0 = r3.l0
            X.0lcz r0 = (X.C1365110lcz) r0
            java.lang.Object r3 = r3.l1
            X.0HZQ r3 = (X.C0HZQ) r3
            r0.getClass()
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.live.ILiveOuterService> r0 = com.ss.android.ugc.aweme.live.ILiveOuterService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = (com.ss.android.ugc.aweme.live.ILiveOuterService) r0
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService r2 = r0.K5()
            if (r2 == 0) goto L36
            if (r3 == 0) goto L41
            boolean r1 = r3.isChecked()
            r0 = 1
            if (r1 != r0) goto L41
        L33:
            r2.setLiveEventShieldConfirmValue(r0)
        L36:
            X.0mTF r1 = r4.LIZ()
            r0 = 0
            r1.LIZIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            r0 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS71S0210000_19.invoke$13(kotlin.jvm.internal.AwS71S0210000_19, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, ((C1365110lcz) awS71S0210000_19.l0).LIZ.getString(2131852241), new AwS71S0210000_19((C1365110lcz) awS71S0210000_19.l0, awS71S0210000_19.z2, (C0HZQ) awS71S0210000_19.l1, 13));
        c1397620mTQ.LIZJ(1, ((C1365110lcz) awS71S0210000_19.l0).LIZ.getString(2131852238), new AwS385S0200000_19((C1365110lcz) awS71S0210000_19.l0, (C0HZQ) awS71S0210000_19.l1, 161));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C1251330ifT c1251330ifT = (C1251330ifT) obj;
        if (c1251330ifT != null) {
            User user = (User) awS71S0210000_19.l0;
            return C1251330ifT.LIZ(c1251330ifT, user, new C291001Au(user), awS71S0210000_19.z2, false, (EnumC1251790igD) awS71S0210000_19.l1, null, null, 208);
        }
        return null;
    }

    public static final Object invoke$3(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C1251330ifT c1251330ifT = (C1251330ifT) obj;
        if (c1251330ifT != null) {
            return C1251330ifT.LIZ(c1251330ifT, (User) awS71S0210000_19.l0, null, awS71S0210000_19.z2, false, (EnumC1251790igD) awS71S0210000_19.l1, null, null, 210);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [X.0hx4] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r11v6, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r11v7, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0hx4] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r9v5, types: [X.0hyk] */
    /* JADX WARN: Type inference failed for: r9v6, types: [X.0hyk] */
    public static final Object invoke$4(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        boolean z;
        Map<String, List<AbstractC1223800hx4>> mapP60;
        Set<Map.Entry<String, List<AbstractC1223800hx4>>> setEntrySet;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1224840hyk c1224840hyk = (C1224840hyk) awS71S0210000_19.l0;
        boolean z2 = c1224840hyk.LLJILJIL;
        boolean z3 = awS71S0210000_19.z2;
        if (z2 == (!z3) && z3) {
            linkedHashSet.add(C1224840hyk.LIZ(c1224840hyk, null, null, false, null, null, true, false, false, false, false, 63487));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1224160hxe interfaceC1224160hxe = ((SelectorContainerVM) awS71S0210000_19.l1).LLILZIL;
        int i = 10;
        if (interfaceC1224160hxe != null && (mapP60 = interfaceC1224160hxe.p60()) != null && (setEntrySet = mapP60.entrySet()) != null) {
            C1224840hyk c1224840hyk2 = (C1224840hyk) awS71S0210000_19.l0;
            boolean z4 = awS71S0210000_19.z2;
            Iterator it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Iterable<??> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, i));
                for (?? LIZ : iterable) {
                    if (LIZ instanceof C1224840hyk) {
                        LIZ = (C1224840hyk) LIZ;
                        if (Intrinsics.LJFF(LIZ.LLILZ, c1224840hyk2.LLILZ)) {
                            LIZ = C1224840hyk.LIZ(LIZ, null, null, false, null, null, z4, false, false, false, false, 63487);
                        } else if (z4 && LIZ.LLJILJIL && !LIZ.LLJILLL) {
                            LIZ = C1224840hyk.LIZ(LIZ, null, null, false, null, null, false, false, false, false, false, 63487);
                        }
                    }
                    arrayList.add(LIZ);
                }
                linkedHashMap.put(entry.getKey(), arrayList);
                i = 10;
            }
        }
        C1223990hxN c1223990hxNLJFF = ((SelectorContainerVM) awS71S0210000_19.l1).vQ2().LJFF();
        if (((SelectorContainerVM) awS71S0210000_19.l1).getState().LLILLJJLI == EnumC1223630hwn.SEARCH_PAGE) {
            z = true;
        } else {
            z = false;
        }
        c1223990hxNLJFF.LIZ(((SelectorContainerVM) awS71S0210000_19.l1).LLILZ.kX0().size(), z);
        List<AbstractC1223800hx4> listKX0 = ((SelectorContainerVM) awS71S0210000_19.l1).LLILZ.kX0();
        C1224840hyk c1224840hyk3 = (C1224840hyk) awS71S0210000_19.l0;
        boolean z5 = awS71S0210000_19.z2;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listKX0, 10));
        for (AbstractC1223800hx4 abstractC1223800hx4LIZ : listKX0) {
            if (abstractC1223800hx4LIZ instanceof C1224840hyk) {
                abstractC1223800hx4LIZ = (C1224840hyk) abstractC1223800hx4LIZ;
                if (Intrinsics.LJFF(abstractC1223800hx4LIZ.LLILZ, c1224840hyk3.LLILZ)) {
                    abstractC1223800hx4LIZ = C1224840hyk.LIZ(abstractC1223800hx4LIZ, null, null, false, null, null, z5, false, false, false, false, 63487);
                } else if (z5 && abstractC1223800hx4LIZ.LLJILJIL && !abstractC1223800hx4LIZ.LLJILLL) {
                    abstractC1223800hx4LIZ = C1224840hyk.LIZ(abstractC1223800hx4LIZ, null, null, false, null, null, false, false, false, false, false, 63487);
                }
            }
            arrayList2.add(abstractC1223800hx4LIZ);
        }
        ((SelectorContainerVM) awS71S0210000_19.l1).yQ2(arrayList2, linkedHashMap, linkedHashSet);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        int i;
        boolean z;
        Map<String, List<AbstractC1223800hx4>> mapP60;
        if (awS71S0210000_19.z2) {
            i = 1;
        } else {
            i = -1;
        }
        boolean z2 = false;
        if (((SelectorContainerVM) awS71S0210000_19.l0).LL.hA1().size() + i >= ((SelectorContainerVM) awS71S0210000_19.l0).vQ2().LJ().LJJIZ().LIZIZ()) {
            z = true;
        } else {
            z = false;
        }
        Set setLLIIIZ = C13LP.LLIIIZ(((SelectorContainerVM) awS71S0210000_19.l0).LL.Ft());
        C1224840hyk c1224840hyk = (C1224840hyk) awS71S0210000_19.l1;
        boolean z3 = c1224840hyk.LLJILJIL;
        boolean z4 = awS71S0210000_19.z2;
        if (z3 == (!z4)) {
            if (z4) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setLLIIIZ, 10));
                Iterator it2 = setLLIIIZ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C1224840hyk) it2.next()).LLILZ);
                }
                if (!arrayList.contains(((C1224840hyk) awS71S0210000_19.l1).LLILZ)) {
                    setLLIIIZ.add(C1224840hyk.LIZ((C1224840hyk) awS71S0210000_19.l1, null, null, false, null, null, true, false, false, false, false, 63487));
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : setLLIIIZ) {
                    if (!Intrinsics.LJFF(((C1224840hyk) obj2).LLILZ, c1224840hyk.LLILZ)) {
                        arrayList2.add(obj2);
                    }
                }
                setLLIIIZ = C13LP.LLIIIZ(arrayList2);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        InterfaceC1224160hxe interfaceC1224160hxe = ((SelectorContainerVM) awS71S0210000_19.l0).LLILZIL;
        if (interfaceC1224160hxe != null && (mapP60 = interfaceC1224160hxe.p60()) != null) {
            SelectorContainerVM selectorContainerVM = (SelectorContainerVM) awS71S0210000_19.l0;
            C1224840hyk c1224840hyk2 = (C1224840hyk) awS71S0210000_19.l1;
            boolean z5 = awS71S0210000_19.z2;
            ArrayList arrayList3 = new ArrayList(mapP60.size());
            for (Map.Entry<String, List<AbstractC1223800hx4>> entry : mapP60.entrySet()) {
                List<AbstractC1223800hx4> value = entry.getValue();
                ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(value, 10));
                for (InterfaceC1891350zJl interfaceC1891350zJlZQ2 : value) {
                    if (interfaceC1891350zJlZQ2 instanceof C1224840hyk) {
                        interfaceC1891350zJlZQ2 = selectorContainerVM.zQ2((C1224840hyk) interfaceC1891350zJlZQ2, c1224840hyk2, z5, z);
                    }
                    arrayList4.add(interfaceC1891350zJlZQ2);
                }
                linkedHashMap.put(entry.getKey(), arrayList4);
                arrayList3.add(Unit.LIZ);
            }
        }
        C1223990hxN c1223990hxNLJFF = ((SelectorContainerVM) awS71S0210000_19.l0).vQ2().LJFF();
        if (((SelectorContainerVM) awS71S0210000_19.l0).getState().LLILLJJLI == EnumC1223630hwn.SEARCH_PAGE) {
            z2 = true;
        }
        c1223990hxNLJFF.LIZ(((SelectorContainerVM) awS71S0210000_19.l0).LLILZ.kX0().size(), z2);
        List<AbstractC1223800hx4> listKX0 = ((SelectorContainerVM) awS71S0210000_19.l0).LLILZ.kX0();
        SelectorContainerVM selectorContainerVM2 = (SelectorContainerVM) awS71S0210000_19.l0;
        C1224840hyk c1224840hyk3 = (C1224840hyk) awS71S0210000_19.l1;
        boolean z6 = awS71S0210000_19.z2;
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(listKX0, 10));
        for (InterfaceC1891350zJl interfaceC1891350zJlZQ22 : listKX0) {
            if (interfaceC1891350zJlZQ22 instanceof C1224840hyk) {
                interfaceC1891350zJlZQ22 = selectorContainerVM2.zQ2((C1224840hyk) interfaceC1891350zJlZQ22, c1224840hyk3, z6, z);
            }
            arrayList5.add(interfaceC1891350zJlZQ22);
        }
        ((SelectorContainerVM) awS71S0210000_19.l0).yQ2(arrayList5, linkedHashMap, setLLIIIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        ((C1397620mTQ) obj).LJFF(2131838758, new AwS71S0210000_19(awS71S0210000_19.z2, (BaseLoginMethod) awS71S0210000_19.l0, (LoginMethodListFragment) awS71S0210000_19.l1, 0));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C127K c127k = (C127K) obj;
        c127k.setTitle(((Context) awS71S0210000_19.l0).getString(2131838228));
        C127A c127a = new C127A((Context) awS71S0210000_19.l0);
        boolean z = awS71S0210000_19.z2;
        Function1 function1 = (Function1) awS71S0210000_19.l1;
        c127a.LJIILJJIL(z);
        c127a.LJIILLIIL(new C511901z3(function1, 6));
        c127k.setAccessory(c127a);
        c127k.setInset(EnumC1216650hlX.PADDING_32);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        ((TwoStepVerificationActivityViewModel) awS71S0210000_19.l0).vQ2("trusted_environment", (String) obj, (List) awS71S0210000_19.l1, awS71S0210000_19.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS71S0210000_19 awS71S0210000_19, Object obj) {
        C1234050iDb c1234050iDb = (C1234050iDb) obj;
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) awS71S0210000_19.l0;
        boolean z = awS71S0210000_19.z2;
        List list = (List) awS71S0210000_19.l1;
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String str = c1234050iDb.LIZIZ;
        c1233960iDS.getClass();
        twoStepVerificationActivityViewModel.vQ2(C1233960iDS.LIZIZ(str), c1234050iDb.LIZ, list, z);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS71S0210000_19(X.C1224840hyk r3, com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            int r6 = 4 - r6
            if (r6 == 0) goto L12
            r1 = r2
            r1.z2 = r5
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
        Le:
            r1.<init>(r0)
            return
        L12:
            r1 = r2
            r1.l0 = r3
            r1.z2 = r5
            r1.l1 = r4
            r0 = 1
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS71S0210000_19.<init>(X.0hyk, com.ss.android.ugc.tiktok.im.contact.selector.impl.vm.SelectorContainerVM, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0210000_19(C1365110lcz c1365110lcz, boolean z, C0HZQ c0hzq, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1365110lcz;
        this.z2 = z;
        this.l1 = c0hzq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0210000_19(Context context, Function1 function1, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.z2 = z;
        this.l1 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0210000_19(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2, boolean z, List<String> list) {
        super(1);
        this.$t = list;
        this.l0 = twoStepVerificationActivityViewModel;
        this.z2 = twoStepVerificationActivityViewModel2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0210000_19(User user, EnumC1251790igD enumC1251790igD, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = user;
        this.z2 = z;
        this.l1 = enumC1251790igD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS71S0210000_19(RelationButton relationButton, RelationButton relationButton2, AbsRecUserCell<ITEM> absRecUserCell, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = relationButton;
        this.l1 = relationButton2;
        this.z2 = absRecUserCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0210000_19(boolean z, TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, C1233790iDB c1233790iDB, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = twoStepVerificationActivityAssem;
        this.l1 = c1233790iDB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS71S0210000_19(boolean z, BaseLoginMethod baseLoginMethod, LoginMethodListFragment loginMethodListFragment, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = baseLoginMethod;
        this.l1 = loginMethodListFragment;
    }
}
