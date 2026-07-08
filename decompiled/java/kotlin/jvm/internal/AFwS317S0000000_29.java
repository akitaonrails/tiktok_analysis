package kotlin.jvm.internal;

import X.AbstractC1252750ihl;
import X.AbstractC468201s0;
import X.C09AY;
import X.C0GRM;
import X.C11EI;
import X.C11EJ;
import X.C11RO;
import X.C1265420j2C;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1391190mJ3;
import X.C1411160mpG;
import X.C14MJ;
import X.C19371610qY;
import X.C19392710tx;
import X.C19472311Gf;
import X.C19472411Gg;
import X.C19472611Gi;
import X.C1954807lC;
import X.C2188811AlT;
import X.C291001Au;
import X.C786410Ut5;
import X.DialogC1389620mGW;
import X.EnumC1411170mpH;
import X.EnumC19371710qZ;
import X.InterfaceC1891350zJl;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.challenge.viewmodel.ChallengeDetailState;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.top.TopStatusBarAssem;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.InvitationInfo;
import com.ss.android.ugc.aweme.im.common.model.QRCodeGroupChatLayout;
import com.ss.android.ugc.aweme.msg.qrcode.AbstractQrGroupCreationAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.ug.IUgCommonService;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes30.dex */
public class AFwS317S0000000_29 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(27);
    public final int $t;

    public static AFwS317S0000000_29 get$arr$(int i) {
        AFwS317S0000000_29 aFwS317S0000000_29 = (AFwS317S0000000_29) arr$.get(i);
        if (aFwS317S0000000_29 != null) {
            return aFwS317S0000000_29;
        }
        arr$.compareAndSet(i, null, new AFwS317S0000000_29(i));
        return (AFwS317S0000000_29) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
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
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS317S0000000_29(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$11(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        List list = (List) obj2;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : (List) obj) {
            if (interfaceC1891350zJl instanceof C1265420j2C) {
                C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl;
                if (hashSet.add(c1265420j2C.LLILLJJLI.getUid())) {
                    arrayList.add(C1265420j2C.LIZ(c1265420j2C, i));
                    i++;
                }
            }
            arrayList.add(interfaceC1891350zJl);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1265420j2C c1265420j2C2 = (C1265420j2C) ((InterfaceC1891350zJl) it2.next());
            if (hashSet.add(c1265420j2C2.LLILLJJLI.getUid())) {
                arrayList.add(C1265420j2C.LIZ(c1265420j2C2, i));
                i++;
            }
        }
        return arrayList;
    }

    public static final Object invoke$13(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        List list = (List) obj2;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (InterfaceC1891350zJl interfaceC1891350zJl : (List) obj) {
            if (interfaceC1891350zJl instanceof C1265420j2C) {
                C1265420j2C c1265420j2C = (C1265420j2C) interfaceC1891350zJl;
                if (hashSet.add(c1265420j2C.LLILLJJLI.getUid())) {
                    arrayList.add(C1265420j2C.LIZ(c1265420j2C, i));
                    i++;
                }
            }
            arrayList.add(interfaceC1891350zJl);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1265420j2C c1265420j2C2 = (C1265420j2C) ((InterfaceC1891350zJl) it2.next());
            if (hashSet.add(c1265420j2C2.LLILLJJLI.getUid())) {
                arrayList.add(C1265420j2C.LIZ(c1265420j2C2, i));
                i++;
            }
        }
        return arrayList;
    }

    public static final Object invoke$14(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return ((ChallengeDetailState) obj).copy((AbstractC1252750ihl) obj2);
    }

    public static final Object invoke$17(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return new C11EJ(obj2, (C11RO) C11EI.LIZJ.invoke());
    }

    public static final Object invoke$18(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return new C19472411Gg((ViewGroup) obj, (Function0) obj2);
    }

    public static final Object invoke$19(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return new C19472611Gi((ViewGroup) obj, (Function0) obj2);
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        TopStatusBarAssem topStatusBarAssem = (TopStatusBarAssem) obj;
        int i = C19371610qY.LIZ[((EnumC19371710qZ) obj2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TuxIconView tuxIconView = topStatusBarAssem.LLJJJJLIIL;
                    if (tuxIconView != null) {
                        tuxIconView.setIconRes(R.raw.icon_wifi);
                    }
                    TuxIconView tuxIconView2 = topStatusBarAssem.LLJJJJLIIL;
                    if (tuxIconView2 != null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                TuxIconView tuxIconView3 = topStatusBarAssem.LLJJJJLIIL;
                if (tuxIconView3 != null) {
                    tuxIconView3.setIconRes(R.raw.icon_network);
                }
                TuxIconView tuxIconView4 = topStatusBarAssem.LLJJJJLIIL;
                if (tuxIconView4 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
                }
            }
        } else {
            TuxIconView tuxIconView5 = topStatusBarAssem.LLJJJJLIIL;
            if (tuxIconView5 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView5, 8);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return new C19472311Gf((ViewGroup) obj, (Function0) obj2);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$21(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$22(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj2, new C19392710tx());
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJ((View) obj2, new C19392710tx());
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        NotificationChoiceState notificationChoiceState = (NotificationChoiceState) obj;
        return notificationChoiceState.copy(notificationChoiceState.userId, notificationChoiceState.secUserId, notificationChoiceState.isSelf, (ListState) obj2, notificationChoiceState.isHotsoonHasMore, notificationChoiceState.vcdCount, notificationChoiceState.hotsoonText, notificationChoiceState.pushSwitchState, notificationChoiceState.unreadCountMap, notificationChoiceState.unreadUidList);
    }

    public static final Object invoke$25(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        PostNotificationStatus postNotificationStatus = (PostNotificationStatus) obj;
        return postNotificationStatus.copy(postNotificationStatus.uid, postNotificationStatus.secUid, (ListState) obj2, postNotificationStatus.isHotSoonHasMore, postNotificationStatus.vcdCount, postNotificationStatus.hotSoonText, postNotificationStatus.pushSwitchState, postNotificationStatus.friendsPushSwitchState, postNotificationStatus.unreadCountMap, postNotificationStatus.unreadUidList);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$26(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        TopStatusBarAssem topStatusBarAssem = (TopStatusBarAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            TuxIconView tuxIconView = topStatusBarAssem.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            C0GRM c0grm = topStatusBarAssem.LLJJL;
            if (c0grm != null) {
                c0grm.setCharging(true);
            }
            C0GRM c0grm2 = topStatusBarAssem.LLJJL;
            if (c0grm2 != null) {
                c0grm2.invalidate();
            }
        } else {
            TuxIconView tuxIconView2 = topStatusBarAssem.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            C0GRM c0grm3 = topStatusBarAssem.LLJJL;
            if (c0grm3 != null) {
                c0grm3.setCharging(false);
            }
            C0GRM c0grm4 = topStatusBarAssem.LLJJL;
            if (c0grm4 != null) {
                c0grm4.invalidate();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        TopStatusBarAssem topStatusBarAssem = (TopStatusBarAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (iIntValue > 100) {
            iIntValue = 100;
        } else if (iIntValue < 0) {
            iIntValue = 0;
        }
        TuxTextView tuxTextView = topStatusBarAssem.LLJJJJJIL;
        if (tuxTextView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(iIntValue);
            sbLIZ.append('%');
            tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C0GRM c0grm = topStatusBarAssem.LLJJL;
        if (c0grm != null) {
            c0grm.setBatteryLevel(iIntValue);
        }
        C0GRM c0grm2 = topStatusBarAssem.LLJJL;
        if (c0grm2 != null) {
            c0grm2.invalidate();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        TopStatusBarAssem topStatusBarAssem = (TopStatusBarAssem) obj;
        long jLongValue = ((Number) obj2).longValue();
        TuxTextView tuxTextView = topStatusBarAssem.LLJJJJ;
        if (tuxTextView != null) {
            tuxTextView.setText(topStatusBarAssem.cp(jLongValue));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        AbstractQrGroupCreationAssem abstractQrGroupCreationAssem = (AbstractQrGroupCreationAssem) obj;
        if (((Boolean) obj2).booleanValue()) {
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) abstractQrGroupCreationAssem.LLJZ.getValue();
            if (dialogC1389620mGW != null) {
                C786410Ut5.J4(dialogC1389620mGW);
            }
        } else {
            Dialog dialog = (Dialog) abstractQrGroupCreationAssem.LLJZ.getValue();
            if (dialog != null) {
                dialog.hide();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        QRCodeGroupChatLayout qRCodeGroupChatLayoutYQ2;
        final String str;
        final AbstractQrGroupCreationAssem abstractQrGroupCreationAssem = (AbstractQrGroupCreationAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receive shareContentLoadStatus change: ");
        sbLIZ.append(c291001Au.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        IUgCommonService iUgCommonService = (IUgCommonService) PluggableExtentionKt.pluggableSpiForReal(IUgCommonService.class);
        if (iUgCommonService != null && iUgCommonService.LJIIIZ() != null) {
            int i = C1411160mpG.LIZ[((EnumC1411170mpH) c291001Au.LIZ).ordinal()];
            if (i != 1) {
                if (i == 2 && (qRCodeGroupChatLayoutYQ2 = abstractQrGroupCreationAssem.op().yQ2()) != null) {
                    ((TextView) abstractQrGroupCreationAssem.LLJLLIL.getValue()).setText(qRCodeGroupChatLayoutYQ2.title);
                    InvitationInfo invitationInfo = qRCodeGroupChatLayoutYQ2.invitationInfo;
                    if (invitationInfo != null) {
                        str = invitationInfo.qrCodeUrl;
                    } else {
                        str = null;
                    }
                    C14MJ.LJIIIZ((ImageView) abstractQrGroupCreationAssem.LLJLL.getValue(), "qr_code_default_view");
                    C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
                    c1331670kl3LJI.LJJIJL(abstractQrGroupCreationAssem.getContext());
                    c1331670kl3LJI.LIZLLL("im_group_qr_code");
                    c1331670kl3LJI.LJJII(new AbstractC468201s0() { // from class: X.1185
                        @Override // X.InterfaceC1331910klR
                        public final void LIZ(Bitmap bitmap) {
                            ((ImageView) abstractQrGroupCreationAssem.LLJLL.getValue()).setImageBitmap(bitmap);
                        }

                        @Override // X.InterfaceC1331910klR
                        public final void onFailed(Throwable th) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("load qr code img failed, qrcode url: ");
                            sbLIZ2.append(str);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (th == null) {
                                new Throwable("TAG_AbstractQrGroupCreationAssem null throwable");
                            }
                        }
                    });
                }
            } else {
                C14MJ.LJIIIZ((ImageView) abstractQrGroupCreationAssem.LLJLL.getValue(), "qr_code_default_view");
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }

    public static final Object invoke$10(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj2;
    }

    public static final Object invoke$12(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj2;
    }

    public static final Object invoke$15(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }

    public static final Object invoke$16(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$8(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }

    public static /* bridge */ /* synthetic */ Object invoke$9(AFwS317S0000000_29 aFwS317S0000000_29, Object obj, Object obj2) {
        return obj;
    }
}
