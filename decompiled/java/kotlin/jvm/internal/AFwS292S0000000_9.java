package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.AbstractC621770Oa7;
import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C005K;
import X.C005L;
import X.C005M;
import X.C005N;
import X.C09AY;
import X.C0I0B;
import X.C0N7M;
import X.C0NMY;
import X.C0O0J;
import X.C0O0L;
import X.C0O1N;
import X.C0OCS;
import X.C0OCZ;
import X.C0OEI;
import X.C0OG8;
import X.C0OGD;
import X.C0OKY;
import X.C0OL6;
import X.C0OPX;
import X.C0OTS;
import X.C0P0T;
import X.C0PEM;
import X.C0PH8;
import X.C0PLT;
import X.C0WZX;
import X.C1208904oB;
import X.C123100dR;
import X.C1325470kb3;
import X.C1357705Tb;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1478160oZK;
import X.C1558520qew;
import X.C1623606Xi;
import X.C1845940y8W;
import X.C1846060y8i;
import X.C19EG;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2276471E8n;
import X.C23250099c;
import X.C2341109Fh;
import X.C291001Au;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C595980NZc;
import X.C615560OCk;
import X.C615630OCr;
import X.C615690OCx;
import X.C618210OMp;
import X.C621760Oa6;
import X.C627780Ojo;
import X.C627950Ok5;
import X.C628090OkJ;
import X.C628170OkR;
import X.C631230OpN;
import X.C631370Opb;
import X.C631630Oq1;
import X.C631680Oq6;
import X.C632080Oqk;
import X.C632090Oql;
import X.C633570Ot9;
import X.C633590OtB;
import X.C633600OtC;
import X.C633660OtI;
import X.C633710OtN;
import X.C634750Ov3;
import X.C639060P4u;
import X.C693070RGn;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C735370Ssx;
import X.C735840Sti;
import X.C737030Svd;
import X.C814420VxA;
import X.EnumC617010OHz;
import X.EnumC617480OJu;
import X.EnumC631610Opz;
import X.InterfaceC1680500tpg;
import X.InterfaceC1891350zJl;
import X.InterfaceC665370Q7z;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailListModel;
import com.ss.android.ugc.aweme.aime.model.AIMEDetailModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailAwemeListModel;
import com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailListModel;
import com.ss.android.ugc.aweme.creativedetail.datamodel.CreativeToolDetailModel;
import com.ss.android.ugc.aweme.discover.model.DiscoverSectionItem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.guide.view.ECPhotoSearchBubbleAssem;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonVM;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.ability.BulletinCommentSheetAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.share.BulletinShareModel;
import com.ss.android.ugc.aweme.music.assem.list.cell.spotlight.MusicCellSpotlightItemAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCollectIconAssem;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinChannelAccessControl;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.model.SearchMixFeedBase;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.first.music.StoryMusicCoverComponent;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailListModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursHubAbility;
import com.ss.android.ugc.tiktok.addyours.hub.ability.AddYoursTabAbility;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubListAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes10.dex */
public class AFwS292S0000000_9 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(76);
    public final int $t;

    public static AFwS292S0000000_9 get$arr$(int i) {
        AFwS292S0000000_9 aFwS292S0000000_9 = (AFwS292S0000000_9) arr$.get(i);
        if (aFwS292S0000000_9 != null) {
            return aFwS292S0000000_9;
        }
        arr$.compareAndSet(i, null, new AFwS292S0000000_9(i));
        return (AFwS292S0000000_9) arr$.get(i);
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
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS292S0000000_9(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) ((C291001Au) obj2).LIZ();
        if (C123100dR.LIZ(str) && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((AbstractC738140SxQ) obj), C0PEM.LIZJ.plus(new C639060P4u(CoroutineExceptionHandler.LJJLIL, 6)), null, new C1325470kb3(null), 2);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C0OL6 c0ol6;
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c0ol6 = (C0OL6) c291001Au.LIZ()) != null && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJFF(c0ol6.LIZ);
            c1389890mGx.LJIIIZ(c0ol6.LIZIZ);
            c1389890mGx.LJII(R.attr.zi);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C618210OMp.LIZ((AbstractC1623806Xk) obj2, (AbstractC1623806Xk) obj);
    }

    public static final Object invoke$14(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (Intrinsics.LJFF(((C291001Au) obj2).LIZ(), Boolean.TRUE) && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String string = (String) ((C291001Au) obj2).LIZ();
        if (string != null || ((fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null && (string = fragmentLJI.getString(2131828035)) != null)) {
            C0OPX.LJIIZILJ(C724240Sb0.LJI(abstractC738140SxQ), string);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$16(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        MusicDetail musicDetail = (MusicDetail) obj2;
        if (musicDetail != null) {
            return new C0OG8(musicDetail);
        }
        return null;
    }

    public static final Object invoke$17(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        MusicDetail musicDetail = (MusicDetail) obj2;
        if (musicDetail != null) {
            return new C0OGD(musicDetail);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$18(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C633660OtI c633660OtI = (C633660OtI) ((C291001Au) obj2).LIZ;
        if (c633660OtI != null) {
            if (c633660OtI.LIZ) {
                int i = C633570Ot9.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        Fragment fragmentLJI2 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI2 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
                            c1389890mGx.LJIIJ(fragmentLJI2.getString(2131839298));
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI3 != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI3);
                            c1389890mGx2.LJIIJ(fragmentLJI3.getString(2131839299, Integer.valueOf(c633660OtI.LIZJ)));
                            c1389890mGx2.LJIIJJI();
                        }
                    }
                } else {
                    Fragment fragmentLJI4 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI4 != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(fragmentLJI4);
                        c1389890mGx3.LJIIIZ(2131839297);
                        c1389890mGx3.LJIIJJI();
                    }
                }
            } else {
                int i2 = C633570Ot9.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3 && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
                        C1389890mGx c1389890mGx4 = new C1389890mGx(fragmentLJI);
                        c1389890mGx4.LJIIJ(fragmentLJI.getString(2131839300));
                        c1389890mGx4.LJIIJJI();
                    }
                } else {
                    Fragment fragmentLJI5 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI5 != null) {
                        C1389890mGx c1389890mGx5 = new C1389890mGx(fragmentLJI5);
                        c1389890mGx5.LJIIIZ(2131839301);
                        c1389890mGx5.LJIIJJI();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$19(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        int i;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        Boolean bool = (Boolean) ((C291001Au) obj2).LIZ;
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 2131837741;
            } else {
                i = 2131829440;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AIMEDetailListModel aIMEDetailListModel = (AIMEDetailListModel) obj2;
        if (aIMEDetailListModel != null) {
            return new C615630OCr(aIMEDetailListModel);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Activity activityLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            boolean zBooleanValue = ((Boolean) c291001Au.LIZ).booleanValue();
            Context context = abstractC738140SxQ.getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                if (zBooleanValue) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131834420);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ);
                    c1389890mGx2.LJIIIZ(2131829440);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        String str;
        Context context;
        Activity activityLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null && (context = abstractC738140SxQ.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$22(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C633660OtI c633660OtI = (C633660OtI) ((C291001Au) obj2).LIZ;
        if (c633660OtI != null) {
            if (c633660OtI.LIZ) {
                int i = C633590OtB.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        Fragment fragmentLJI2 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI2 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
                            c1389890mGx.LJIIJ(fragmentLJI2.getString(2131839298));
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI3 != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI3);
                            c1389890mGx2.LJIIJ(fragmentLJI3.getString(2131839299, Integer.valueOf(c633660OtI.LIZJ)));
                            c1389890mGx2.LJIIJJI();
                        }
                    }
                } else {
                    Fragment fragmentLJI4 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI4 != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(fragmentLJI4);
                        c1389890mGx3.LJIIIZ(2131839297);
                        c1389890mGx3.LJIIJJI();
                    }
                }
            } else {
                int i2 = C633590OtB.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3 && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
                        C1389890mGx c1389890mGx4 = new C1389890mGx(fragmentLJI);
                        c1389890mGx4.LJIIJ(fragmentLJI.getString(2131839300));
                        c1389890mGx4.LJIIJJI();
                    }
                } else {
                    Fragment fragmentLJI5 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI5 != null) {
                        C1389890mGx c1389890mGx5 = new C1389890mGx(fragmentLJI5);
                        c1389890mGx5.LJIIIZ(2131839301);
                        c1389890mGx5.LJIIJJI();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$23(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ReusedUISlotAssem reusedUISlotAssem = (ReusedUISlotAssem) obj;
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            C631230OpN.LIZJ(reusedUISlotAssem.getContentView());
        } else {
            C631230OpN.LIZ(reusedUISlotAssem.getContentView());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$24(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C633710OtN.LIZ.getClass();
        C633710OtN.LIZJ.LIZIZ(0, true);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$25(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ViewGroup.LayoutParams layoutParams;
        MusicCellSpotlightItemAssem musicCellSpotlightItemAssem = (MusicCellSpotlightItemAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        FixedRatioFrameLayout fixedRatioFrameLayout = musicCellSpotlightItemAssem.LLJL;
        if (fixedRatioFrameLayout != null && (layoutParams = fixedRatioFrameLayout.getLayoutParams()) != null) {
            layoutParams.width = iIntValue;
            FixedRatioFrameLayout fixedRatioFrameLayout2 = musicCellSpotlightItemAssem.LLJL;
            if (fixedRatioFrameLayout2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(fixedRatioFrameLayout2);
                fixedRatioFrameLayout2.setLayoutParams(layoutParams);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$26(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        TuxIconView tuxIconView = ((MusicCellCollectIconAssem) obj).LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            if (zBooleanValue) {
                i = R.raw.icon_bookmark_fill;
            } else {
                i = R.raw.icon_bookmark;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$27(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        String str;
        ReusedUIAssem reusedUIAssem = (ReusedUIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (str = (String) c291001Au.LIZ) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(reusedUIAssem.LJJIJL());
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$28(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        int iIntValue;
        ((Number) obj).intValue();
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj2;
        if (interfaceC1891350zJl instanceof C632080Oqk) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("spotlight_");
            sbLIZ.append(((C632090Oql) interfaceC1891350zJl).getMusicModel().getMusicId());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (interfaceC1891350zJl instanceof C632090Oql) {
            C632090Oql c632090Oql = (C632090Oql) interfaceC1891350zJl;
            if (!c632090Oql.getMusicItemModel().isSimilarMusic() && !c632090Oql.getMusicItemModel().isHighlightedSimilarMusic()) {
                if (c632090Oql.getMusicItemModel().isHighlighted()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("highlighted_music_");
                    sbLIZ2.append(c632090Oql.getMusicModel().getMusicId());
                    return C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (c632090Oql.getMusicItemModel().pinStatus == EnumC631610Opz.PINNED) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("pinned_music_");
                    sbLIZ3.append(c632090Oql.getMusicModel().getMusicId());
                    return C2188811AlT.LIZIZ(sbLIZ3);
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("music_");
                sbLIZ4.append(c632090Oql.getMusicModel().getMusicId());
                return C2188811AlT.LIZIZ(sbLIZ4);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("similar_music_");
            Integer num = c632090Oql.getMusicItemModel().sourceMusicIndex;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            sbLIZ5.append(iIntValue);
            sbLIZ5.append('_');
            sbLIZ5.append(c632090Oql.getMusicModel().getMusicId());
            return C2188811AlT.LIZIZ(sbLIZ5);
        }
        if (interfaceC1891350zJl instanceof C631630Oq1) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("music_title_");
            sbLIZ6.append(((C631630Oq1) interfaceC1891350zJl).LL);
            return C2188811AlT.LIZIZ(sbLIZ6);
        }
        if (interfaceC1891350zJl instanceof C005N) {
            return "highlight_v2";
        }
        if (interfaceC1891350zJl instanceof C005M) {
            return "highlight";
        }
        if (interfaceC1891350zJl instanceof C631680Oq6) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("fan_spotlight_title_");
            sbLIZ7.append(((C631680Oq6) interfaceC1891350zJl).LL);
            return C2188811AlT.LIZIZ(sbLIZ7);
        }
        if (interfaceC1891350zJl instanceof C005L) {
            return "fan_spotlight_error";
        }
        if (interfaceC1891350zJl instanceof C005K) {
            return "fan_spotlight_empty";
        }
        if (!(interfaceC1891350zJl instanceof C1357705Tb)) {
            return interfaceC1891350zJl;
        }
        return "fan_spotlight_block";
    }

    public static final /* bridge */ /* synthetic */ Object invoke$29(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AIMEDetailModel aIMEDetailModel = (AIMEDetailModel) obj2;
        if (aIMEDetailModel != null) {
            return new C615690OCx(aIMEDetailModel);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$30(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C633660OtI c633660OtI = (C633660OtI) ((C291001Au) obj2).LIZ;
        if (c633660OtI != null) {
            if (c633660OtI.LIZ) {
                int i = C633600OtC.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        Fragment fragmentLJI2 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI2 != null) {
                            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI2);
                            c1389890mGx.LJIIJ(fragmentLJI2.getString(2131839298));
                            c1389890mGx.LJIIJJI();
                        }
                    } else {
                        Fragment fragmentLJI3 = C724240Sb0.LJI(abstractC738140SxQ);
                        if (fragmentLJI3 != null) {
                            C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI3);
                            c1389890mGx2.LJIIJ(fragmentLJI3.getString(2131839299, Integer.valueOf(c633660OtI.LIZJ)));
                            c1389890mGx2.LJIIJJI();
                        }
                    }
                } else {
                    Fragment fragmentLJI4 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI4 != null) {
                        C1389890mGx c1389890mGx3 = new C1389890mGx(fragmentLJI4);
                        c1389890mGx3.LJIIIZ(2131839297);
                        c1389890mGx3.LJIIJJI();
                    }
                }
            } else {
                int i2 = C633600OtC.LIZ[c633660OtI.LIZIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 3 && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
                        C1389890mGx c1389890mGx4 = new C1389890mGx(fragmentLJI);
                        c1389890mGx4.LJIIJ(fragmentLJI.getString(2131839300));
                        c1389890mGx4.LJIIJJI();
                    }
                } else {
                    Fragment fragmentLJI5 = C724240Sb0.LJI(abstractC738140SxQ);
                    if (fragmentLJI5 != null) {
                        C1389890mGx c1389890mGx5 = new C1389890mGx(fragmentLJI5);
                        c1389890mGx5.LJIIIZ(2131839301);
                        c1389890mGx5.LJIIJJI();
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$31(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$32(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        T t;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (t = c291001Au.LIZ) != 0 && t == C0N7M.QUIT) {
            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ != null) {
                C2204961BRm.LLJJJ(c19egLIZ, -1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPq6bI+A0T2jvUDehdvsfnx1BMq+ae8qHoijmzvt/HBDoV4=", null));
            }
            C19EG c19egLIZ2 = C724240Sb0.LIZ(abstractC738140SxQ);
            if (c19egLIZ2 != null) {
                c19egLIZ2.finish();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$33(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        boolean z;
        C0PLT c0plt = (C0PLT) obj;
        if (c0plt.getFeedType() != 35 && c0plt.getFeedType() != 202) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final /* synthetic */ Object invoke$34(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        return Unit.LIZ;
    }

    public static final Object invoke$39(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C1389890mGx c1389890mGx = new C1389890mGx(((UIAssem) obj).LJJIJL());
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        SearchMixFeedBase searchMixFeedBase = (SearchMixFeedBase) obj;
        Aweme aweme = searchMixFeedBase.getAweme();
        String aid = null;
        if (aweme != null) {
            aid = aweme.getAid();
        }
        boolean z = true;
        if (!Intrinsics.LJFF(aid, obj2)) {
            List listLIZ = C0PH8.LIZ(searchMixFeedBase, C0NMY.GENERAL_SEARCH);
            if (listLIZ != null) {
                Iterator it2 = listLIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    String aid2 = ((Aweme) next).getAid();
                    if (aid2 != null && aid2.equals(obj2)) {
                        if (next == null) {
                            break;
                        }
                    }
                }
            } else {
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$40(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C693070RGn c693070RGn;
        StoryMusicCoverComponent storyMusicCoverComponent = (StoryMusicCoverComponent) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c693070RGn = (C693070RGn) c291001Au.LIZ) != null && Intrinsics.LJFF(c693070RGn.LIZ.getAid(), ((VideoItemParams) C631370Opb.LIZ(storyMusicCoverComponent)).getAweme().getAid())) {
            C20684815ws.LJFF().submit(new ARunnableS109S0100000_9(storyMusicCoverComponent, 131));
            storyMusicCoverComponent.Up();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$41(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        StoryMusicCoverComponent storyMusicCoverComponent = (StoryMusicCoverComponent) obj;
        if (obj2 != null) {
            C20684815ws.LJFF().submit(new ARunnableS109S0100000_9(storyMusicCoverComponent, 132));
            storyMusicCoverComponent.Up();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$42(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C1846060y8i c1846060y8i;
        UIAssem uIAssem = (UIAssem) obj;
        IndexedValue indexedValue = (IndexedValue) obj2;
        if (indexedValue != null) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                c1846060y8i = (C1846060y8i) viewLJJIJL.findViewById(R.id.d0r);
            } else {
                c1846060y8i = null;
            }
            C1845940y8W c1845940y8WLJII = c1846060y8i.LJII(indexedValue.LIZ);
            if (c1845940y8WLJII != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((BulletinEmojiTab) indexedValue.LIZIZ).tabName);
                sbLIZ.append(' ');
                sbLIZ.append(Math.max(0L, ((BulletinEmojiTab) indexedValue.LIZIZ).count - 1));
                c1845940y8WLJII.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$43(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$44(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        TemplateDetailListModel templateDetailListModel = (TemplateDetailListModel) obj2;
        if (templateDetailListModel != null) {
            return new C628090OkJ(templateDetailListModel);
        }
        return null;
    }

    public static final Object invoke$45(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        TemplateDetailModel templateDetailModel = (TemplateDetailModel) obj2;
        if (templateDetailModel != null) {
            return new C628170OkR(templateDetailModel);
        }
        return null;
    }

    public static final Object invoke$46(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem = (VideoAuthorInfoRelationAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        Object obj3 = null;
        if (c291001Au != null && c291001Au.LIZ != 0) {
            videoAuthorInfoRelationAssem.lq(((VideoItemParams) C631370Opb.LIZ(videoAuthorInfoRelationAssem)).getAweme());
            C724270Sb3 c724270Sb3 = videoAuthorInfoRelationAssem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            }
            videoAuthorInfoRelationAssem.jq(((VideoItemParams) obj3).getAweme());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C0O0L c0o0l = (C0O0L) obj2;
        if (obj != c0o0l && c0o0l != null) {
            int[] iArr = C0O0J.LIZ;
            c0o0l.ordinal();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, (BulletinShareModel) obj2, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483639);
    }

    public static final Object invoke$49(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, (BulletinChannelAccessControl) obj2, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483391);
    }

    public static final Object invoke$5(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        AddYoursEntranceButtonAssem addYoursEntranceButtonAssem = (AddYoursEntranceButtonAssem) obj;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderSelectedEvent, isVisible=");
        if (addYoursEntranceButtonAssem.LJJIJL().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        c2276471E8n.d("AddYoursEntranceButtonAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (obj2 != null && addYoursEntranceButtonAssem.LJJIJL().getVisibility() == 0) {
            addYoursEntranceButtonAssem.LLLII = true;
            addYoursEntranceButtonAssem.Gp();
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp = addYoursEntranceButtonAssem.Ep();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(addYoursEntranceButtonAssem);
            Context context = addYoursEntranceButtonAssem.getContext();
            C724270Sb3 c724270Sb3 = addYoursEntranceButtonAssem.LLJI;
            Object obj4 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            addYoursEntranceButtonVMEp.wQ2(interfaceC665370Q7zLJIIL, context, "add_yours_bottom_button_show", (VideoItemParams) obj3);
            AddYoursEntranceButtonVM addYoursEntranceButtonVMEp2 = addYoursEntranceButtonAssem.Ep();
            C724270Sb3 c724270Sb32 = addYoursEntranceButtonAssem.LLJI;
            if (c724270Sb32 != null) {
                obj4 = c724270Sb32.LL;
            }
            addYoursEntranceButtonVMEp2.xQ2((VideoItemParams) obj4, "trend_button_show");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$50(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, new C1623606Xi(obj2), null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483645);
    }

    public static final Object invoke$51(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, new C1623606Xi(obj2), null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483646);
    }

    public static final Object invoke$52(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, (EnumC617480OJu) obj2, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483519);
    }

    public static final Object invoke$53(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, (EnumC617010OHz) obj2, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483643);
    }

    public static final Object invoke$54(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, ((Number) obj2).longValue(), null, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, false, null, null, 2147483583);
    }

    public static final Object invoke$55(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return C0OKY.LIZ((C0OKY) obj, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, ((Number) obj2).longValue(), null, null, null, null, null, null, null, null, false, null, null, 2146959359);
    }

    public static final Object invoke$56(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        List<C615560OCk> list = (List) obj2;
        AddYoursTabAbility addYoursTabAbility = (AddYoursTabAbility) ((AddYoursHubListAssem) obj).LLJLL.getValue();
        if (addYoursTabAbility != null) {
            addYoursTabAbility.P41(list);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AddYoursHubAbility addYoursHubAbility;
        AddYoursHubListAssem addYoursHubListAssem = (AddYoursHubListAssem) obj;
        User user = (User) obj2;
        if (user != null && (addYoursHubAbility = (AddYoursHubAbility) addYoursHubListAssem.LLJLILLLLZIIL.getValue()) != null) {
            addYoursHubAbility.qL1(user);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$58(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C1846060y8i c1846060y8i;
        C1846060y8i c1846060y8i2;
        C1846060y8i c1846060y8i3;
        View viewFindViewById;
        UIAssem uIAssem = (UIAssem) obj;
        List<C0OEI> list = (List) obj2;
        View viewLJJIJL = uIAssem.LJJIJL();
        if (viewLJJIJL != null) {
            c1846060y8i = (C1846060y8i) viewLJJIJL.findViewById(R.id.wwq);
        } else {
            c1846060y8i = null;
        }
        c1846060y8i.LJIIJJI();
        if (list != null) {
            for (C0OEI c0oei : list) {
                View viewLJJIJL2 = uIAssem.LJJIJL();
                if (viewLJJIJL2 != null) {
                    c1846060y8i2 = (C1846060y8i) viewLJJIJL2.findViewById(R.id.wwq);
                } else {
                    c1846060y8i2 = null;
                }
                View viewLJJIJL3 = uIAssem.LJJIJL();
                if (viewLJJIJL3 != null) {
                    c1846060y8i3 = (C1846060y8i) viewLJJIJL3.findViewById(R.id.wwq);
                } else {
                    c1846060y8i3 = null;
                }
                C1845940y8W c1845940y8WLJIIIZ = c1846060y8i3.LJIIIZ();
                c1845940y8WLJIIIZ.LIZ = c0oei;
                View viewLJJIJL4 = uIAssem.LJJIJL();
                if (viewLJJIJL4 != null) {
                    viewFindViewById = viewLJJIJL4.findViewById(R.id.wwq);
                } else {
                    viewFindViewById = null;
                }
                c1845940y8WLJIIIZ.LIZIZ(viewFindViewById.getContext().getResources().getString(c0oei.LLILLJJLI, Integer.valueOf(c0oei.LLILZ.LIZIZ)));
                c1846060y8i2.LIZIZ(c1845940y8WLJIIIZ, c1846060y8i2.LLILZLL.size(), c0oei.LLILLL);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ECPhotoSearchBubbleAssem eCPhotoSearchBubbleAssem = (ECPhotoSearchBubbleAssem) obj;
        AbstractC621770Oa7 abstractC621770Oa7 = (AbstractC621770Oa7) obj2;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ECPhotoSearchBubbleState state: ");
        sbLIZ.append(abstractC621770Oa7);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        if (abstractC621770Oa7 != null) {
            eCPhotoSearchBubbleAssem.getClass();
            if (abstractC621770Oa7 instanceof C621760Oa6) {
                Context context = eCPhotoSearchBubbleAssem.getContext();
                if (context != null) {
                    C1208904oB.LIZ.getClass();
                    if (!C1208904oB.LIZ()) {
                        C634750Ov3.LIZ(context, new AwS445S0200000_9(eCPhotoSearchBubbleAssem, abstractC621770Oa7, 33), false);
                    } else {
                        AnonymousClass0956 anonymousClass0956 = eCPhotoSearchBubbleAssem.LLJJJ;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        eCPhotoSearchBubbleAssem.LLJJJ = null;
                        eCPhotoSearchBubbleAssem.LLJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(eCPhotoSearchBubbleAssem), null, null, new C595980NZc(eCPhotoSearchBubbleAssem, abstractC621770Oa7, context, null), 3);
                    }
                }
            } else {
                C1208904oB.LIZ.getClass();
                if (C1208904oB.LIZ()) {
                    AnonymousClass0956 anonymousClass09562 = eCPhotoSearchBubbleAssem.LLJJJ;
                    if (anonymousClass09562 != null) {
                        anonymousClass09562.LIZIZ(null);
                    }
                    eCPhotoSearchBubbleAssem.LLJJJ = null;
                }
                C0P0T c0p0t = eCPhotoSearchBubbleAssem.LLJJ;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AddYoursEntranceButtonAssem addYoursEntranceButtonAssem = (AddYoursEntranceButtonAssem) obj;
        C2276471E8n c2276471E8n = C2276471E8n.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHolderUnSelectedEvent, event=");
        sbLIZ.append(obj2);
        c2276471E8n.d("AddYoursEntranceButtonAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (obj2 != null) {
            addYoursEntranceButtonAssem.LLLII = false;
            addYoursEntranceButtonAssem.Fp();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$60(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        CreativeToolDetailListModel creativeToolDetailListModel = (CreativeToolDetailListModel) obj2;
        if (creativeToolDetailListModel != null) {
            return new C627950Ok5(creativeToolDetailListModel);
        }
        return null;
    }

    public static final Object invoke$61(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        CreativeToolDetailModel creativeToolDetailModel = (CreativeToolDetailModel) obj2;
        if (creativeToolDetailModel != null) {
            return new C627780Ojo(creativeToolDetailModel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$62(kotlin.jvm.internal.AFwS292S0000000_9 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicPresaveItemAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicPresaveItemAssem) r4
            X.0zJl r5 = (X.InterfaceC1891350zJl) r5
            boolean r0 = r5 instanceof X.C618900OPg
            r3 = 0
            if (r0 == 0) goto L32
            X.0OPg r5 = (X.C618900OPg) r5
            if (r5 == 0) goto L32
            com.ss.android.ugc.aweme.notice.repo.list.bean.PresaveAlbumInfo r0 = r5.LL
            if (r0 == 0) goto L32
            java.lang.String r2 = r0.albumId
        L13:
            X.0y17 r1 = r4.LLJLLIL
            if (r1 == 0) goto L2d
            if (r2 == 0) goto L30
            X.0OPg r0 = r4.LLJLLL
            if (r0 == 0) goto L23
            com.ss.android.ugc.aweme.notice.repo.list.bean.PresaveAlbumInfo r0 = r0.LL
            if (r0 == 0) goto L23
            java.lang.String r3 = r0.albumId
        L23:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)
            if (r0 == 0) goto L30
            r0 = 1
        L2a:
            r1.setChecked(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r0 = 0
            goto L2a
        L32:
            r2 = r3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS292S0000000_9.invoke$62(kotlin.jvm.internal.AFwS292S0000000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$63(kotlin.jvm.internal.AFwS292S0000000_9 r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicSongItemAssem r4 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicSongItemAssem) r4
            X.0zJl r5 = (X.InterfaceC1891350zJl) r5
            boolean r0 = r5 instanceof X.C621040OXm
            r3 = 0
            if (r0 == 0) goto L36
            X.0OXm r5 = (X.C621040OXm) r5
            if (r5 == 0) goto L36
            com.ss.android.ugc.aweme.music.model.Music r0 = r5.LL
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.getMid()
        L15:
            X.0y17 r1 = r4.LLJLLL
            if (r1 == 0) goto L31
            if (r2 == 0) goto L34
            X.0OXm r0 = r4.LLJZIJLIL
            if (r0 == 0) goto L27
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.LL
            if (r0 == 0) goto L27
            java.lang.String r3 = r0.getMid()
        L27:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)
            if (r0 == 0) goto L34
            r0 = 1
        L2e:
            r1.setChecked(r0)
        L31:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L34:
            r0 = 0
            goto L2e
        L36:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS292S0000000_9.invoke$63(kotlin.jvm.internal.AFwS292S0000000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$64(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        MusicDetail musicDetail = (MusicDetail) obj2;
        if (musicDetail != null) {
            return new C0O1N(musicDetail);
        }
        return null;
    }

    public static final Object invoke$65(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AIPortraitDetailHeaderModel aIPortraitDetailHeaderModel = (AIPortraitDetailHeaderModel) obj2;
        if (aIPortraitDetailHeaderModel != null) {
            return new C0OCZ(aIPortraitDetailHeaderModel);
        }
        return null;
    }

    public static final Object invoke$66(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AIPortraitDetailAwemeListModel aIPortraitDetailAwemeListModel = (AIPortraitDetailAwemeListModel) obj2;
        if (aIPortraitDetailAwemeListModel != null) {
            return new C0OCS(aIPortraitDetailAwemeListModel);
        }
        return null;
    }

    public static final Object invoke$67(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            C0OTS c0ots = (C0OTS) c291001Au.LIZ();
            BulletinCommentSheetAbility bulletinCommentSheetAbility = (BulletinCommentSheetAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), BulletinCommentSheetAbility.class, null);
            if (bulletinCommentSheetAbility != null) {
                bulletinCommentSheetAbility.EO(c0ots, false, "comment_panel");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$68(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", "turn_on");
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_message_request_push_default_open_popup_click", linkedHashMap);
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$69(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return Unit.LIZ;
    }

    public static final Object invoke$7(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C737030Svd c737030Svd;
        Object obj3;
        String string;
        Bundle bundle;
        String string2;
        VideoFavoriteAssem videoFavoriteAssem = (VideoFavoriteAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c737030Svd = (C737030Svd) c291001Au.LIZ()) != null) {
            C724270Sb3 c724270Sb3 = videoFavoriteAssem.LLJI;
            Object obj4 = null;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            if (!AwemeExtKt.isCollected(((VideoItemParams) obj3).getAweme())) {
                Bundle bundle2 = c737030Svd.LIZJ;
                if (bundle2 != null) {
                    string = bundle2.getString("group_id");
                } else {
                    string = null;
                }
                C724270Sb3 c724270Sb32 = videoFavoriteAssem.LLJI;
                if (c724270Sb32 != null) {
                    obj4 = c724270Sb32.LL;
                }
                if (Intrinsics.LJFF(string, C735370Ssx.LIZJ(((VideoItemParams) obj4).getAweme())) && (bundle = c737030Svd.LIZJ) != null && (string2 = bundle.getString("enter_method")) != null) {
                    videoFavoriteAssem.Bp().yQ2(string2);
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$70(kotlin.jvm.internal.AFwS292S0000000_9 r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem r3 = (com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem) r3
            com.ss.android.ugc.aweme.profile.model.FollowStatusEvent r4 = (com.ss.android.ugc.aweme.profile.model.FollowStatusEvent) r4
            if (r4 == 0) goto L2d
            com.ss.android.ugc.aweme.profile.model.FollowStatus r2 = r4.status
            if (r2 == 0) goto L2d
            java.lang.String r1 = r2.getUserId()
            java.lang.Object r0 = X.C631370Opb.LIZ(r3)
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            java.lang.String r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.getAuthorUid(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L30
            int r0 = r2.getFollowStatus()
            r1 = 1
            if (r0 != r1) goto L30
        L29:
            r0 = 5
            r3.Up(r0, r1)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            r1 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS292S0000000_9.invoke$70(kotlin.jvm.internal.AFwS292S0000000_9, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$71(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        int i;
        TuxIconView tuxIconView;
        UIAssem uIAssem = (UIAssem) obj;
        AddYoursTopic addYoursTopic = (AddYoursTopic) obj2;
        boolean z = true;
        if (addYoursTopic != null && addYoursTopic.getCollectStatus() == 1) {
            i = R.raw.icon_bookmark_fill;
        } else {
            i = R.raw.icon_bookmark;
        }
        if (addYoursTopic != null && addYoursTopic.getCollectStatus() != -1) {
            z = false;
        }
        View viewFindViewById = null;
        if (z) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.e6e);
            }
            C339190DRl.LIZIZ(viewFindViewById);
        } else {
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                tuxIconView = (TuxIconView) viewLJJIJL2.findViewById(R.id.e6e);
            } else {
                tuxIconView = null;
            }
            tuxIconView.setIconRes(i);
            View viewLJJIJL3 = uIAssem.LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById = viewLJJIJL3.findViewById(R.id.e6e);
            }
            C339190DRl.LIZLLL(viewFindViewById);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ((Aweme) obj2, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$73(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C735840Sti.LIZ.getClass();
        C735840Sti.LIZIZ((Aweme) obj2, obj);
        return Unit.LIZ;
    }

    public static final Object invoke$74(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Boolean.valueOf(obj2 instanceof DiscoverSectionItem.BannerSection);
    }

    public static final Object invoke$75(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Boolean.valueOf(obj2 instanceof DiscoverSectionItem.TrendingTopicOrAdSection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        Pair pair;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (pair = (Pair) c291001Au.LIZ) != null && ((Boolean) pair.getFirst()).booleanValue()) {
            C1478160oZK.LIZ().LJJJ("social_friends_tab_v3");
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) ((C291001Au) obj2).LIZ();
        if (C123100dR.LIZ(str) && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LIZLLL(1000L);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$35(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return obj2;
    }

    public static final Object invoke$36(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return obj2;
    }

    public static final Object invoke$37(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return obj2;
    }

    public static final Object invoke$38(AFwS292S0000000_9 aFwS292S0000000_9, Object obj, Object obj2) {
        return obj2;
    }
}
