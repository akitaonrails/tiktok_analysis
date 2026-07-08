package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AbstractC895970ZCx;
import X.AbstractC895980ZCy;
import X.AnonymousClass0699;
import X.AnonymousClass0956;
import X.C01GW;
import X.C05J7;
import X.C05J8;
import X.C095D;
import X.C09AY;
import X.C09IC;
import X.C0BWC;
import X.C0I0B;
import X.C0I6Y;
import X.C0PEM;
import X.C0YMW;
import X.C0Z2A;
import X.C0ZD1;
import X.C0ZD2;
import X.C1391990mKL;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1677606ha;
import X.C1708606ma;
import X.C1954807lC;
import X.C1DFH;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2188811AlT;
import X.C2201941BFw;
import X.C2296808zG;
import X.C23250099c;
import X.C2501109r7;
import X.C288960BUg;
import X.C289880BXu;
import X.C291001Au;
import X.C631370Opb;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C830490Whz;
import X.C860290Xox;
import X.C860300Xoy;
import X.C860320Xp0;
import X.C860340Xp2;
import X.C860540XpM;
import X.C860550XpN;
import X.C860580XpQ;
import X.C861640Xr8;
import X.C890910YxF;
import X.C890940YxI;
import X.C893000Z1m;
import X.C895920ZCs;
import X.C895930ZCt;
import X.C895940ZCu;
import X.C895950ZCv;
import X.C895960ZCw;
import X.C903320ZcA;
import X.InterfaceC1398730mVD;
import X.InterfaceC461380I7k;
import X.InterfaceC893080Z1u;
import X.InterfaceC893120Z1y;
import Y.ACListenerS117S0200000_14;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.IMVoiceMessageUtil;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.api.ability.IMBusinessInfoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMRelationLabelInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMProfileDisplayHostBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.IMMessageListTranslationViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot.GroupWithStoryAvatarReusedSkeletonUIContent;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.text.content.TextTranslateAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileItemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.profileitem.ProfileReusedUISlot;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.im.service.service.IDMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes15.dex */
public class AFwS298S0000000_14 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(20);
    public final int $t;

    public static AFwS298S0000000_14 get$arr$(int i) {
        AFwS298S0000000_14 aFwS298S0000000_14 = (AFwS298S0000000_14) arr$.get(i);
        if (aFwS298S0000000_14 != null) {
            return aFwS298S0000000_14;
        }
        arr$.compareAndSet(i, null, new AFwS298S0000000_14(i));
        return (AFwS298S0000000_14) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS298S0000000_14(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        TextTranslateAssem textTranslateAssem = (TextTranslateAssem) obj;
        if (Intrinsics.LJFF(((C291001Au) obj2).LIZ, C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid())) {
            IMMessageListTranslationViewModel iMMessageListTranslationViewModelFp = textTranslateAssem.Fp();
            iMMessageListTranslationViewModelFp.getClass();
            iMMessageListTranslationViewModelFp.setState(AFwS248S0000000_14.get$arr$(543));
            AwS415S0200000_14 awS415S0200000_14 = textTranslateAssem.LLLJL;
            if (awS415S0200000_14 != null) {
                awS415S0200000_14.invoke();
                textTranslateAssem.LLLJL = null;
            }
            textTranslateAssem.Qp().AQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        TextTranslateAssem textTranslateAssem = (TextTranslateAssem) obj;
        if (Intrinsics.LJFF(((C291001Au) obj2).LIZ, C0I6Y.LIZ((InterfaceC461380I7k) C631370Opb.LIZ(textTranslateAssem)).getUuid())) {
            IMMessageListTranslationViewModel iMMessageListTranslationViewModelFp = textTranslateAssem.Fp();
            iMMessageListTranslationViewModelFp.getClass();
            iMMessageListTranslationViewModelFp.setState(AFwS248S0000000_14.get$arr$(542));
            textTranslateAssem.Qp().zQ2();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        InterfaceC893120Z1y interfaceC893120Z1yLJIIZILJ = ((InterfaceC893080Z1u) obj2).LJIIZILJ();
        if (interfaceC893120Z1yLJIIZILJ != null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C0Z2A(interfaceC893120Z1yLJIIZILJ, baseActionViewModel, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        View viewLIZIZ;
        String singleChatFromUserId;
        String str;
        ProfileReusedUISlot profileReusedUISlot = (ProfileReusedUISlot) obj;
        AbstractC895980ZCy abstractC895980ZCy = (AbstractC895980ZCy) obj2;
        profileReusedUISlot.getClass();
        if (abstractC895980ZCy instanceof C895940ZCu) {
            TextView textView = (TextView) profileReusedUISlot.LLLFZ.getValue();
            if (textView != null) {
                textView.setText(((C895940ZCu) abstractC895980ZCy).LIZ);
            }
            View view = (View) profileReusedUISlot.LLLFZ.getValue();
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            View view2 = profileReusedUISlot.LLLI;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            ProfileItemViewModel profileItemViewModelOp = profileReusedUISlot.op();
            if (!profileItemViewModelOp.LLJ) {
                profileItemViewModelOp.LLJ = true;
                C830490Whz c830490Whz = new C830490Whz();
                IMRelationLabelInfo iMRelationLabelInfo = profileItemViewModelOp.LLILZIL;
                if (iMRelationLabelInfo != null && (str = iMRelationLabelInfo.mobValue) != null) {
                    c830490Whz.put("relation_signal", str);
                }
                c830490Whz.put("enter_from", "chat");
                SessionInfo sessionInfoXQ2 = profileItemViewModelOp.xQ2();
                if (sessionInfoXQ2 != null && (singleChatFromUserId = sessionInfoXQ2.getSingleChatFromUserId()) != null) {
                    c830490Whz.put("to_user_id", singleChatFromUserId);
                }
                c830490Whz.put("chat_type", C1677606ha.LIZ(((Number) profileItemViewModelOp.LLILLL.getValue()).intValue()));
                c830490Whz.put("conversation_id", profileItemViewModelOp.vQ2());
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_relation_label_show", c830490Whz);
            }
        } else if (abstractC895980ZCy instanceof C895950ZCv) {
            if (profileReusedUISlot.LLLI == null) {
                IMProfileDisplayHostBridge.LIZ.getClass();
                IMProfileDisplayHostBridge value = C895960ZCw.LIZIZ.getValue();
                if (value != null) {
                    viewLIZIZ = value.LIZIZ((ViewGroup) profileReusedUISlot.LLLFFI.getValue());
                } else {
                    viewLIZIZ = null;
                }
                profileReusedUISlot.LLLI = viewLIZIZ;
            }
            View view3 = (View) profileReusedUISlot.LLLFZ.getValue();
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            IMProfileDisplayHostBridge.LIZ.getClass();
            IMProfileDisplayHostBridge value2 = C895960ZCw.LIZIZ.getValue();
            if (value2 != null) {
                value2.LIZLLL(profileReusedUISlot.LLLI, ((C895950ZCv) abstractC895980ZCy).LIZ);
            }
        } else if (Intrinsics.LJFF(abstractC895980ZCy, C0ZD2.LIZ)) {
            View view4 = (View) profileReusedUISlot.LLLFZ.getValue();
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            View view5 = profileReusedUISlot.LLLI;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(8, view5);
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        ProfileReusedUISlot profileReusedUISlot = (ProfileReusedUISlot) obj;
        AbstractC895970ZCx abstractC895970ZCx = (AbstractC895970ZCx) obj2;
        profileReusedUISlot.getClass();
        if (abstractC895970ZCx instanceof C895930ZCt) {
            RelationButton relationButtonSp = profileReusedUISlot.sp();
            C786410Ut5.t0(relationButtonSp, 0);
            relationButtonSp.setButtonVariant(1);
            relationButtonSp.setText(2131849943);
            C786410Ut5.pa(relationButtonSp, new ACListenerS117S0200000_14(profileReusedUISlot, abstractC895970ZCx, 11));
            ProfileItemViewModel profileItemViewModelOp = profileReusedUISlot.op();
            if (!profileItemViewModelOp.LLJI) {
                profileItemViewModelOp.LLJI = true;
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("ttsocial_chat_view_profile_btn_show", profileItemViewModelOp.wQ2());
            }
        } else if (abstractC895970ZCx instanceof C895920ZCs) {
            RelationButton relationButtonSp2 = profileReusedUISlot.sp();
            C786410Ut5.t0(relationButtonSp2, 8);
            relationButtonSp2.setButtonVariant(0);
            C786410Ut5.pa(relationButtonSp2, null);
            IMProfileDisplayHostBridge.LIZ.getClass();
            IMProfileDisplayHostBridge value = C895960ZCw.LIZIZ.getValue();
            if (value != null) {
                C2201941BFw c2201941BFw = IMUser.Companion;
                IMUser iMUser = ((C895920ZCs) abstractC895970ZCx).LIZ;
                c2201941BFw.getClass();
                value.LIZJ(C2201941BFw.LJII(iMUser), profileReusedUISlot.sp(), profileReusedUISlot);
            }
        } else if (Intrinsics.LJFF(abstractC895970ZCx, C0ZD1.LIZ)) {
            C786410Ut5.pa(profileReusedUISlot.sp(), null);
            IMProfileDisplayHostBridge.LIZ.getClass();
            IMProfileDisplayHostBridge value2 = C895960ZCw.LIZIZ.getValue();
            if (value2 != null) {
                value2.LIZ(profileReusedUISlot.sp());
            }
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        IMUser iMUser;
        String singleChatFromUserId;
        Fragment fragmentLJI;
        IMBusinessInfoAbility iMBusinessInfoAbility;
        ProfileReusedUISlot profileReusedUISlot = (ProfileReusedUISlot) obj;
        AnonymousClass0699 anonymousClass0699 = (AnonymousClass0699) obj2;
        if (anonymousClass0699 != null) {
            iMUser = anonymousClass0699.LIZ;
        } else {
            iMUser = null;
        }
        profileReusedUISlot.op().yQ2(iMUser);
        if (((iMUser != null && (singleChatFromUserId = iMUser.getUid()) != null) || (singleChatFromUserId = profileReusedUISlot.tp().getSingleChatFromUserId()) != null) && singleChatFromUserId.length() > 0 && (fragmentLJI = C724240Sb0.LJI(profileReusedUISlot)) != null && (iMBusinessInfoAbility = (IMBusinessInfoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IMBusinessInfoAbility.class, null)) != null) {
            iMBusinessInfoAbility.c71(singleChatFromUserId);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AFwS298S0000000_14 r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS298S0000000_14.invoke$14(kotlin.jvm.internal.AFwS298S0000000_14, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            AtomicBoolean atomicBoolean = C860540XpM.LIZIZ;
            if (!atomicBoolean.get()) {
                C01GW c01gw = C860540XpM.LJII;
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    if (atomicBoolean.compareAndSet(false, true)) {
                        AnonymousClass0956 anonymousClass0956 = C860540XpM.LJIIIZ;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                    }
                } else {
                    atomicBoolean.set(true);
                }
                C860580XpQ.LIZIZ.start();
                C095D c095d = new C095D(new C860300Xoy(null));
                C1DFH c1dfh = C0PEM.LIZ;
                C2501109r7 c2501109r7 = new C2501109r7(new C05J7(null), new C861640Xr8(new C860550XpN(null), C09IC.LJIL(c095d, c1dfh)), 0);
                if (((Boolean) c01gw.getValue()).booleanValue()) {
                    C860540XpM.LJIIIZ = C09IC.LJJI(C860540XpM.LJIIIIZZ, c2501109r7);
                } else {
                    C09IC.LJJI(C2296808zG.LIZ(c1dfh), c2501109r7);
                }
            }
            C860540XpM.LIZ.LIZIZ = str;
        } else if (!C0BWC.LIZ() || C860540XpM.LIZIZ.get()) {
            C860540XpM.LIZIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            AtomicBoolean atomicBoolean = C860540XpM.LJI;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C860580XpQ.LIZIZ.start();
            }
        } else {
            AtomicBoolean atomicBoolean2 = C860540XpM.LJI;
            if (atomicBoolean2.get()) {
                atomicBoolean2.set(false);
                C860580XpQ.LIZIZ.end();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        String str = (String) obj2;
        if (((Boolean) obj).booleanValue()) {
            AtomicBoolean atomicBoolean = C860340Xp2.LIZIZ;
            if (!atomicBoolean.get()) {
                atomicBoolean.set(true);
                C095D c095d = new C095D(new C860290Xox(null));
                C1DFH c1dfh = C0PEM.LIZ;
                C09IC.LJJI(C2296808zG.LIZ(c1dfh), new C2501109r7(new C05J8(null), new C861640Xr8(new C860320Xp0(null), C09IC.LJIL(c095d, c1dfh)), 0));
            }
            C860340Xp2.LIZ.LIZIZ = str;
        } else if (!C0BWC.LIZ() || C860340Xp2.LIZIZ.get()) {
            C860340Xp2.LIZ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        BaseActionViewModel baseActionViewModel = (BaseActionViewModel) obj;
        InterfaceC893080Z1u interfaceC893080Z1u = (InterfaceC893080Z1u) obj2;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C890940YxI(interfaceC893080Z1u, baseActionViewModel, null), 3);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseActionViewModel), null, null, new C890910YxF(interfaceC893080Z1u, baseActionViewModel, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        ((C1391990mKL) obj2).LIZIZ = true;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        C0YMW c0ymw;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0ymw = (C0YMW) c291001Au.LIZ()) != null) {
            IIMErrorUtils.LIZ.getClass();
            IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
            if (iIMErrorUtilsLIZ != null) {
                iIMErrorUtilsLIZ.LIZLLL(uIAssem.LJJIJL().getContext(), c0ymw);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        if (C289880BXu.LIZIZ()) {
            IDMGeckoCommonChannelManager iDMGeckoCommonChannelManager = (IDMGeckoCommonChannelManager) PluggableExtentionKt.pluggableSpi$default(IDMGeckoCommonChannelManager.class, false, false, false, 14, null);
            if (iDMGeckoCommonChannelManager != null) {
                iDMGeckoCommonChannelManager.LJIIJ();
            }
            if (C288960BUg.LIZ()) {
                IMAIGroupShotBridgeApi.LIZ.getClass();
                IMAIGroupShotBridgeApi iMAIGroupShotBridgeApiLIZ = C1708606ma.LIZ();
                if (iMAIGroupShotBridgeApiLIZ != null) {
                    iMAIGroupShotBridgeApiLIZ.LIZ();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        LifecycleRegistry lifecycle = ((AbstractC738140SxQ) obj).getLifecycle();
        IMVoiceMessageUtil.LIZ.getClass();
        lifecycle.addObserver(IMVoiceMessageUtil.LJIIIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        Integer numValueOf;
        String uid;
        Long lLJIILIIL;
        InterfaceC1398730mVD interfaceC1398730mVD;
        GroupWithStoryAvatarReusedSkeletonUIContent groupWithStoryAvatarReusedSkeletonUIContent = (GroupWithStoryAvatarReusedSkeletonUIContent) obj;
        List list = (List) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemViewCreated, memberIdList size: ");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        IMUser iMUser = groupWithStoryAvatarReusedSkeletonUIContent.LLLI;
        if (iMUser != null && (uid = iMUser.getUid()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(uid)) != null) {
            long jLongValue = lLJIILIIL.longValue();
            if (list != null && !list.isEmpty() && !list.contains(Long.valueOf(jLongValue)) && (interfaceC1398730mVD = groupWithStoryAvatarReusedSkeletonUIContent.LLJZIJLIL) != null) {
                interfaceC1398730mVD.reset();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        InterfaceC1398730mVD interfaceC1398730mVD;
        GroupWithStoryAvatarReusedSkeletonUIContent groupWithStoryAvatarReusedSkeletonUIContent = (GroupWithStoryAvatarReusedSkeletonUIContent) obj;
        if (!((Boolean) obj2).booleanValue() && (interfaceC1398730mVD = groupWithStoryAvatarReusedSkeletonUIContent.LLJZIJLIL) != null) {
            interfaceC1398730mVD.reset();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        BaseSwitchActionViewModel baseSwitchActionViewModel = (BaseSwitchActionViewModel) obj;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(baseSwitchActionViewModel), null, null, new C893000Z1m((InterfaceC893080Z1u) obj2, baseSwitchActionViewModel, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        final Context context = (Context) obj;
        final String str = (String) obj2;
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, str);
        smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0Ze7
            @Override // com.bytedance.router.OpenResultCallback
            public final void onActionResult(Object obj3) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onEmpty() {
                C1951107kb.LIZ(this);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onIntercept(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMatched(String str2) {
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final /* synthetic */ void onOpen(Intent intent) {
                C1951107kb.LIZIZ(this, intent);
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onMissed(String str2) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131832165);
                    c1389890mGx.LJIIJJI();
                }
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onSuccess(Intent intent) {
                C19EG c19eg;
                FragmentManager supportFragmentManager;
                Fragment fragmentLJJJJZI;
                DialogFragment dialogFragment;
                if (a0.LJJIIZI(str, "//now/feed", false)) {
                    Activity activityLIZ = C1388190mED.LIZ(context);
                    if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("quick_chat_sheet")) != null && (fragmentLJJJJZI instanceof TuxSheet) && (dialogFragment = (DialogFragment) fragmentLJJJJZI) != null) {
                        dialogFragment.dismiss();
                    }
                }
            }

            @Override // com.bytedance.router.OpenResultCallback
            public final void onFail(String str2, String str3) {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131832165);
                    c1389890mGx.LJIIJJI();
                }
            }
        });
        smartRouteBuildRoute.open();
        return Boolean.TRUE;
    }

    public static final Object invoke$9(AFwS298S0000000_14 aFwS298S0000000_14, Object obj, Object obj2) {
        C20684815ws.LJIILLIIL((String) obj, (Map) obj2);
        return Unit.LIZ;
    }
}
