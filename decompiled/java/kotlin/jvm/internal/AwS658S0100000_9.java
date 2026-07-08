package kotlin.jvm.internal;

import X.AbstractC1623806Xk;
import X.AbstractC480470Isn;
import X.C01GW;
import X.C09AY;
import X.C0A1F;
import X.C0DTR;
import X.C0I7D;
import X.C0OIR;
import X.C0OLV;
import X.C0OM2;
import X.C0OM7;
import X.C0OO6;
import X.C0OOC;
import X.C0OPQ;
import X.C0OPX;
import X.C0OQ4;
import X.C0OR6;
import X.C0ORG;
import X.C0OSB;
import X.C0OSF;
import X.C0OWM;
import X.C0OZ5;
import X.C0OZL;
import X.C1194810hCJ;
import X.C12ES;
import X.C13LP;
import X.C1537720q7O;
import X.C15438062q;
import X.C1623606Xi;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1697810uHb;
import X.C1846060y8i;
import X.C19348710mr;
import X.C19374310qz;
import X.C19U0;
import X.C19U1;
import X.C20600815jK;
import X.C2188811AlT;
import X.C2248361CzK;
import X.C291001Au;
import X.C337180DJs;
import X.C339190DRl;
import X.C384050F3z;
import X.C418440Gaw;
import X.C443090HZb;
import X.C612270Nzt;
import X.C618680OOk;
import X.C619000OPq;
import X.C621400OYw;
import X.C622840Obq;
import X.C630930Oot;
import X.C631370Opb;
import X.C632090Oql;
import X.C634380OuS;
import X.C638560P2w;
import X.C679540Ql6;
import X.C698190Ra5;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C866950Xzh;
import X.EnumC1076160e6w;
import X.EnumC1177720gkk;
import X.EnumC19356310o5;
import X.EnumC617480OJu;
import X.EnumC618000OLu;
import X.EnumC619900OTc;
import X.EnumC622850Obr;
import X.EnumC631410Opf;
import X.InterfaceC1194840hCM;
import X.InterfaceC1584740rLE;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import X.InterfaceC1733780vDc;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC469360Ias;
import X.InterfaceC595010NVj;
import X.InterfaceC619970OTj;
import X.InterfaceC636730OyF;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.ACListenerS144S0100000_9;
import Y.ACListenerS47S0400000_9;
import Y.ARunnableS106S0100000_6;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BBFixViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPollVoteDetailListFragment;
import com.ss.android.ugc.aweme.inbox.bulletin.TuxBBFixViewPagerSheetBehavior;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardPageHybridAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageListAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.emojideatil.BulletinEmojiDetailViewViewpagerAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopContainer;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinQuickPublishAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.poll.PollVoteDetailSheetViewPagerAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinEmojiDetailFragmentData;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.view.cell.BulletinProfileCell;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinPublishViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinCommonAbility;
import com.ss.android.ugc.aweme.inbox.bulletin.vscope.BulletinTooltipAbility;
import com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchCardListAssem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellCoverAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCardHierarchyData;
import com.ss.android.ugc.aweme.music.dsp.dm.bottomsheet.ui.MediaCoverAssem;
import com.ss.android.ugc.aweme.music.dsp.dm.model.DmMessageConfig;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinBarEntrance;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinEmojiTab;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinHybridResourceResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPoll;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollOption;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPollVoteDetailResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinPublishAction;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinResourceInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxTextStruct;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.model.PoiRevisitCardItem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitVerticalListAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedProgressInfoAssem;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes10.dex */
public class AwS658S0100000_9 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            case 21:
                return invoke$21(this, obj, obj2, obj3);
            case 22:
                return invoke$22(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(C0ORG c0org, int i) {
        super(3);
        this.$t = i;
        this.l0 = c0org;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinBoardPageHybridAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinEditAssem bulletinEditAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinEditAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinPageListAssem bulletinPageListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinPageListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinCreatorEditAssem bulletinCreatorEditAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinCreatorEditAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinEmojiDetailViewViewpagerAssem bulletinEmojiDetailViewViewpagerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinEmojiDetailViewViewpagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinInputTopContainer bulletinInputTopContainer, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinInputTopContainer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinInputTopicRightAssem bulletinInputTopicRightAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinInputTopicRightAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinQuickPublishAssem bulletinQuickPublishAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinQuickPublishAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(PollVoteDetailSheetViewPagerAssem pollVoteDetailSheetViewPagerAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = pollVoteDetailSheetViewPagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BaseBulletinBarAssem baseBulletinBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = baseBulletinBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(BulletinProfileCell bulletinProfileCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = bulletinProfileCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(WorkBenchCardListAssem workBenchCardListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = workBenchCardListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(MusicCellCoverAssem musicCellCoverAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicCellCoverAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(MediaCoverAssem mediaCoverAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = mediaCoverAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(MusicDescAssem musicDescAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicDescAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(MusicDetailNavBarAssem musicDetailNavBarAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicDetailNavBarAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = musicPgcMetaInfoWithArtistAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(PoiRevisitHorizontalCardAssem poiRevisitHorizontalCardAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiRevisitHorizontalCardAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(PoiRevisitVerticalListAssem poiRevisitVerticalListAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = poiRevisitVerticalListAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS658S0100000_9(VibeFeedProgressInfoAssem vibeFeedProgressInfoAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = vibeFeedProgressInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS658S0100000_9(Function0 function0, Function0<Unit> function02) {
        super(3);
        this.$t = function02;
        this.l0 = function0;
    }

    public static final Object invoke$0(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        int iLongValue;
        BulletinCommentUIOverview bulletinCommentUIOverviewLIZ;
        List<BulletinBaseItem> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            BulletinPageListAssem bulletinPageListAssem = (BulletinPageListAssem) awS658S0100000_9.l0;
            for (BulletinBaseItem bulletinBaseItem : list) {
                try {
                    C0OIR c0oir = bulletinPageListAssem.So().LLJJL;
                    int type = bulletinBaseItem.LIZLLL().getType();
                    Long lLJI = bulletinBaseItem.LJI();
                    if (lLJI != null) {
                        iLongValue = (int) lLJI.longValue();
                    } else {
                        iLongValue = 0;
                    }
                    boolean zLIZ = c0oir.LIZ(type, iLongValue);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("BulletinPageListAssem updateBulletinList enableComment ");
                    sbLIZ.append(zLIZ);
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                    BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = bulletinBaseItem.LJIILIIL();
                    if (bulletinCommentUIOverviewLJIILIIL != null) {
                        bulletinCommentUIOverviewLIZ = C619000OPq.LJIIJJI(bulletinCommentUIOverviewLJIILIIL, Boolean.valueOf(zLIZ), C619000OPq.LIZIZ(bulletinBaseItem));
                    } else {
                        bulletinCommentUIOverviewLIZ = C619000OPq.LIZ(Boolean.valueOf(zLIZ), C619000OPq.LIZIZ(bulletinBaseItem));
                    }
                    BulletinBaseItem bulletinBaseItemLIZ = C0OO6.LIZ(bulletinBaseItem, false, 0, false, false, false, 0, null, null, 511);
                    bulletinBaseItemLIZ.LJZ(bulletinCommentUIOverviewLIZ);
                    arrayList.add(bulletinBaseItemLIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("BulletinPageListAssem newItem commentUIOverView: ");
                    sbLIZ2.append(bulletinBaseItemLIZ.LJIILIIL());
                    C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("BulletinPageListAssem updateBulletinList enableComment error ");
                    sbLIZ3.append(e);
                    C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
            }
        }
        return arrayList;
    }

    public static final Object invoke$1(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) throws Throwable {
        BulletinEditAssem bulletinEditAssem = (BulletinEditAssem) awS658S0100000_9.l0;
        C0I7D c0i7d = bulletinEditAssem.LLJJJIL;
        if (c0i7d != null) {
            if (obj2 == C0OSF.NORMAL && obj3 == C0OWM.HIDE) {
                c0i7d.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                c0i7d.setEllipsize(null);
            }
        }
        bulletinEditAssem.hp();
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS658S0100000_9 r10, java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            X.01Au r12 = (X.C291001Au) r12
            java.util.List r13 = (java.util.List) r13
            T r1 = r12.LIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L90
            if (r13 == 0) goto L90
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r9 = r13.iterator()
            r4 = 0
            r8 = 0
        L1b:
            boolean r0 = r9.hasNext()
            r3 = 1
            if (r0 == 0) goto L65
            java.lang.Object r7 = r9.next()
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig r7 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig) r7
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterOption> r0 = r7.options
            if (r0 == 0) goto L1b
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r0.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterOption r0 = (com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterOption) r0
            if (r0 == 0) goto L35
            boolean r0 = r0.isChecked()
            if (r0 != r3) goto L35
            r6.add(r1)
            goto L35
        L4e:
            int r0 = r6.size()
            int r8 = r8 + r0
            com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig r3 = new com.ss.android.ugc.aweme.notice.repo.list.bean.MissionFilterConfig
            java.lang.String r2 = r7.title
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r6)
            java.lang.String r0 = r7.valType
            r3.<init>(r2, r1, r0)
            r5.add(r3)
            goto L1b
        L65:
            if (r8 == 0) goto L72
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            java.lang.String r2 = X.C1227904rF.LJI(r5)
            if (r2 != 0) goto L74
        L72:
            java.lang.String r2 = ""
        L74:
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchCardListAssem r0 = (com.ss.android.ugc.aweme.inbox.workbench.assem.WorkBenchCardListAssem) r0
            com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchCardListViewModel r1 = r0.ip()
            r1.LLILZ = r2
            java.util.Set<java.lang.Long> r0 = r1.LLJ
            r0.clear()
            r1.LLJILJILJ = r4
            boolean r0 = r1.LLJJ
            if (r0 == 0) goto L93
            boolean r0 = r1.LLJILLL
            if (r0 == 0) goto L93
            r1.manualListRefresh()
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L93:
            r1.LLJJI = r3
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS658S0100000_9.invoke$10(kotlin.jvm.internal.AwS658S0100000_9, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        String musicId;
        MusicModel musicModel;
        ReusedAssem reusedAssem = (ReusedAssem) obj;
        C632090Oql c632090Oql = (C632090Oql) obj2;
        EnumC631410Opf enumC631410Opf = (EnumC631410Opf) obj3;
        if (c632090Oql != null && (musicModel = c632090Oql.getMusicModel()) != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        if (Intrinsics.LJFF(musicId, ((C632090Oql) C631370Opb.LIZ(reusedAssem)).getMusicModel().getMusicId())) {
            ((MusicCellCoverAssem) awS658S0100000_9.l0).sp(enumC631410Opf);
        } else {
            ((MusicCellCoverAssem) awS658S0100000_9.l0).sp(EnumC631410Opf.DEFAULT);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$12(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        View viewFindViewById5;
        View viewFindViewById6;
        View viewFindViewById7;
        View viewFindViewById8;
        View viewFindViewById9;
        String str;
        DmMessageConfig dmMessageConfig;
        UIAssem uIAssem = (UIAssem) obj;
        int iIntValue = ((Number) obj2).intValue();
        C291001Au c291001Au = (C291001Au) obj3;
        View viewFindViewById10 = null;
        C0OR6 c0or6 = null;
        View viewFindViewById11 = null;
        View viewFindViewById12 = null;
        if (iIntValue != 0) {
            boolean z = true;
            if (iIntValue != 1) {
                if (iIntValue != 2 && iIntValue != 3) {
                    if (iIntValue == 4) {
                        View viewLJJIJL = uIAssem.LJJIJL();
                        if (viewLJJIJL != null) {
                            viewFindViewById7 = viewLJJIJL.findViewById(R.id.lp8);
                        } else {
                            viewFindViewById7 = null;
                        }
                        C337180DJs.LIZJ(viewFindViewById7);
                        View viewLJJIJL2 = uIAssem.LJJIJL();
                        if (viewLJJIJL2 != null) {
                            viewFindViewById8 = viewLJJIJL2.findViewById(R.id.lp9);
                        } else {
                            viewFindViewById8 = null;
                        }
                        C337180DJs.LIZ(viewFindViewById8);
                        View viewLJJIJL3 = uIAssem.LJJIJL();
                        if (viewLJJIJL3 != null) {
                            viewFindViewById9 = viewLJJIJL3.findViewById(R.id.lp4);
                        } else {
                            viewFindViewById9 = null;
                        }
                        C337180DJs.LIZ(viewFindViewById9);
                        ((ValueAnimator) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJ.getValue()).cancel();
                        C0OQ4 c0oq4 = (C0OQ4) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJI.getValue();
                        MediaCardHierarchyData mediaCardHierarchyDataJo = ((MediaCoverAssem) awS658S0100000_9.l0).Jo();
                        if (mediaCardHierarchyDataJo == null || (dmMessageConfig = mediaCardHierarchyDataJo.getDmMessageConfig()) == null || (str = dmMessageConfig.musicId) == null) {
                            str = "";
                        }
                        if (c291001Au != null) {
                            c0or6 = (C0OR6) c291001Au.LIZ;
                        }
                        c0oq4.LJ(str, c0or6);
                    }
                } else {
                    View viewLJJIJL4 = uIAssem.LJJIJL();
                    if (viewLJJIJL4 != null) {
                        viewFindViewById5 = viewLJJIJL4.findViewById(R.id.lp8);
                    } else {
                        viewFindViewById5 = null;
                    }
                    C337180DJs.LIZJ(viewFindViewById5);
                    View viewLJJIJL5 = uIAssem.LJJIJL();
                    if (viewLJJIJL5 != null) {
                        viewFindViewById6 = viewLJJIJL5.findViewById(R.id.lp9);
                    } else {
                        viewFindViewById6 = null;
                    }
                    C337180DJs.LIZ(viewFindViewById6);
                    View viewLJJIJL6 = uIAssem.LJJIJL();
                    if (viewLJJIJL6 != null) {
                        viewFindViewById11 = viewLJJIJL6.findViewById(R.id.lp4);
                    }
                    C337180DJs.LIZ(viewFindViewById11);
                    ((ValueAnimator) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJ.getValue()).cancel();
                    C0OQ4 c0oq42 = (C0OQ4) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJI.getValue();
                    MediaCardHierarchyData mediaCardHierarchyDataJo2 = ((MediaCoverAssem) awS658S0100000_9.l0).Jo();
                    if (mediaCardHierarchyDataJo2 != null) {
                        mediaCardHierarchyDataJo2.getDmMessageConfig();
                    }
                    float f = ((MediaCoverAssem) awS658S0100000_9.l0).Lo().LLILZIL;
                    if (iIntValue != 3) {
                        z = false;
                    }
                    c0oq42.LIZ(f, z);
                }
            } else {
                View viewLJJIJL7 = uIAssem.LJJIJL();
                if (viewLJJIJL7 != null) {
                    viewFindViewById3 = viewLJJIJL7.findViewById(R.id.lp8);
                } else {
                    viewFindViewById3 = null;
                }
                C337180DJs.LIZ(viewFindViewById3);
                View viewLJJIJL8 = uIAssem.LJJIJL();
                if (viewLJJIJL8 != null) {
                    viewFindViewById4 = viewLJJIJL8.findViewById(R.id.lp9);
                } else {
                    viewFindViewById4 = null;
                }
                C337180DJs.LIZJ(viewFindViewById4);
                View viewLJJIJL9 = uIAssem.LJJIJL();
                if (viewLJJIJL9 != null) {
                    viewFindViewById12 = viewLJJIJL9.findViewById(R.id.lp4);
                }
                C337180DJs.LIZ(viewFindViewById12);
                ((ValueAnimator) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJ.getValue()).cancel();
                C0OQ4 c0oq43 = (C0OQ4) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJI.getValue();
                MediaCardHierarchyData mediaCardHierarchyDataJo3 = ((MediaCoverAssem) awS658S0100000_9.l0).Jo();
                if (mediaCardHierarchyDataJo3 != null) {
                    mediaCardHierarchyDataJo3.getDmMessageConfig();
                }
                c0oq43.LIZLLL();
            }
        } else {
            View viewLJJIJL10 = uIAssem.LJJIJL();
            if (viewLJJIJL10 != null) {
                viewFindViewById = viewLJJIJL10.findViewById(R.id.lp8);
            } else {
                viewFindViewById = null;
            }
            C337180DJs.LIZ(viewFindViewById);
            View viewLJJIJL11 = uIAssem.LJJIJL();
            if (viewLJJIJL11 != null) {
                viewFindViewById2 = viewLJJIJL11.findViewById(R.id.lp9);
            } else {
                viewFindViewById2 = null;
            }
            C337180DJs.LIZ(viewFindViewById2);
            View viewLJJIJL12 = uIAssem.LJJIJL();
            if (viewLJJIJL12 != null) {
                viewFindViewById10 = viewLJJIJL12.findViewById(R.id.lp4);
            }
            C337180DJs.LIZJ(viewFindViewById10);
            C786410Ut5.Pd((ObjectAnimator) ((MediaCoverAssem) awS658S0100000_9.l0).LLJJ.getValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        C630930Oot c630930Oot = ((MusicDescAssem) awS658S0100000_9.l0).LLJJJ;
        if (c630930Oot != null) {
            c630930Oot.setArtistLabel(iIntValue);
        }
        C630930Oot c630930Oot2 = ((MusicDescAssem) awS658S0100000_9.l0).LLJJJ;
        if (c630930Oot2 != null) {
            c630930Oot2.setBehindTheSongVideoType(iIntValue2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        MusicDetailNavBarAssem musicDetailNavBarAssem = (MusicDetailNavBarAssem) awS658S0100000_9.l0;
        musicDetailNavBarAssem.LLJLILLLLZIIL = iIntValue;
        musicDetailNavBarAssem.LLJLL = iIntValue2;
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        MusicPgcMetaInfoWithArtistAssem musicPgcMetaInfoWithArtistAssem = (MusicPgcMetaInfoWithArtistAssem) awS658S0100000_9.l0;
        musicPgcMetaInfoWithArtistAssem.LLLII = iIntValue;
        musicPgcMetaInfoWithArtistAssem.LLLIIII = iIntValue2;
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        Integer numValueOf;
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 == EnumC1177720gkk.CARD_VIEW) {
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
            if (obj3 == EnumC1076160e6w.LIST_COMPLETE) {
                C339190DRl.LIZLLL(uIAssem.LJJIJL());
                ViewGroup viewGroup = ((PoiRevisitHorizontalCardAssem) awS658S0100000_9.l0).LLJJIII;
                if (viewGroup != null) {
                    C339190DRl.LIZLLL(viewGroup);
                }
                PoiRevisitHorizontalCardAssem poiRevisitHorizontalCardAssem = (PoiRevisitHorizontalCardAssem) awS658S0100000_9.l0;
                PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = poiRevisitHorizontalCardAssem.hp().wQ2(true, true, true);
                if (poiRevisitCardListResponseWQ2 != null) {
                    list = poiRevisitCardListResponseWQ2.poiCardList;
                } else {
                    list = null;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("HorizontalCardAssem updateCard, data.size=");
                if (list != null) {
                    numValueOf = Integer.valueOf(list.size());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                C2188811AlT.LIZIZ(sbLIZ);
                if (list != null && !list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<PoiRevisitApi.PoiRevisitCardModel> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(PoiRevisitCardItem.LIZ(it2.next().LIZIZ(), false, -3));
                    }
                    ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = poiRevisitHorizontalCardAssem.LLJJIJI;
                    if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                        state.LJIILL(arrayList, null);
                    }
                }
            } else {
                ViewGroup viewGroup2 = ((PoiRevisitHorizontalCardAssem) awS658S0100000_9.l0).LLJJIII;
                if (viewGroup2 != null) {
                    C339190DRl.LIZIZ(viewGroup2);
                }
            }
        } else {
            C339190DRl.LIZIZ(uIAssem.LJJIJL());
            ViewGroup viewGroup3 = ((PoiRevisitHorizontalCardAssem) awS658S0100000_9.l0).LLJJIII;
            if (viewGroup3 != null) {
                C339190DRl.LIZIZ(viewGroup3);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        C20600815jK<InterfaceC1891350zJl> state;
        C20600815jK<InterfaceC1891350zJl> state2;
        List<PoiRevisitApi.PoiRevisitCardModel> list = null;
        if (obj3 == EnumC1076160e6w.LIST_COMPLETE) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Vertical List Assem ");
            sbLIZ.append(((PoiRevisitVerticalListAssem) awS658S0100000_9.l0).hashCode());
            sbLIZ.append(" observe data state to LIST_COMPLETE");
            C2188811AlT.LIZIZ(sbLIZ);
            PoiRevisitVerticalListAssem poiRevisitVerticalListAssem = (PoiRevisitVerticalListAssem) awS658S0100000_9.l0;
            PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = poiRevisitVerticalListAssem.Go().wQ2(true, true, true);
            if (poiRevisitCardListResponseWQ2 != null) {
                list = poiRevisitCardListResponseWQ2.poiCardList;
            }
            poiRevisitVerticalListAssem.Ho(list);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Vertical List Assem ");
            sbLIZ2.append(((PoiRevisitVerticalListAssem) awS658S0100000_9.l0).hashCode());
            sbLIZ2.append(" observe data state to LIST_LOADING");
            C2188811AlT.LIZIZ(sbLIZ2);
            PoiRevisitVerticalListAssem poiRevisitVerticalListAssem2 = (PoiRevisitVerticalListAssem) awS658S0100000_9.l0;
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = poiRevisitVerticalListAssem2.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state2 = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state2.LJFF(null);
            }
            ArrayList arrayList = new ArrayList(4);
            int i = 0;
            do {
                arrayList.add(new PoiRevisitCardItem(true, false, null, false, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, 0, null, null, null, null));
                i++;
            } while (i < 4);
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = poiRevisitVerticalListAssem2.LLJ;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                state.LJIILL(arrayList, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        final List<BulletinEmojiTab> list = (List) obj2;
        String str = (String) obj3;
        if (!list.isEmpty()) {
            C1846060y8i c1846060y8iGo = ((BulletinEmojiDetailViewViewpagerAssem) awS658S0100000_9.l0).Go();
            if (c1846060y8iGo != null) {
                c1846060y8iGo.LJIJJLI(true);
                C1846060y8i.LJIJI(c1846060y8iGo, c1846060y8iGo.getViewPager());
            }
            final BulletinEmojiDetailViewViewpagerAssem bulletinEmojiDetailViewViewpagerAssem = (BulletinEmojiDetailViewViewpagerAssem) awS658S0100000_9.l0;
            if (str == null) {
                str = "All";
            }
            bulletinEmojiDetailViewViewpagerAssem.getClass();
            boolean z = false;
            Pair pair = new Pair(C13LP.LJJJJZI(list), 0);
            int i = 0;
            for (Object obj4 : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    BulletinEmojiTab bulletinEmojiTab = (BulletinEmojiTab) obj4;
                    if (bulletinEmojiTab.tabType == 1) {
                        pair = new Pair(bulletinEmojiTab, Integer.valueOf(i));
                    } else if (u.LJIJI(bulletinEmojiTab.tabName, str, true)) {
                        pair = new Pair(bulletinEmojiTab, Integer.valueOf(i));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InterfaceC636730OyF fragmentItemOperator = bulletinEmojiDetailViewViewpagerAssem.Ho().getFragmentItemOperator();
            C622840Obq c622840Obq = new C622840Obq();
            c622840Obq.LJIIIZ = ((Number) pair.getSecond()).intValue();
            c622840Obq.LJIIJ = true;
            c622840Obq.LJII = EnumC622850Obr.LIMITED_NUM_FRAGMENTS_NO_DESTROY;
            c622840Obq.LIZ = 1;
            c622840Obq.LJIIIIZZ = 4;
            fragmentItemOperator.LIZLLL(c622840Obq);
            bulletinEmojiDetailViewViewpagerAssem.Ho().setSmoothScrollEnabled(false);
            bulletinEmojiDetailViewViewpagerAssem.Ho().setUserInputEnabled(true);
            if (((BulletinEmojiTab) pair.getFirst()).tabType == 1) {
                z = true;
            }
            bulletinEmojiDetailViewViewpagerAssem.LLJILLL = z;
            new C1194810hCJ(bulletinEmojiDetailViewViewpagerAssem.Go(), bulletinEmojiDetailViewViewpagerAssem.Ho(), true, new InterfaceC1194840hCM() { // from class: X.0Obp
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i3) {
                    Object obj5 = ListProtector.get(list, i3);
                    BulletinEmojiDetailViewViewpagerAssem bulletinEmojiDetailViewViewpagerAssem2 = bulletinEmojiDetailViewViewpagerAssem;
                    BulletinEmojiTab bulletinEmojiTab2 = (BulletinEmojiTab) obj5;
                    if (bulletinEmojiTab2.tabType == 1) {
                        c1845940y8W.LIZIZ(bulletinEmojiDetailViewViewpagerAssem2.Go().getContext().getString(2131828115));
                        C1845930y8V c1845930y8V = c1845940y8W.LJFF;
                        if (c1845930y8V != null) {
                            C786410Ut5.m9(c1845930y8V, new ACListenerS144S0100000_9(bulletinEmojiDetailViewViewpagerAssem2, 95));
                            return;
                        }
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(bulletinEmojiTab2.tabName);
                    sbLIZ.append(' ');
                    sbLIZ.append(bulletinEmojiTab2.count);
                    c1845940y8W.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }).LIZ();
            C0OZL c0ozl = (C0OZL) bulletinEmojiDetailViewViewpagerAssem.LLJI.getValue();
            if (c0ozl != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (BulletinEmojiTab bulletinEmojiTab2 : list) {
                    long j = c0ozl.LL;
                    long j2 = c0ozl.LLILLJJLI;
                    String str2 = bulletinEmojiTab2.tabName;
                    arrayList.add(new BulletinEmojiDetailFragmentData(bulletinEmojiTab2.tabType, (int) bulletinEmojiTab2.count, j, j2, str2, u.LJIJI(str2, str, true)));
                }
                bulletinEmojiDetailViewViewpagerAssem.LLJJI = arrayList;
                bulletinEmojiDetailViewViewpagerAssem.Ho().getFragmentItemOperator().getState().LJIILL(arrayList, null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$19(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        String str = ((VibeFeedProgressInfoAssem) awS658S0100000_9.l0).Ho().getState().LL;
        ((VibeFeedProgressInfoAssem) awS658S0100000_9.l0).Go(str, ((Boolean) obj2).booleanValue(), (C638560P2w) obj3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        C1537720q7O c1537720q7OYs1;
        BulletinTooltipAbility bulletinTooltipAbilityAp;
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj3;
        if ((obj2 instanceof C1623606Xi) && (abstractC1623806Xk instanceof C1623606Xi)) {
            BulletinHybridResourceResponse bulletinHybridResourceResponse = (BulletinHybridResourceResponse) ((C1623606Xi) abstractC1623806Xk).LIZ;
            BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem = (BulletinBoardPageHybridAssem) awS658S0100000_9.l0;
            BulletinResourceInfo bottomResourceInfo = bulletinHybridResourceResponse.getBottomResourceInfo();
            boolean z = !bulletinBoardPageHybridAssem.Vo().To();
            if (z && (bulletinTooltipAbilityAp = bulletinBoardPageHybridAssem.ap()) != null) {
                bulletinTooltipAbilityAp.WK0(EnumC619900OTc.INSPIRATION_CARD);
            }
            C679540Ql6 c679540Ql6Jo = bulletinBoardPageHybridAssem.Jo(bottomResourceInfo, true);
            if (c679540Ql6Jo == null) {
                bulletinBoardPageHybridAssem.Vo().u51().LJII();
                c1537720q7OYs1 = null;
            } else {
                c1537720q7OYs1 = bulletinBoardPageHybridAssem.ys1(c679540Ql6Jo, bulletinBoardPageHybridAssem.LLLII);
            }
            if (c1537720q7OYs1 != null) {
                bulletinBoardPageHybridAssem.LLLII = c1537720q7OYs1;
                if (bulletinBoardPageHybridAssem.Zo().getChildCount() == 0) {
                    bulletinBoardPageHybridAssem.Zo().addView(c1537720q7OYs1);
                }
                bulletinBoardPageHybridAssem.LLLIIII = true;
                bulletinBoardPageHybridAssem.dp();
            }
            if (!z) {
                if (c1537720q7OYs1 != null) {
                    BulletinTooltipAbility bulletinTooltipAbilityAp2 = bulletinBoardPageHybridAssem.ap();
                    if (bulletinTooltipAbilityAp2 != null) {
                        bulletinTooltipAbilityAp2.gA2(EnumC619900OTc.INSPIRATION_CARD, new InterfaceC619970OTj() { // from class: X.0OTd
                            @Override // X.InterfaceC619970OTj
                            public final boolean isAvailable() {
                                return true;
                            }

                            @Override // X.InterfaceC619970OTj
                            public final void q0(Function0<Unit> function0) {
                                function0.invoke();
                            }
                        });
                    }
                } else {
                    BulletinTooltipAbility bulletinTooltipAbilityAp3 = bulletinBoardPageHybridAssem.ap();
                    if (bulletinTooltipAbilityAp3 != null) {
                        bulletinTooltipAbilityAp3.WK0(EnumC619900OTc.INSPIRATION_CARD);
                    }
                }
            }
            BulletinBoardPageHybridAssem bulletinBoardPageHybridAssem2 = (BulletinBoardPageHybridAssem) awS658S0100000_9.l0;
            C679540Ql6 c679540Ql6Jo2 = bulletinBoardPageHybridAssem2.Jo(bulletinHybridResourceResponse.getTopResourceInfo(), false);
            if (c679540Ql6Jo2 == null) {
                BulletinTooltipAbility bulletinTooltipAbilityAp4 = bulletinBoardPageHybridAssem2.ap();
                if (bulletinTooltipAbilityAp4 != null) {
                    bulletinTooltipAbilityAp4.WK0(EnumC619900OTc.TOP_BANNER);
                }
            } else {
                C1537720q7O c1537720q7OYs12 = bulletinBoardPageHybridAssem2.ys1(c679540Ql6Jo2, bulletinBoardPageHybridAssem2.LLLIIIL);
                if (c1537720q7OYs12 == null) {
                    BulletinTooltipAbility bulletinTooltipAbilityAp5 = bulletinBoardPageHybridAssem2.ap();
                    if (bulletinTooltipAbilityAp5 != null) {
                        bulletinTooltipAbilityAp5.WK0(EnumC619900OTc.TOP_BANNER);
                    }
                } else {
                    bulletinBoardPageHybridAssem2.LLLIIIL = c1537720q7OYs12;
                    if (bulletinBoardPageHybridAssem2.bp().getChildCount() != 0) {
                        C786410Ut5.LJJJJIZL(bulletinBoardPageHybridAssem2.bp());
                    }
                    bulletinBoardPageHybridAssem2.bp().addView(c1537720q7OYs12);
                    C12ES.LJIILL(0, bulletinBoardPageHybridAssem2.bp());
                    BulletinTooltipAbility bulletinTooltipAbilityAp6 = bulletinBoardPageHybridAssem2.ap();
                    if (bulletinTooltipAbilityAp6 != null) {
                        bulletinTooltipAbilityAp6.gA2(EnumC619900OTc.TOP_BANNER, new InterfaceC619970OTj() { // from class: X.0OTe
                            @Override // X.InterfaceC619970OTj
                            public final boolean isAvailable() {
                                return true;
                            }

                            @Override // X.InterfaceC619970OTj
                            public final void q0(Function0<Unit> function0) {
                                function0.invoke();
                            }
                        });
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$20(kotlin.jvm.internal.AwS658S0100000_9 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            X.0OSF r0 = X.C0OSF.FULL_SCREEN
            r3 = 8
            if (r7 != r0) goto L1f
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIIJIL
            if (r0 == 0) goto L11
            X.C786410Ut5.LLLLLLZZ(r0, r3)
        L11:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIL
            if (r0 == 0) goto L1c
            X.C786410Ut5.LLLLLLZZ(r0, r3)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1f:
            X.0OSF r0 = X.C0OSF.NORMAL
            r2 = 0
            if (r7 != r0) goto L62
            X.0OWM r0 = X.C0OWM.HIDE
            if (r8 != r0) goto L62
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            r0.getClass()
            X.0Q7z r4 = X.C1558520qew.LJIIL(r0)
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility> r0 = com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r4, r0, r1)
            com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility r0 = (com.ss.android.ugc.aweme.inbox.bulletin.editvscope.BulletinEditInputAbility) r0
            if (r0 == 0) goto L62
            java.lang.String r0 = r0.IF()
            if (r0 == 0) goto L62
            boolean r1 = X.C123100dR.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L62
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIL
            if (r0 == 0) goto L56
            X.C786410Ut5.LLLLLLZZ(r0, r2)
        L56:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIIJIL
            if (r0 == 0) goto L1c
            X.C786410Ut5.LLLLLLZZ(r0, r3)
            goto L1c
        L62:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIL
            if (r0 == 0) goto L6d
            X.C786410Ut5.LLLLLLZZ(r0, r3)
        L6d:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem r0 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinInputTopicRightAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJIJIIJIL
            if (r0 == 0) goto L1c
            X.C786410Ut5.LLLLLLZZ(r0, r2)
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS658S0100000_9.invoke$20(kotlin.jvm.internal.AwS658S0100000_9, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$21(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        C0OOC c0ooc = (C0OOC) obj3;
        BulletinPoll bulletinPoll = (BulletinPoll) ((C291001Au) obj2).LIZ();
        if (bulletinPoll != null) {
            AssemVMLazy assemVMLazy = ((BulletinQuickPublishAssem) awS658S0100000_9.l0).LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinQuickPublishAssem.LLJILJIL;
            ((BulletinPublishViewModel) assemVMLazy.getValue()).wQ2(bulletinPoll, c0ooc);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v6 */
    public static final Object invoke$22(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        final List<BulletinPollOption> list;
        final Fragment fragmentLJI;
        int i;
        View viewFindViewById;
        View viewFindViewById2;
        ViewGroup.LayoutParams layoutParams;
        BulletinPollVoteDetailResponse bulletinPollVoteDetailResponse = (BulletinPollVoteDetailResponse) obj3;
        if (obj2 == C0OZ5.SUCCESS) {
            final PollVoteDetailSheetViewPagerAssem pollVoteDetailSheetViewPagerAssem = (PollVoteDetailSheetViewPagerAssem) awS658S0100000_9.l0;
            pollVoteDetailSheetViewPagerAssem.getClass();
            if (bulletinPollVoteDetailResponse != null && (list = bulletinPollVoteDetailResponse.options) != null && (fragmentLJI = C724240Sb0.LJI(pollVoteDetailSheetViewPagerAssem)) != null) {
                long j = bulletinPollVoteDetailResponse.totalVoteCount;
                ViewPager viewPagerHo = pollVoteDetailSheetViewPagerAssem.Ho();
                final C621400OYw c621400OYwGo = pollVoteDetailSheetViewPagerAssem.Go();
                viewPagerHo.setAdapter(new AbstractC480470Isn(fragmentLJI, list, c621400OYwGo) { // from class: X.0OYx
                    public final List<BulletinPollOption> LLIZ;
                    public final C621400OYw LLIZLLLIL;

                    @Override // androidx.viewpager.widget.PagerAdapter
                    public final int getCount() {
                        return this.LLIZ.size();
                    }

                    @Override // X.AbstractC480470Isn
                    public final Fragment LJJIJIL(int i2) {
                        C621400OYw c621400OYw;
                        long jLongValue;
                        BulletinPollVoteDetailListFragment bulletinPollVoteDetailListFragment = new BulletinPollVoteDetailListFragment();
                        C621400OYw c621400OYw2 = this.LLIZLLLIL;
                        if (c621400OYw2 != null) {
                            Long l = ((BulletinPollOption) ListProtector.get(this.LLIZ, i2)).optionId;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            c621400OYw = new C621400OYw(c621400OYw2.LL, c621400OYw2.LLILLJJLI, c621400OYw2.LLILLL, c621400OYw2.LLILZ, jLongValue, c621400OYw2.LLILZLL, c621400OYw2.LLIZ);
                        } else {
                            c621400OYw = null;
                        }
                        bulletinPollVoteDetailListFragment.LLIZ = c621400OYw;
                        return bulletinPollVoteDetailListFragment;
                    }

                    {
                        super(fragmentLJI.getChildFragmentManager(), 0);
                        this.LLIZ = list;
                        this.LLIZLLLIL = c621400OYwGo;
                    }
                });
                ((C19U1) pollVoteDetailSheetViewPagerAssem.LLJILJIL.getValue()).setupWithViewPager(pollVoteDetailSheetViewPagerAssem.Ho());
                ?? r12 = 0;
                pollVoteDetailSheetViewPagerAssem.LLJJIII = 0;
                ((ArrayList) pollVoteDetailSheetViewPagerAssem.LLJILLL).clear();
                int i2 = 0;
                for (BulletinPollOption bulletinPollOption : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        BulletinPollOption bulletinPollOption2 = bulletinPollOption;
                        Context context = pollVoteDetailSheetViewPagerAssem.getContext();
                        if (context != null) {
                            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.a7u, (ViewGroup) pollVoteDetailSheetViewPagerAssem.LLJILJIL.getValue(), r12);
                            ((ArrayList) pollVoteDetailSheetViewPagerAssem.LLJILLL).add(viewTd);
                            viewTd.findViewById(R.id.d3a).setBackgroundResource(R.drawable.ag3);
                            ((TextView) viewTd.findViewById(R.id.d3_)).setText(bulletinPollOption2.content);
                            View viewFindViewById3 = viewTd.findViewById(R.id.d3a);
                            viewFindViewById3.measure(View.MeasureSpec.makeMeasureSpec(r12, r12), View.MeasureSpec.makeMeasureSpec(r12, r12));
                            pollVoteDetailSheetViewPagerAssem.LLJJIII += viewFindViewById3.getMeasuredWidth();
                            viewFindViewById3.setTag(Integer.valueOf(viewFindViewById3.getMeasuredWidth()));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("initViewPager measure content layout width = ");
                            sbLIZ.append(viewFindViewById3.getMeasuredWidth());
                            sbLIZ.append(", width sum = ");
                            sbLIZ.append(pollVoteDetailSheetViewPagerAssem.LLJJIII);
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                            TextView textView = (TextView) viewTd.findViewById(R.id.d3b);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            int i4 = C618680OOk.LLJJL;
                            sbLIZ2.append(C814420VxA.LIZIZ((bulletinPollOption2.LIZIZ() * 100.0f) / j));
                            sbLIZ2.append('%');
                            textView.setText(C2188811AlT.LIZIZ(sbLIZ2));
                            TextView textView2 = (TextView) viewTd.findViewById(R.id.d3c);
                            Context context2 = pollVoteDetailSheetViewPagerAssem.getContext();
                            if (context2 != null) {
                                textView2.setText(C786410Ut5.j4(context2.getResources().getQuantityString(2131755118, (int) bulletinPollOption2.LIZIZ()), Arrays.copyOf(new Object[]{String.valueOf(C19374310qz.LIZ(Long.valueOf(bulletinPollOption2.LIZIZ()), new C19348710mr(null, EnumC19356310o5.COMPACT, null, 13), null, 0, 28))}, 1)));
                                if (i2 == 0) {
                                    C786410Ut5.LJLLLLLL(0, viewTd.findViewById(R.id.d3e));
                                } else {
                                    C786410Ut5.LJLLLLLL(8, viewTd.findViewById(R.id.d3e));
                                }
                                if (i2 == list.size() - 1) {
                                    C786410Ut5.LJLLLLLL(0, viewTd.findViewById(R.id.d3d));
                                } else {
                                    C786410Ut5.LJLLLLLL(8, viewTd.findViewById(R.id.d3d));
                                }
                                i2 = i3;
                                r12 = 0;
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                int size = pollVoteDetailSheetViewPagerAssem.LLJJ + ((list.size() - 1) * pollVoteDetailSheetViewPagerAssem.LLJJI) + pollVoteDetailSheetViewPagerAssem.LLJJIII;
                int iLJIIJ = C12ES.LJIIJ(pollVoteDetailSheetViewPagerAssem.getContext());
                int size2 = (iLJIIJ - size) / list.size();
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("initViewPager measure ideally with = ");
                sbLIZ3.append(size);
                sbLIZ3.append(", screen width = ");
                sbLIZ3.append(iLJIIJ);
                sbLIZ3.append(", extra = ");
                sbLIZ3.append(size2);
                C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ3));
                int i5 = 0;
                for (Object obj4 : (ArrayList) pollVoteDetailSheetViewPagerAssem.LLJILLL) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        View view = (View) obj4;
                        C19U0 tabAt = ((C19U1) pollVoteDetailSheetViewPagerAssem.LLJILJIL.getValue()).getTabAt(i5);
                        if (tabAt != null) {
                            tabAt.LIZLLL(view);
                        }
                        if (size < iLJIIJ && (viewFindViewById2 = view.findViewById(R.id.d3a)) != null && (layoutParams = viewFindViewById2.getLayoutParams()) != null) {
                            layoutParams.width = ((Integer) viewFindViewById2.getTag()).intValue() + size2;
                        }
                        i5 = i6;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                ((C19U1) pollVoteDetailSheetViewPagerAssem.LLJILJIL.getValue()).addOnTabSelectedListener(new InterfaceC1584740rLE() { // from class: X.0OZ1
                    @Override // X.InterfaceC1586460rO0
                    public final void ih(C19U0 c19u0) {
                    }

                    @Override // X.InterfaceC1586460rO0
                    public final void Oq(C19U0 c19u0) {
                        View view2;
                        View viewFindViewById4;
                        if (c19u0 != null && (view2 = c19u0.LJFF) != null && (viewFindViewById4 = view2.findViewById(R.id.d3a)) != null) {
                            viewFindViewById4.setBackgroundResource(R.drawable.agd);
                        }
                    }

                    @Override // X.InterfaceC1586460rO0
                    public final void Yn(C19U0 c19u0) {
                        View view2;
                        View viewFindViewById4;
                        if (c19u0 != null && (view2 = c19u0.LJFF) != null && (viewFindViewById4 = view2.findViewById(R.id.d3a)) != null) {
                            viewFindViewById4.setBackgroundResource(R.drawable.ag3);
                        }
                    }
                });
                List<BulletinPollOption> list2 = bulletinPollVoteDetailResponse.options;
                if (list2 != null) {
                    Iterator<BulletinPollOption> it2 = list2.iterator();
                    i = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().LIZIZ() > 0) {
                                break;
                            }
                            i++;
                        } else {
                            i = -1;
                            break;
                        }
                    }
                } else {
                    i = 0;
                }
                C19U0 tabAt2 = ((C19U1) pollVoteDetailSheetViewPagerAssem.LLJILJIL.getValue()).getTabAt(i);
                if (tabAt2 != null) {
                    tabAt2.LIZIZ();
                    pollVoteDetailSheetViewPagerAssem.Ho().setCurrentItem(i, false);
                    View view2 = tabAt2.LJFF;
                    if (view2 != null && (viewFindViewById = view2.findViewById(R.id.d3a)) != null) {
                        viewFindViewById.setBackgroundResource(R.drawable.agd);
                    }
                }
                pollVoteDetailSheetViewPagerAssem.Ho().addOnPageChangeListener(new InterfaceC469360Ias() { // from class: X.0OZ0
                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrollStateChanged(int i7) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageScrolled(int i7, float f, int i8) {
                    }

                    @Override // X.InterfaceC469360Ias
                    public final void onPageSelected(int i7) {
                        BBFixViewPagerBottomSheetBehavior bBFixViewPagerBottomSheetBehavior;
                        TuxSheetBehavior tuxSheetBehavior;
                        Fragment fragmentLJI2 = C724240Sb0.LJI(pollVoteDetailSheetViewPagerAssem);
                        if (fragmentLJI2 != null) {
                            PollVoteDetailSheetViewPagerAssem pollVoteDetailSheetViewPagerAssem2 = pollVoteDetailSheetViewPagerAssem;
                            String str = TuxSheet._pnsPageId;
                            C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(fragmentLJI2);
                            if (C299110Bnx.LIZ()) {
                                if ((c16bcLJIIIZ instanceof TuxBBFixViewPagerSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null) {
                                    tuxSheetBehavior.LJJIII = new WeakReference<>(tuxSheetBehavior.findScrollingChild(pollVoteDetailSheetViewPagerAssem2.Ho()));
                                    return;
                                }
                                return;
                            }
                            if (!(c16bcLJIIIZ instanceof BBFixViewPagerBottomSheetBehavior) || (bBFixViewPagerBottomSheetBehavior = (BBFixViewPagerBottomSheetBehavior) c16bcLJIIIZ) == null) {
                                return;
                            }
                            bBFixViewPagerBottomSheetBehavior.LIZ(pollVoteDetailSheetViewPagerAssem2.Ho());
                        }
                    }
                });
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        C0OOC c0ooc = (C0OOC) obj3;
        BulletinPoll bulletinPoll = (BulletinPoll) ((C291001Au) obj2).LIZ();
        if (bulletinPoll != null) {
            AssemVMLazy assemVMLazy = ((BulletinCreatorEditAssem) awS658S0100000_9.l0).LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BulletinCreatorEditAssem.LLJL;
            ((BulletinPublishViewModel) assemVMLazy.getValue()).wQ2(bulletinPoll, c0ooc);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        InterfaceC1685750ty9 interfaceC1685750ty9 = (InterfaceC1685750ty9) obj;
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        ((Number) obj3).intValue();
        interfaceC1680500tpg.LJJIIJZLJL(898372842);
        interfaceC1680500tpg.LJJIIJZLJL(1849434622);
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C612270Nzt();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        InterfaceC595010NVj interfaceC595010NVj = (InterfaceC595010NVj) objLJJ;
        interfaceC1680500tpg.LJ();
        interfaceC1680500tpg.LJJIIJZLJL(5004770);
        boolean zLJJIIJ = interfaceC1680500tpg.LJJIIJ((Function0) awS658S0100000_9.l0);
        Function0 function0 = (Function0) awS658S0100000_9.l0;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (zLJJIIJ || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS553S0100000_9(function0, (Function0<Unit>) 63);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        interfaceC1680500tpg.LJ();
        InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C634380OuS.LIZ(interfaceC1685750ty9, interfaceC595010NVj, null, true, null, null, (Function0) objLJJ2);
        interfaceC1680500tpg.LJ();
        return interfaceC1685750ty9LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS658S0100000_9 r16, java.lang.Object r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r0 = r19
            r15 = r18
            r1 = r17
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r15 = (X.InterfaceC1680500tpg) r15
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = r0.intValue()
            r0 = r4 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r15.LJIJI(r3)
            if (r0 == 0) goto L86
            r0 = 4
        L20:
            r4 = r4 | r0
        L21:
            r1 = r4 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r15.LIZ()
            if (r0 == 0) goto L33
            r15.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r15.LJJIIJZLJL(r0)
            r0 = r4 & 14
            if (r0 != r2) goto L84
            r0 = 1
        L3e:
            java.lang.Object r4 = r15.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r4 != r0) goto L56
        L4d:
            kotlin.jvm.internal.AwS53S0001000_9 r4 = new kotlin.jvm.internal.AwS53S0001000_9
            r0 = 0
            r4.<init>(r3, r0)
            r15.LJJIJIIJI(r4)
        L56:
            kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
            r15.LJ()
            r5 = 0
            X.0tW1 r6 = X.EnumC1668310tW1.Normal
            r8 = 0
            r0 = r16
            java.lang.Object r2 = r0.l0
            X.0ORG r2 = (X.C0ORG) r2
            java.lang.String r10 = r2.LIZJ
            kotlin.jvm.internal.AwS445S0200000_9 r1 = new kotlin.jvm.internal.AwS445S0200000_9
            r0 = 5
            r1.<init>(r2, r4, r0)
            r0 = 268643014(0x10032ac6, float:2.5868146E-29)
            X.12De r13 = X.C13Z4.LIZJ(r0, r1, r15)
            r16 = 805309872(0x30000db0, float:4.658558E-10)
            r18 = 1456(0x5b0, float:2.04E-42)
            r7 = r5
            r9 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r17 = r5
            X.C1668330tW3.LJI(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L30
        L84:
            r0 = 0
            goto L3e
        L86:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS658S0100000_9.invoke$5(kotlin.jvm.internal.AwS658S0100000_9, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        String str;
        int i;
        C698190Ra5 c698190Ra5LJII;
        BulletinTooltipAbility bulletinTooltipAbility;
        List list = (List) obj2;
        List<BulletinPublishAction> list2 = (List) obj3;
        BulletinCreatorEditAssem bulletinCreatorEditAssem = (BulletinCreatorEditAssem) awS658S0100000_9.l0;
        if (list != null) {
            if (!bulletinCreatorEditAssem.op().LLJL) {
                Iterator it2 = list.iterator();
                boolean z = false;
                while (it2.hasNext()) {
                    if (((BulletinPublishAction) it2.next()).getBubbleStruct() != null) {
                        z = true;
                    }
                }
                if (!z && (bulletinTooltipAbility = (BulletinTooltipAbility) bulletinCreatorEditAssem.LLJJJIL.getValue()) != null) {
                    bulletinTooltipAbility.WK0(EnumC619900OTc.GAMEPLAY_ACB_TOOLTIP);
                }
            }
            C786410Ut5.LLF(0, bulletinCreatorEditAssem.sp());
            bulletinCreatorEditAssem.sp().getState().LJIILL(list, null);
        } else {
            bulletinCreatorEditAssem.getClass();
        }
        BulletinCreatorEditAssem bulletinCreatorEditAssem2 = (BulletinCreatorEditAssem) awS658S0100000_9.l0;
        bulletinCreatorEditAssem2.getClass();
        if (C866950Xzh.LIZIZ(list2)) {
            bulletinCreatorEditAssem2.LLJJLIIIJLLLLLLLZ.clear();
            if (list2 != null) {
                for (BulletinPublishAction bulletinPublishAction : list2) {
                    List<C443090HZb> list3 = bulletinCreatorEditAssem2.LLJJLIIIJLLLLLLLZ;
                    InboxTextStruct text = bulletinPublishAction.getText();
                    if (text == null || (str = text.text) == null) {
                        str = "";
                    }
                    AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(bulletinCreatorEditAssem2, bulletinPublishAction, 7);
                    TuxImageModel iconUrlModel = bulletinPublishAction.getIconUrlModel();
                    if (iconUrlModel != null && (c698190Ra5LJII = C0OSB.LJII(bulletinCreatorEditAssem2.LJJIJL().getContext(), iconUrlModel)) != null) {
                        i = c698190Ra5LJII.LIZ;
                    } else {
                        i = 0;
                    }
                    list3.add(new C443090HZb(str, awS410S0200000_9, i, null, 0, null, 0, false, false, null, 1016));
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        BulletinInputTopContainer bulletinInputTopContainer = (BulletinInputTopContainer) awS658S0100000_9.l0;
        bulletinInputTopContainer.kp((C0OSF) obj3, (C0OWM) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        boolean z;
        String str;
        BulletinBarEntrance bulletinBarEntrance = (BulletinBarEntrance) obj2;
        if (C0A1F.LIZ() && obj3 != EnumC617480OJu.UNINITIALIZED) {
            if (bulletinBarEntrance == null) {
                BaseBulletinBarAssem baseBulletinBarAssem = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                baseBulletinBarAssem.Go(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
                C0OM2 c0om2 = baseBulletinBarAssem.LLJILJIL;
                if (c0om2 != null) {
                    c0om2.LIZ();
                }
                baseBulletinBarAssem.LLJILLL = EnumC618000OLu.BAR_ENTRANCE_TYPE_UNKNOWN.getType();
                baseBulletinBarAssem.LLJJ = null;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(bulletinBarEntrance.type);
                sbLIZ.append(bulletinBarEntrance.objectId);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if ((!a0.LJJJIL(strLIZIZ)) && !Intrinsics.LJFF(((BaseBulletinBarAssem) awS658S0100000_9.l0).LLJJ, strLIZIZ)) {
                    z = true;
                } else {
                    z = false;
                }
                BaseBulletinBarAssem baseBulletinBarAssem2 = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                baseBulletinBarAssem2.LLJILLL = bulletinBarEntrance.type;
                baseBulletinBarAssem2.LLJJ = strLIZIZ;
                baseBulletinBarAssem2.LLJJI = bulletinBarEntrance.refreshType;
                int i = bulletinBarEntrance.showType;
                if (i == C0OM7.BAR_ENTRANCE_SHOW_TYPE_LIVE.getType()) {
                    if (bulletinBarEntrance.isLivingEntrance()) {
                        BaseBulletinBarAssem baseBulletinBarAssem3 = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                        C0OM2 c0om22 = baseBulletinBarAssem3.LLJILJIL;
                        if (c0om22 != null) {
                            C0OM2.LIZIZ(c0om22, bulletinBarEntrance, baseBulletinBarAssem3.No(), ((BaseBulletinBarAssem) awS658S0100000_9.l0).Lo(), z);
                        }
                        BaseBulletinBarAssem baseBulletinBarAssem4 = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                        C0OM2 c0om23 = baseBulletinBarAssem4.LLJILJIL;
                        if (c0om23 != null) {
                            HandlerHook.viewPost(c0om23, new ARunnableS106S0100000_6(baseBulletinBarAssem4, 76));
                        }
                    } else {
                        C0OM2 c0om24 = ((BaseBulletinBarAssem) awS658S0100000_9.l0).LLJILJIL;
                        if (c0om24 != null) {
                            c0om24.LIZ();
                        }
                        ((BaseBulletinBarAssem) awS658S0100000_9.l0).Go(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
                    }
                } else {
                    C0OM7 c0om7 = C0OM7.BAR_ENTRANCE_SHOW_TYPE_TEMPLATE;
                    if (i == c0om7.getType()) {
                        BaseBulletinBarAssem baseBulletinBarAssem5 = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                        C0OM2 c0om25 = baseBulletinBarAssem5.LLJILJIL;
                        if (c0om25 != null) {
                            BulletinProfileViewModel bulletinProfileViewModelNo = baseBulletinBarAssem5.No();
                            C0OLV c0olvLo = ((BaseBulletinBarAssem) awS658S0100000_9.l0).Lo();
                            if (bulletinBarEntrance.showType == c0om7.getType()) {
                                C12ES.LJIILL(0, c0om25);
                                C0DTR.LIZIZ(c0om25.getBulletinPageBarEntranceLiveIconFromXml());
                                c0om25.getBulletinPageBarEntranceLiveIconFromXml().LIZIZ();
                                C12ES.LJIILL(0, c0om25.getBulletinPageBarEntranceIconFromXml());
                                C0OSB.LJFF(c0om25.getBulletinPageBarEntranceIconFromXml(), bulletinBarEntrance.iconUrlModel, null);
                                C0OSB.LJI(c0om25.getBulletinPageBarEntranceTextFromXml(), bulletinBarEntrance.text);
                                String str2 = bulletinBarEntrance.bgColor;
                                if (str2 != null && (true ^ a0.LJJJIL(str2))) {
                                    C01GW c01gw = C2248361CzK.LIZ;
                                    Integer numLJ = C2248361CzK.LJ(c0om25.getContext(), str2);
                                    if (numLJ != null) {
                                        int iIntValue = numLJ.intValue();
                                        LinearLayout bulletinPageBarEntranceAreaFromXml = c0om25.getBulletinPageBarEntranceAreaFromXml();
                                        C384050F3z c384050F3z = new C384050F3z();
                                        c384050F3z.LIZ = Integer.valueOf(iIntValue);
                                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(14));
                                        bulletinPageBarEntranceAreaFromXml.setBackground(c384050F3z.LIZ(c0om25.getContext()));
                                    }
                                }
                                C786410Ut5.tb(c0om25, new ACListenerS47S0400000_9(c0olvLo, c0om25, bulletinProfileViewModelNo, bulletinBarEntrance, 0));
                                if (z) {
                                    C0OPQ c0opq = C0OPQ.LIZ;
                                    if (c0olvLo == null || (str = c0olvLo.LLILLJJLI) == null) {
                                        str = "";
                                    }
                                    boolean zTo = bulletinProfileViewModelNo.To();
                                    boolean zNl = bulletinProfileViewModelNo.Nl();
                                    String strValueOf = String.valueOf(bulletinProfileViewModelNo.LLILLJJLI);
                                    boolean zQ11 = bulletinProfileViewModelNo.q11();
                                    Map<String, String> trackingMap = bulletinBarEntrance.getTrackingMap();
                                    c0opq.getClass();
                                    C0OPQ.LJJIFFI(str, zTo, zNl, strValueOf, zQ11, "show", trackingMap);
                                }
                            }
                        }
                        BaseBulletinBarAssem baseBulletinBarAssem6 = (BaseBulletinBarAssem) awS658S0100000_9.l0;
                        C0OM2 c0om26 = baseBulletinBarAssem6.LLJILJIL;
                        if (c0om26 != null) {
                            HandlerHook.viewPost(c0om26, new ARunnableS106S0100000_6(baseBulletinBarAssem6, 77));
                        }
                    } else {
                        C0OM2 c0om27 = ((BaseBulletinBarAssem) awS658S0100000_9.l0).LLJILJIL;
                        if (c0om27 != null) {
                            c0om27.LIZ();
                        }
                        ((BaseBulletinBarAssem) awS658S0100000_9.l0).Go(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68)));
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS658S0100000_9 awS658S0100000_9, Object obj, Object obj2, Object obj3) {
        List list = (List) obj3;
        BulletinProfileCell bulletinProfileCell = (BulletinProfileCell) awS658S0100000_9.l0;
        bulletinProfileCell.getClass();
        BulletinCommonAbility bulletinCommonAbility = (BulletinCommonAbility) bulletinProfileCell.LLILLL.getValue();
        if ((bulletinCommonAbility != null && bulletinCommonAbility.K82()) || obj2 != EnumC617480OJu.BULLETIN_OPEN) {
            C0DTR.LIZIZ((View) bulletinProfileCell.LLJIJIL.getValue());
        } else {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                for (Object obj4 : list) {
                    if (obj4 != null) {
                        arrayList.add(obj4);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                C12ES.LJIILL(0, (View) bulletinProfileCell.LLJIJIL.getValue());
                ((ViewOnAttachStateChangeListenerC20604515jv) bulletinProfileCell.LLJIJIL.getValue()).getState().LJIILL(arrayList, null);
            } else {
                C0DTR.LIZIZ((View) bulletinProfileCell.LLJIJIL.getValue());
            }
        }
        return Unit.LIZ;
    }
}
