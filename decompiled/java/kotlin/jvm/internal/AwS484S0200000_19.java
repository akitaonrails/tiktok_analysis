package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C0YUS;
import X.C1219970hqt;
import X.C1228470i4b;
import X.C1228590i4n;
import X.C1228810i59;
import X.C1231470i9R;
import X.C1246360iXS;
import X.C1440005kM;
import X.C1618770sE7;
import X.C1649560t1m;
import X.C16GX;
import X.C1799610wvn;
import X.C1902890zcN;
import X.C19EG;
import X.C20684815ws;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C259800zU;
import X.C786410Ut5;
import X.C894660Z7w;
import X.EnumC1219960hqs;
import X.EnumC1228720i50;
import X.EnumC1228990i5R;
import X.EnumC891450Yy7;
import X.InterfaceC1228540i4i;
import X.InterfaceC1249460icS;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.compliance.api.model.Organization;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.feed.model.story.StoryNoteDataCollection;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeChannelInfo;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragment;
import com.ss.android.ugc.aweme.selector.choosegroup.FanGroupChooseGroupFragmentParam;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.gamora.recorder.progress.f;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.FindSchoolFriendsPageContainerAssem;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssem;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class AwS484S0200000_19 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(EnumC891450Yy7 enumC891450Yy7, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = enumC891450Yy7;
        this.l1 = messageNotificationToneChooseFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(InterfaceC1249460icS interfaceC1249460icS, ProfileComponents profileComponents, int i) {
        super(3);
        this.$t = i;
        this.l0 = interfaceC1249460icS;
        this.l1 = profileComponents;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(C19EG c19eg, ProfileAigcProgressAssem profileAigcProgressAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = profileAigcProgressAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(Activity activity, C1649560t1m c1649560t1m, int i) {
        super(3);
        this.$t = i;
        this.l0 = activity;
        this.l1 = c1649560t1m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(Context context, TrustedDevicesItemCell trustedDevicesItemCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = trustedDevicesItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(Context context, InboxSearchDefaultPageFoldCell inboxSearchDefaultPageFoldCell, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = inboxSearchDefaultPageFoldCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(Context context, f fVar, int i) {
        super(3);
        this.$t = i;
        this.l0 = context;
        this.l1 = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(MusNotice musNotice, SystemNotificationListViewModel systemNotificationListViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = musNotice;
        this.l1 = systemNotificationListViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(FanGroupChooseGroupFragment fanGroupChooseGroupFragment, FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam, int i) {
        super(3);
        this.$t = i;
        this.l0 = fanGroupChooseGroupFragment;
        this.l1 = fanGroupChooseGroupFragmentParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(AnchorPublishStruct anchorPublishStruct, Context context, int i) {
        super(3);
        this.$t = i;
        this.l0 = anchorPublishStruct;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(ProfileAvatarAssem profileAvatarAssem, StoryNoteDataCollection storyNoteDataCollection, int i) {
        super(3);
        this.$t = i;
        this.l0 = profileAvatarAssem;
        this.l1 = storyNoteDataCollection;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS484S0200000_19(FindSchoolFriendsPageContainerAssem findSchoolFriendsPageContainerAssem, C16GX c16gx, int i) {
        super(3);
        this.$t = i;
        this.l0 = findSchoolFriendsPageContainerAssem;
        this.l1 = c16gx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS484S0200000_19(AdvancedFeatureBaseData advancedFeatureBaseData, AdvancedFeatureBaseData advancedFeatureBaseData2, ContentCellNewBaseUIComponent<T> contentCellNewBaseUIComponent) {
        super(3);
        this.$t = contentCellNewBaseUIComponent;
        this.l0 = advancedFeatureBaseData;
        this.l1 = advancedFeatureBaseData2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS484S0200000_19(AwemePagerAssem awemePagerAssem, AwemePagerAssem awemePagerAssem2, C259800zU<String> c259800zU) {
        super(3);
        this.$t = c259800zU;
        this.l0 = awemePagerAssem;
        this.l1 = awemePagerAssem2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS484S0200000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto La9
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto La7
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 8
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833952(0x7f113460, float:1.9301E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            android.app.Activity r0 = (android.app.Activity) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833951(0x7f11345f, float:1.9300999E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS297S0300000_19 r3 = new kotlin.jvm.internal.AwS297S0300000_19
            java.lang.Object r2 = r5.l0
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Object r1 = r5.l1
            X.0t1m r1 = (X.C1649560t1m) r1
            r0 = 1
            r3.<init>(r2, r1, r6, r0)
            r0 = 118883529(0x71604c9, float:1.1286152E-34)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La7:
            r0 = 0
            goto L3e
        La9:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$0(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS484S0200000_19 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            X.0u02 r5 = (X.InterfaceC1686920u02) r5
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r7 = (java.lang.Number) r7
            int r3 = r7.intValue()
            r0 = r3 & 6
            r2 = 2
            if (r0 != 0) goto L17
            boolean r0 = r6.LJJIIJ(r5)
            if (r0 == 0) goto L8b
            r0 = 4
        L16:
            r3 = r3 | r0
        L17:
            r1 = r3 & 19
            r0 = 18
            if (r1 != r0) goto L29
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L29
            r6.LIZJ()
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            java.lang.Object r0 = r4.l0
            X.0Yy7 r0 = (X.EnumC891450Yy7) r0
            if (r0 == 0) goto L8d
            int[] r1 = X.C891460Yy8.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L7c
            if (r1 != r2) goto L8d
            r0 = -658120669(0xffffffffd8c5e023, float:-1.7405316E15)
            r6.LJJIIJZLJL(r0)
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment r0 = (com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment) r0
            boolean r0 = r6.LJII(r0)
            java.lang.Object r1 = r4.l1
            com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment r1 = (com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment) r1
            java.lang.Object r2 = r6.LJJ()
            if (r0 != 0) goto L63
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r2 != r0) goto L6d
        L63:
            kotlin.jvm.internal.AwS558S0100000_14 r2 = new kotlin.jvm.internal.AwS558S0100000_14
            r0 = 586(0x24a, float:8.21E-43)
            r2.<init>(r1, r0)
            r6.LJJIJIIJI(r2)
        L6d:
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r6.LJ()
            r1 = r3 & 14
            r0 = 0
            X.C1689210u3j.LIZIZ(r5, r2, r6, r1, r0)
            r6.LJ()
            goto L26
        L7c:
            r0 = -658122644(0xffffffffd8c5d86c, float:-1.7402665E15)
            r6.LJJIIJZLJL(r0)
            r0 = r3 & 14
            X.C1689210u3j.LIZJ(r5, r6, r0)
            r6.LJ()
            goto L26
        L8b:
            r0 = 2
            goto L16
        L8d:
            r0 = -658124890(0xffffffffd8c5cfa6, float:-1.7399651E15)
            r6.LJJIIJZLJL(r0)
            r6.LJ()
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$1(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$10(kotlin.jvm.internal.AwS484S0200000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto La2
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto La0
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 19
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r1 = r5.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847151(0x7f1167ef, float:1.9327771E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r1 = r5.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847138(0x7f1167e2, float:1.9327745E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS297S0300000_19 r3 = new kotlin.jvm.internal.AwS297S0300000_19
            java.lang.Object r2 = r5.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell r1 = (com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchDefaultPageFoldCell) r1
            r0 = 14
            r3.<init>(r2, r1, r6, r0)
            r0 = 347433447(0x14b569e7, float:1.83181E-26)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La0:
            r0 = 0
            goto L3e
        La2:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$10(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$11(AwS484S0200000_19 awS484S0200000_19, Object obj, Object obj2, Object obj3) {
        String strLIZJ;
        String str;
        String str2;
        String str3;
        ((Number) obj).intValue();
        int iIntValue = ((Number) obj2).intValue();
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        String str4 = ((MusNotice) awS484S0200000_19.l0).categoryTitle;
        if (str4 != null) {
            if (zBooleanValue) {
                strLIZJ = C1618770sE7.LIZLLL(2131849514, str4);
            } else {
                strLIZJ = C1618770sE7.LIZLLL(2131849516, str4);
            }
        } else if (zBooleanValue) {
            strLIZJ = C1618770sE7.LIZJ(2131837854);
        } else {
            strLIZJ = C1618770sE7.LIZJ(2131837855);
        }
        ((SystemNotificationListViewModel) awS484S0200000_19.l1).setState(new AwS70S1000000_19(strLIZJ, 23));
        if (zBooleanValue) {
            str = "system_notification_unsubscribe_toast";
        } else {
            str = "system_notification_resubscribe_toast";
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("category_type", String.valueOf(iIntValue));
        NoticeChannelInfo noticeChannelInfo = ((MusNotice) awS484S0200000_19.l0).channelInfo;
        if (noticeChannelInfo == null || (str2 = noticeChannelInfo.accountType) == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("account_type", str2);
        C1246360iXS c1246360iXS = C1902890zcN.LIZ;
        if (c1246360iXS != null) {
            str3 = c1246360iXS.LIZJ;
        } else {
            str3 = null;
        }
        pairArr[3] = new Pair("cell_type", str3);
        C20684815ws.LJIILLIIL(str, C2097608Jq.LJIIJ(pairArr));
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS484S0200000_19 awS484S0200000_19, Object obj, Object obj2, Object obj3) {
        int value;
        List<EnumC1219960hqs> listSingletonList;
        Context contextLIZ = (Context) obj;
        String str = (String) obj2;
        FanGroupChooseGroupFragment fanGroupChooseGroupFragment = (FanGroupChooseGroupFragment) awS484S0200000_19.l0;
        FanGroupChooseGroupFragmentParam fanGroupChooseGroupFragmentParam = (FanGroupChooseGroupFragmentParam) awS484S0200000_19.l1;
        fanGroupChooseGroupFragment.getClass();
        if (contextLIZ == null) {
            C0I0B.LJFF.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        int i = fanGroupChooseGroupFragmentParam.createChatLandingPage;
        if (i != EnumC1228720i50.NONE.getValue()) {
            if (i == EnumC1228720i50.GROUP_LIST.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("navigateAfterInvite: GROUP_LIST convId=");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC1228540i4i.LIZ.getClass();
                C1228470i4b c1228470i4bLIZIZ = C1228590i4n.LIZ().LIZIZ(fanGroupChooseGroupFragmentParam.enterFrom, fanGroupChooseGroupFragmentParam.enterMethod, fanGroupChooseGroupFragmentParam.isFullScreen);
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(fanGroupChooseGroupFragmentParam.businessType);
                if (numLJIIJJI != null) {
                    value = numLJIIJJI.intValue();
                } else {
                    value = EnumC1219960hqs.UNKNOWN.getValue();
                }
                if (value != EnumC1219960hqs.UNKNOWN.getValue()) {
                    EnumC1219960hqs.Companion.getClass();
                    listSingletonList = Collections.singletonList(C1219970hqt.LIZ(value));
                } else {
                    listSingletonList = c1228470i4bLIZIZ.LIZIZ.LJIILLIIL;
                }
                C1228810i59 c1228810i59 = c1228470i4bLIZIZ.LIZIZ;
                String str2 = fanGroupChooseGroupFragmentParam.creatorUid;
                boolean z = fanGroupChooseGroupFragmentParam.isFullScreen;
                boolean z2 = fanGroupChooseGroupFragmentParam.disableBackgroundMask;
                int i2 = fanGroupChooseGroupFragmentParam.quickChatViewType;
                String str3 = fanGroupChooseGroupFragmentParam.trafficType;
                if (str3.length() == 0) {
                    str3 = fanGroupChooseGroupFragmentParam.enterFrom;
                }
                String str4 = fanGroupChooseGroupFragmentParam.groupType;
                String value2 = fanGroupChooseGroupFragmentParam.groupCategory;
                if (value2.length() == 0) {
                    value2 = EnumC1228990i5R.PUBLIC_GROUP.getValue();
                }
                C1228470i4b c1228470i4bLIZ = C1228470i4b.LIZ(c1228470i4bLIZIZ, null, C1228810i59.LIZ(c1228810i59, str2, z, z2, value2, C2097608Jq.LJIIL(c1228470i4bLIZIZ.LIZIZ.LJIIJJI, FanGroupChooseGroupFragment.SR(fanGroupChooseGroupFragmentParam)), i2, str3, str4, listSingletonList), 1);
                IMGroupChatApi.LIZIZ.getClass();
                new C1231470i9R("live", "live_fan_group_awareness", "schema").LJFF(contextLIZ, c1228470i4bLIZ);
            } else if (i == EnumC1228720i50.CHAT_ROOM.getValue()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("navigateAfterInvite: CHAT_ROOM convId=");
                sbLIZ2.append(str);
                C2188811AlT.LIZIZ(sbLIZ2);
                FanGroupChooseGroupFragment.UR(contextLIZ, fanGroupChooseGroupFragmentParam, str);
            } else {
                FanGroupChooseGroupFragment.UR(contextLIZ, fanGroupChooseGroupFragmentParam, str);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AwS484S0200000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r5 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r3 = r0.intValue()
            r0 = r3 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r5)
            if (r0 == 0) goto Laf
            r0 = 4
        L20:
            r3 = r3 | r0
        L21:
            r1 = r3 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r3 & 14
            r3 = 0
            if (r0 != r2) goto Lad
            r0 = 1
        L3f:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4e
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L58
        L4e:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 30
            r6.<init>(r5, r0)
            r4.LJJIJIIJI(r6)
        L58:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r1 = r5.l0
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131857401(0x7f118ff9, float:1.934856E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell r0 = (com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell) r0
            com.ss.android.ugc.aweme.account.login.twostep.Device r0 = r0.LLILZIL
            if (r0 == 0) goto Lab
            java.lang.String r0 = r0.device_name
        L78:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "{device_model}"
            java.lang.String r12 = kotlin.text.u.LJJIFFI(r2, r0, r1, r3)
            kotlin.jvm.internal.AwS297S0300000_19 r3 = new kotlin.jvm.internal.AwS297S0300000_19
            java.lang.Object r2 = r5.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell r1 = (com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesItemCell) r1
            r0 = 19
            r3.<init>(r2, r1, r6, r0)
            r0 = 50975660(0x309d3ac, float:4.050367E-37)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1456(0x5b0, float:2.04E-42)
            r7 = 1
            r11 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r17 = r4
            r19 = r9
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        Lab:
            r0 = 0
            goto L78
        Lad:
            r0 = 0
            goto L3f
        Laf:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$13(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS484S0200000_19 awS484S0200000_19, Object obj, Object obj2, Object obj3) {
        Organization organization = (Organization) obj;
        if (organization != null) {
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("add_from", 2);
            String str = organization.orgId;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("organization_id", str);
            String str3 = organization.orgType;
            if (str3 == null) {
                str3 = "";
            }
            pairArr[2] = new Pair("organization_type", str3);
            String str4 = organization.fundraiserId;
            if (str4 == null) {
                str4 = "";
            }
            pairArr[3] = new Pair("fundraiser_id", str4);
            String str5 = organization.name;
            if (str5 != null) {
                str2 = str5;
            }
            pairArr[4] = new Pair("name", str2);
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            int i = ((AnchorPublishStruct) awS484S0200000_19.l0).type;
            String strJ3 = C786410Ut5.J3(new JSONObject(mapLJIIIIZZ));
            String strJ4 = C786410Ut5.j4(((Context) awS484S0200000_19.l1).getString(2131832356), Arrays.copyOf(new Object[]{organization.name}, 1));
            UrlModel urlModel = new UrlModel();
            urlModel.setUri("https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png");
            urlModel.setUrlList(Collections.singletonList("https://p16.tiktokcdn.com/obj/tiktok-obj/who3x.png"));
            AnchorTransData anchorTransData = new AnchorTransData(i, strJ3, strJ4, "", 1, "", urlModel, true, "", "", 0L, "", "", true, null, null, null, null, 0, -1, null, null);
            C1440005kM.LIZ(new C0YUS(((AnchorPublishStruct) awS484S0200000_19.l0).type));
            C1440005kM.LIZ(new C1799610wvn(anchorTransData));
            IFundraiserService iFundraiserService = (IFundraiserService) PluggableExtentionKt.pluggableSpi$default(IFundraiserService.class, false, false, false, 14, null);
            if (iFundraiserService != null) {
                iFundraiserService.LJIIIZ();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS484S0200000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto La9
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto La7
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 14
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833952(0x7f113460, float:1.9301E38)
            java.lang.String r11 = r1.getString(r0)
            java.lang.Object r0 = r5.l0
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131833951(0x7f11345f, float:1.9300999E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS297S0300000_19 r3 = new kotlin.jvm.internal.AwS297S0300000_19
            java.lang.Object r2 = r5.l0
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.gamora.recorder.progress.f r1 = (com.ss.android.ugc.gamora.recorder.progress.f) r1
            r0 = 4
            r3.<init>(r2, r1, r6, r0)
            r0 = 1653645652(0x6290a154, float:1.333978E21)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1424(0x590, float:1.995E-42)
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        La7:
            r0 = 0
            goto L3e
        La9:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$3(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$4(kotlin.jvm.internal.AwS484S0200000_19 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$4(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS484S0200000_19 r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
        /*
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            r4 = 0
            if (r0 == 0) goto L36
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData r0 = (com.ss.android.ugc.profile.platform.business.header.advanced.AdvancedFeatureBaseData) r0
            java.lang.Integer r2 = r0.getRecordType()
            X.082s r0 = X.EnumC20536082s.RECORD_REQUEST_SELF
            int r1 = r0.getType()
            if (r2 == 0) goto L36
            int r0 = r2.intValue()
            if (r0 != r1) goto L36
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent r0 = (com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent) r0
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r3 = r0.Zo()
            if (r3 == 0) goto L33
            kotlin.jvm.internal.AwS18S0010000_3 r2 = new kotlin.jvm.internal.AwS18S0010000_3
            r1 = 1
            r0 = 0
            r2.<init>(r1, r0)
            r3.SQ2(r2, r4)
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L36:
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent r0 = (com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.ContentCellNewBaseUIComponent) r0
            com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel r2 = r0.Zo()
            if (r2 == 0) goto L33
            kotlin.jvm.internal.AwS18S0010000_3 r1 = new kotlin.jvm.internal.AwS18S0010000_3
            r0 = 0
            r1.<init>(r4, r0)
            r2.SQ2(r1, r4)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$5(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS484S0200000_19 r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            android.content.Context r7 = (android.content.Context) r7
            android.view.View r8 = (android.view.View) r8
            java.lang.Object r0 = r6.l0
            X.0icS r0 = (X.InterfaceC1249460icS) r0
            java.util.List r0 = r0.xp()
            r5 = 0
            if (r0 == 0) goto L3f
            java.lang.Object r4 = r6.l1
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r4 = (com.ss.android.ugc.profile.platform.base.data.ProfileComponents) r4
            java.util.Iterator r3 = r0.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol r0 = (com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r4.componentName
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L17
            r5 = r2
        L31:
            com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol r5 = (com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol) r5
            if (r5 == 0) goto L3f
            boolean r1 = r5.LJII(r8)
            r0 = 1
            if (r1 != r0) goto L3f
        L3c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3f:
            X.0iaV r1 = X.C1248250iaV.LIZ
            java.lang.Object r0 = r6.l1
            com.ss.android.ugc.profile.platform.base.data.ProfileComponents r0 = (com.ss.android.ugc.profile.platform.base.data.ProfileComponents) r0
            r1.getClass()
            X.C1248250iaV.LIZJ(r0, r7)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$6(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS484S0200000_19 r17, java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            r0 = r20
            r4 = r19
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            int r3 = r1.intValue()
            X.0tpg r4 = (X.InterfaceC1680500tpg) r4
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            r0 = r5 & 6
            r2 = 4
            if (r0 != 0) goto L21
            boolean r0 = r4.LJIJI(r3)
            if (r0 == 0) goto L9b
            r0 = 4
        L20:
            r5 = r5 | r0
        L21:
            r1 = r5 & 19
            r0 = 18
            if (r1 != r0) goto L33
            boolean r0 = r4.LIZ()
            if (r0 == 0) goto L33
            r4.LIZJ()
        L30:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L33:
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r4.LJJIIJZLJL(r0)
            r0 = r5 & 14
            if (r0 != r2) goto L99
            r0 = 1
        L3e:
            java.lang.Object r6 = r4.LJJ()
            if (r0 != 0) goto L4d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r6 != r0) goto L57
        L4d:
            kotlin.jvm.internal.AwS61S0001000_19 r6 = new kotlin.jvm.internal.AwS61S0001000_19
            r0 = 15
            r6.<init>(r3, r0)
            r4.LJJIJIIJI(r6)
        L57:
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            r4.LJ()
            r7 = 1
            X.0tW1 r8 = X.EnumC1668310tW1.Normal
            r9 = 0
            r10 = 0
            r5 = r17
            java.lang.Object r0 = r5.l0
            X.19EG r0 = (X.C19EG) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131820588(0x7f11002c, float:1.9273895E38)
            java.lang.String r12 = r1.getString(r0)
            kotlin.jvm.internal.AwS297S0300000_19 r3 = new kotlin.jvm.internal.AwS297S0300000_19
            java.lang.Object r2 = r5.l0
            X.19EG r2 = (X.C19EG) r2
            java.lang.Object r1 = r5.l1
            com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem r1 = (com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcProgressAssem) r1
            r0 = 6
            r3.<init>(r2, r1, r6, r0)
            r0 = 1151721387(0x44a5dfab, float:1326.9896)
            X.12De r15 = X.C13Z4.LIZJ(r0, r3, r4)
            r18 = 805309872(0x30000db0, float:4.658558E-10)
            r20 = 1456(0x5b0, float:2.04E-42)
            r11 = r10
            r13 = r10
            r14 = r10
            r16 = r10
            r19 = r9
            r17 = r4
            X.C1668330tW3.LJI(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L30
        L99:
            r0 = 0
            goto L3e
        L9b:
            r0 = 2
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS484S0200000_19.invoke$7(kotlin.jvm.internal.AwS484S0200000_19, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(AwS484S0200000_19 awS484S0200000_19, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((Boolean) obj3).booleanValue();
        if (iIntValue < 0 && Intrinsics.LJFF(((FindSchoolFriendsPageContainerAssem) awS484S0200000_19.l0).LLLLLJLJLL, Boolean.FALSE)) {
            C16GX c16gx = (C16GX) awS484S0200000_19.l1;
            if (c16gx != null) {
                c16gx.LJ(true, true, true);
            }
            ((FindSchoolFriendsPageContainerAssem) awS484S0200000_19.l0).LLLLLJLJLL = Boolean.TRUE;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS484S0200000_19 awS484S0200000_19, Object obj, Object obj2, Object obj3) {
        ITabBusinessListener next;
        int iIntValue = ((Number) obj).intValue();
        String str = (String) obj2;
        List<ITabBusinessListener> listPq = ((AwemePagerAssem) awS484S0200000_19.l0).pq();
        if (listPq == null) {
            return null;
        }
        C259800zU c259800zU = (C259800zU) awS484S0200000_19.l1;
        Iterator<ITabBusinessListener> it2 = listPq.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getName(), c259800zU.element)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ITabBusinessListener iTabBusinessListener = next;
        if (iTabBusinessListener == null) {
            return null;
        }
        return iTabBusinessListener.uP(iIntValue, str);
    }
}
