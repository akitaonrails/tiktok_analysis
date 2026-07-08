package com.ss.android.ugc.aweme.feed.assem.desc;

import X.C018E;
import X.C01GW;
import X.C07HF;
import X.C093Y;
import X.C0BKA;
import X.C0J5O;
import X.C0M73;
import X.C0NC0;
import X.C0RR7;
import X.C0S4N;
import X.C0S5P;
import X.C0S5R;
import X.C0S64;
import X.C0SI6;
import X.C0SJ4;
import X.C0SJA;
import X.C0SK2;
import X.C0SKA;
import X.C0SKF;
import X.C0SXF;
import X.C123100dR;
import X.C128Y;
import X.C1381730m3n;
import X.C13LE;
import X.C14LC;
import X.C1599640rjG;
import X.C1DDC;
import X.C1ER1;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2344009Gk;
import X.C294240Bg6;
import X.C452501pT;
import X.C582980Mtk;
import X.C715890S6h;
import X.C717590SCv;
import X.C718770SHj;
import X.C718800SHm;
import X.C718950SIb;
import X.C718970SId;
import X.C719100SIq;
import X.C720710SOv;
import X.C729510SjV;
import X.C735370Ssx;
import X.EnumC704080Rja;
import X.InterfaceC0148002o;
import X.InterfaceC1008930cMV;
import X.InterfaceC1602300rnY;
import X.InterfaceC20658015sY;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.text.Layout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.airemix.api.service.IAIRemixEntranceMobService;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.AIRemixInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public final class VideoDescVM extends FeedBaseViewModel<C715890S6h> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLIL;
    public final C717590SCv LL = new C717590SCv(AFwS198S0000000_11.get$arr$(83));
    public final boolean LLILLJJLI;
    public int LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public String LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public HashMap<String, String> LLJJJJ;
    public boolean LLJJJJJIL;
    public C0S5P LLJJJJLIIL;
    public C0S64 LLJJL;
    public C718770SHj LLJJLIIIJLLLLLLLZ;
    public C718970SId LLJL;
    public C718970SId LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(VideoDescVM.class, "context", "getContext()Landroid/content/Context;", 0);
        C13LE.LIZ.getClass();
        LLJLLIL = new InterfaceC2217461Bqa[]{c2217371BqR};
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C715890S6h(0);
    }

    public final Context getContext() {
        C717590SCv c717590SCv = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLIL;
        return (Context) c717590SCv.LIZ();
    }

    public VideoDescVM() {
        this.LLILLJJLI = C14LC.LJIIIZ || LowScreenOptimizeAB.LIZ();
        this.LLILLL = C1DDC.LLILZLL.LJFF;
        this.LLJ = "click_hide";
        this.LLJI = C719100SIq.LIZ();
        this.LLJILLL = "";
        this.LLJJ = "";
        this.LLJJI = C452501pT.LIZIZ(new C0SKA());
        this.LLJJIII = C452501pT.LIZIZ(new C720710SOv());
        this.LLJJIJIL = C452501pT.LIZIZ(new C0SJ4());
        C718970SId c718970SId = C718950SIb.LIZ;
        this.LLJL = c718970SId;
        this.LLJLIL = c718970SId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String CQ2() {
        C0S5R c0s5r;
        C0S64 c0s64 = ((C715890S6h) getState()).LLJ;
        return (c0s64 == null || (c0s5r = c0s64.LIZ) == null || !c0s5r.LIZJ) ? this.LLJLILLLLZIIL : this.LLJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String DQ2() {
        C0S5R c0s5r;
        C0S64 c0s64 = ((C715890S6h) getState()).LLJ;
        return (c0s64 == null || (c0s5r = c0s64.LIZ) == null || !c0s5r.LIZJ) ? this.LLJL.LIZIZ.getEtUITypeV1() : this.LLJLIL.LIZIZ.getEtUITypeV1();
    }

    public final boolean FQ2() {
        Aweme aweme;
        String contentDesc;
        VideoItemParams item = getItem();
        return !(item == null || (aweme = item.getAweme()) == null || (contentDesc = aweme.getContentDesc()) == null || contentDesc.length() == 0);
    }

    public final boolean GQ2() {
        VideoItemParams item;
        Aweme aweme;
        return (!C07HF.LIZ() || (item = getItem()) == null || (aweme = item.getAweme()) == null || ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme) || AwemeExtKt.isPhotoMode(aweme) || C0NC0.LIZ(aweme) || C729510SjV.LJJ(aweme)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean IQ2() {
        /*
            r8 = this;
            java.lang.Object r6 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r6 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r6
            r7 = 0
            if (r6 != 0) goto La
            return r7
        La:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo r0 = r0.getPhotoModeImageInfo()
            if (r0 == 0) goto L20
            java.lang.String r0 = r0.getTitle()
            if (r0 == 0) goto L20
            int r0 = r0.length()
            if (r0 != 0) goto L6f
        L20:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            java.lang.String r0 = r0.getDesc()
            if (r0 == 0) goto L30
            int r0 = r0.length()
            if (r0 != 0) goto L6f
        L30:
            r5 = 1
        L31:
            X.01GW r0 = r8.LLJJI
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.mix.services.IMixFeedService r1 = (com.ss.android.ugc.aweme.mix.services.IMixFeedService) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = r1.LIZ(r0)
            if (r0 == 0) goto L6d
            X.0S4N r4 = X.C0S4N.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.getAweme()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r6.baseFeedPageParams
            X.0rjG r1 = X.C1599640rjG.LIZIZ
            androidx.fragment.app.Fragment r0 = r6.fragment
            boolean r0 = r1.Pu(r0)
            r4.getClass()
            boolean r0 = X.C0S4N.LIZ(r3, r2, r0)
            if (r0 == 0) goto L6d
            r0 = 1
        L5d:
            if (r5 == 0) goto L61
            if (r0 == 0) goto L6c
        L61:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.getAweme()
            boolean r0 = X.C0OAD.LIZIZ(r0)
            if (r0 != 0) goto L6c
            r7 = 1
        L6c:
            return r7
        L6d:
            r0 = 0
            goto L5d
        L6f:
            r5 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.IQ2():boolean");
    }

    public final void JQ2() {
        Aweme aweme;
        IFeedService iFeedServiceLIZIZ;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || !AwemeExtKt.isAdTraffic(aweme)) {
            return;
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null) {
            return;
        }
        Context context = getContext();
        VideoItemParams item2 = getItem();
        String str = item2 != null ? item2.mEventType : null;
        VideoItemParams item3 = getItem();
        InterfaceC1008930cMV interfaceC1008930cMVLIZJ = iFeedServiceLIZIZ.LIZJ(context, item3 != null ? item3.getAweme() : null, str, true);
        if (interfaceC1008930cMVLIZJ != null) {
            interfaceC1008930cMVLIZJ.LJIJJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (android.text.TextUtils.isEmpty(r0 != null ? r0.getWebUrl() : null) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LQ2() {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.LQ2():void");
    }

    public final void MQ2() {
        Aweme aweme;
        String str;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null || !HQ2(aweme)) {
            return;
        }
        VideoItemParams item2 = getItem();
        if (item2 == null || (str = item2.mEventType) == null) {
            str = "";
        }
        IAIRemixEntranceMobService.LIZ.getClass();
        C0M73.LIZ().LJII(aweme, str);
    }

    public final void RQ2() {
        Aweme aweme;
        String str;
        VideoItemParams item = getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return;
        }
        IAIRemixEntranceMobService.LIZ.getClass();
        IAIRemixEntranceMobService iAIRemixEntranceMobServiceLIZ = C0M73.LIZ();
        if (iAIRemixEntranceMobServiceLIZ.LIZLLL(aweme)) {
            VideoItemParams item2 = getItem();
            C128Y c128y = item2 != null ? item2.fragment : null;
            if (!(c128y instanceof InterfaceC20658015sY) || ((InterfaceC20658015sY) c128y).Xu()) {
                VideoItemParams item3 = getItem();
                if (item3 == null || (str = item3.mEventType) == null) {
                    str = "";
                }
                iAIRemixEntranceMobServiceLIZ.LJIIJ(aweme, str);
            }
        }
    }

    public final boolean xQ2() {
        if (!C294240Bg6.LIZ()) {
            return false;
        }
        VideoItemParams item = getItem();
        return C0SKF.LIZ(item != null ? item.getAweme() : null);
    }

    public static boolean HQ2(Aweme aweme) {
        boolean z;
        AIRemixInfo aIRemixInfo;
        String taskId;
        if (aweme != null && (aIRemixInfo = aweme.aiRemixInfo) != null && (taskId = aIRemixInfo.getTaskId()) != null && !a0.LJJJIL(taskId)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    public final Map<String, String> BQ2(VideoItemParams videoItemParams) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("group_id", videoItemParams.getAweme().getAid()), new Pair("enter_from", videoItemParams.mEventType), new Pair("is_feed_liked", String.valueOf(videoItemParams.getAweme().isLike())), new Pair("is_feed_collected", String.valueOf(AwemeExtKt.isCollected(videoItemParams.getAweme()))), new Pair("is_feed_comment_clicked", String.valueOf(AwemeBizExtKt.isCommentClicked(videoItemParams.getAweme()))), new Pair("is_feed_forward_clicked", String.valueOf(AwemeBizExtKt.isForwardClicked(videoItemParams.getAweme()))));
        if (C1ER1.LIZIZ.LJJJLL(this.eventType)) {
            mapLJIIJ.put("is_from_video_fix", "1");
        }
        return mapLJIIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void NQ2(X.C19EG r9) {
        /*
            r8 = this;
            java.lang.Object r7 = r8.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r7 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r7
            if (r7 != 0) goto L9
            return
        L9:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.getAweme()
            X.0S64 r0 = r8.LLJJL
            r5 = 0
            if (r0 == 0) goto L51
            X.0S5R r0 = r0.LIZ
            if (r0 == 0) goto L51
            boolean r0 = r0.LIZJ
            r4 = 1
            if (r0 != r4) goto L51
        L1b:
            com.ss.android.ugc.aweme.cla.et.newet.CaptionsAndTranslationEntranceShowEvent r3 = new com.ss.android.ugc.aweme.cla.et.newet.CaptionsAndTranslationEntranceShowEvent
            r3.<init>()
            X.161N r2 = X.C161N.LIZIZ
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r9)
            java.lang.String r0 = r7.mEventType
            X.00I7 r1 = r2.LJJIJIIJIL(r1, r6, r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.LIZ()
            r0.add(r1)
            java.lang.String r1 = "is_edit_available"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r3.LJI(r0, r1)
            java.lang.String r1 = "is_title_translated"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.LJI(r0, r1)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "desc_entry"
            r3.LJI(r0, r1)
            r3.LJIIIIZZ()
            return
        L51:
            r4 = 0
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.NQ2(X.19EG):void");
    }

    public final boolean wQ2(Boolean bool) {
        Context context;
        String str;
        Fragment fragment;
        VideoItemParams item = getItem();
        Aweme aweme = null;
        if (item != null && (fragment = item.fragment) != null) {
            context = fragment.getContext();
        } else {
            context = null;
        }
        VideoItemParams item2 = getItem();
        if (item2 != null) {
            str = item2.mEventType;
        } else {
            str = null;
        }
        VideoItemParams item3 = getItem();
        if (item3 != null) {
            aweme = item3.getAweme();
        }
        if (!C0RR7.LIZIZ(context, aweme, str) && !LowScreenOptimizeAB.LIZJ().openAB) {
            return true;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return IQ2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean yQ2(Aweme aweme) {
        boolean z;
        C0S5R c0s5r;
        C0S64 c0s64 = ((C715890S6h) getState()).LLJ;
        if (c0s64 != null && (c0s5r = c0s64.LIZ) != null && c0s5r.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || !((Boolean) C0BKA.LIZIZ.getValue()).booleanValue()) {
            return false;
        }
        if (!z) {
            if (this.LLJL.LIZ == EnumC704080Rja.NEGATIVE) {
                return true;
            }
            return false;
        }
        if (this.LLJLIL.LIZ == EnumC704080Rja.NEGATIVE) {
            return true;
        }
        return false;
    }

    public final boolean EQ2(TextExtraStruct textExtraStruct, String str) {
        int length;
        int length2;
        int length3;
        CharSequence foldedHashTagDesc;
        PhotoModeImageInfo photoModeImageInfo;
        String title;
        VideoItemParams item = getItem();
        if (item == null) {
            return false;
        }
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        Aweme aweme = item.getAweme();
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && (title = photoModeImageInfo.getTitle()) != null) {
            length2 = title.length();
        } else {
            length2 = 0;
        }
        int iMax = Math.max(0, length + length2);
        if (item.getAweme() != null && ((IMixFeedService) this.LLJJI.getValue()).LIZ(item.getAweme())) {
            C0S4N c0s4n = C0S4N.LIZ;
            Aweme aweme2 = item.getAweme();
            BaseFeedPageParams baseFeedPageParams = item.baseFeedPageParams;
            boolean zPu = C1599640rjG.LIZIZ.Pu(item.fragment);
            c0s4n.getClass();
            if (C0S4N.LIZ(aweme2, baseFeedPageParams, zPu)) {
                Aweme aweme3 = item.getAweme();
                if (aweme3 != null && (foldedHashTagDesc = AwemeExtKt.getFoldedHashTagDesc(aweme3)) != null) {
                    length3 = foldedHashTagDesc.length();
                } else {
                    length3 = 0;
                }
                iMax = Math.max(iMax, length3);
            }
        }
        if (str == null || textExtraStruct.getStart() < 0 || textExtraStruct.getEnd() < 0 || textExtraStruct.getEnd() > iMax || textExtraStruct.getStart() >= iMax || textExtraStruct.getStart() >= textExtraStruct.getEnd()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0298  */
    /* JADX WARN: Type inference failed for: r8v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void KQ2(com.ss.android.ugc.aweme.model.TextExtraStruct r34, java.util.Map<java.lang.String, java.lang.Object> r35) {
        /*
            Method dump skipped, instruction units count: 3465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.KQ2(com.ss.android.ugc.aweme.model.TextExtraStruct, java.util.Map):void");
    }

    public final void PQ2(boolean z, IPhotoModeAbility iPhotoModeAbility) {
        if (z) {
            C20684815ws.LJIILLIIL("video_title", zQ2("spread", iPhotoModeAbility, ""));
        } else {
            C20684815ws.LJIILLIIL("video_title", zQ2("fold", iPhotoModeAbility, this.LLJ));
            this.LLJ = "click_hide";
        }
    }

    public final void QQ2(final VideoItemParams videoItemParams, final TextExtraStruct textExtraStruct) {
        final Context context;
        ILiveOuterService iLiveOuterService;
        InterfaceC1602300rnY interfaceC1602300rnYG5;
        final C0J5O c0j5oZ5;
        final String userId = textExtraStruct.getUserId();
        if (userId == null || userId.length() == 0 || (context = getContext()) == null || (iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null)) == null || (interfaceC1602300rnYG5 = iLiveOuterService.g5()) == null || (c0j5oZ5 = iLiveOuterService.z5()) == null) {
            return;
        }
        interfaceC1602300rnYG5.LJ(C093Y.LJ(userId), new C018E() { // from class: X.0SRD
            @Override // X.C018E
            public final void onFail() {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
                smartRouteBuildRoute.withParam("uid", textExtraStruct.getUserId());
                smartRouteBuildRoute.withParam("sec_user_id", textExtraStruct.getSecUid());
                smartRouteBuildRoute.withParam("profile_from", "video_at");
                smartRouteBuildRoute.withParam("enter_from", videoItemParams.mEventType);
                smartRouteBuildRoute.withParam("video_id", videoItemParams.getAweme().getAid());
                smartRouteBuildRoute.open();
            }

            @Override // X.C018E
            public final void LIZ(Map<String, Long> map) {
                Long l = map.get(userId);
                if (l != null) {
                    long jLongValue = l.longValue();
                    if (jLongValue > 0) {
                        User user = new User();
                        String str = userId;
                        TextExtraStruct textExtraStruct2 = textExtraStruct;
                        user.setUid(str);
                        user.setSecUid(textExtraStruct2.getSecUid());
                        user.roomId = jLongValue;
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        VideoItemParams videoItemParams2 = videoItemParams;
                        String str2 = userId;
                        TextExtraStruct textExtraStruct3 = textExtraStruct;
                        enterRoomConfig.mLogData.videoId = videoItemParams2.getAweme().getAid();
                        enterRoomConfig.mRoomsData.enterFromMerge = videoItemParams2.mEventType;
                        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                        roomsData.enterMethod = "video_title_at_name";
                        roomsData.userId = str2;
                        roomsData.actionType = "click";
                        String secUid = textExtraStruct3.getSecUid();
                        if (secUid != null && secUid.length() != 0) {
                            enterRoomConfig.mRoomsData.secUid = textExtraStruct3.getSecUid();
                        }
                        c0j5oZ5.LJIIIIZZ(context, user, enterRoomConfig);
                        return;
                    }
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
                smartRouteBuildRoute.withParam("uid", textExtraStruct.getUserId());
                smartRouteBuildRoute.withParam("sec_user_id", textExtraStruct.getSecUid());
                smartRouteBuildRoute.withParam("profile_from", "video_at");
                smartRouteBuildRoute.withParam("enter_from", videoItemParams.mEventType);
                smartRouteBuildRoute.withParam("video_id", videoItemParams.getAweme().getAid());
                smartRouteBuildRoute.open();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC0148002o paramSync2StateAccept(X.InterfaceC0148002o r18, com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            r17 = this;
            r6 = r18
            X.0S6h r6 = (X.C715890S6h) r6
            r0 = 2
            r3 = r17
            r3.LLJI = r0
            r2 = 0
            r3.LLJIJIL = r2
            r3.LLILZ = r2
            r3.LLJJJIL = r2
            X.0SId r0 = X.C718950SIb.LIZ
            r3.LLJL = r0
            r3.LLJLIL = r0
            r0 = 0
            r3.LLJLILLLLZIIL = r0
            r3.LLJLL = r0
            r3.LLJJJJJIL = r2
            r4 = r19
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            r5 = 1
            if (r0 == 0) goto La1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            java.lang.String r0 = r0.partN
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto La1
            r0 = 1
        L33:
            boolean r1 = r3.IQ2()
            if (r1 != 0) goto L6f
            if (r0 != 0) goto L6f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r3.wQ2(r0)
            if (r0 == 0) goto L57
            boolean r0 = X.C1383320m6M.LIZIZ()
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.getAweme()
            if (r0 == 0) goto L57
            com.ss.android.ugc.aweme.feed.model.CaptionItemModel r0 = X.C20702515zj.LIZLLL(r0)
            if (r0 != 0) goto L6f
        L57:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r3.wQ2(r0)
            if (r0 == 0) goto L70
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.getAweme()
            com.ss.android.ugc.aweme.translation.service.ITranslationService r0 = X.C0SCU.LIZ()
            boolean r0 = r0.LLIIII(r1, r5)
            if (r0 == 0) goto L70
        L6f:
            r2 = 1
        L70:
            X.0rjG r1 = X.C1599640rjG.LIZIZ
            androidx.fragment.app.Fragment r0 = r4.fragment
            boolean r0 = r1.Pu(r0)
            if (r0 == 0) goto L80
            boolean r0 = r1.av(r4)
            r3.LLJILJIL = r0
        L80:
            X.01Au r7 = new X.01Au
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            r7.<init>(r0)
            X.01Au r8 = new X.01Au
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r8.<init>(r0)
            r9 = 0
            r16 = 1938(0x792, float:2.716E-42)
            r10 = r9
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            X.0S6h r0 = X.C715890S6h.LIZ(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        La1:
            r0 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM.paramSync2StateAccept(X.002o, com.ss.android.ugc.aweme.feed.model.VideoItemParams):X.002o");
    }

    public static Map AQ2(Map map, VideoItemParams videoItemParams, String str) {
        return C2097608Jq.LJIIJ(new Pair("search_keyword", map.get("search_keyword")), new Pair("search_id", map.get("search_id")), new Pair("search_result_id", map.get("search_result_id")), new Pair("rank", map.get("rank")), new Pair("request_id", C735370Ssx.LJIJ(videoItemParams.mPageType, videoItemParams.getAweme())), new Pair("group_id", videoItemParams.getAweme().getAid()), new Pair("impr_id", str));
    }

    public final Map<String, String> zQ2(String str, IPhotoModeAbility iPhotoModeAbility, String str2) {
        String str3;
        String aid;
        Aweme aweme;
        Integer numValueOf;
        Aweme aweme2;
        String str4;
        int length;
        C0S5R c0s5r;
        Aweme aweme3;
        String desc;
        String str5;
        Aweme aweme4;
        int iFj1;
        Aweme aweme5;
        Aweme aweme6;
        String authorUid;
        Aweme aweme7;
        C2344009Gk c2344009Gk = new C2344009Gk();
        VideoItemParams item = getItem();
        String str6 = "";
        if (item == null || (str3 = item.mEventType) == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        VideoItemParams item2 = getItem();
        if (item2 == null || (aweme7 = item2.getAweme()) == null || (aid = aweme7.getAid()) == null) {
            aid = "";
        }
        c2344009Gk.LJIIIIZZ("group_id", aid);
        VideoItemParams item3 = getItem();
        if (item3 != null && (aweme6 = item3.getAweme()) != null && (authorUid = AwemeExtKt.getAuthorUid(aweme6)) != null) {
            str6 = authorUid;
        }
        c2344009Gk.LJIIIIZZ("author_id", str6);
        c2344009Gk.LJIIIIZZ("action_type", str);
        c2344009Gk.LJIIIIZZ("enter_method", str2);
        c2344009Gk.LJIIIIZZ("ui_type", CQ2());
        c2344009Gk.LIZJ(this.LLJIJIL, "remain_word_count_without_hashtag");
        Context context = getContext();
        VideoItemParams item4 = getItem();
        if (item4 != null) {
            aweme = item4.getAweme();
        } else {
            aweme = null;
        }
        c2344009Gk.LIZJ(C0SXF.LJJIII(context, aweme), "is_landscape_screen");
        VideoItemParams item5 = getItem();
        if (item5 != null && (aweme5 = item5.getAweme()) != null) {
            numValueOf = Integer.valueOf(aweme5.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "aweme_type");
        IECommerceAnchorService iECommerceAnchorService = (IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class);
        VideoItemParams item6 = getItem();
        if (item6 != null) {
            aweme2 = item6.getAweme();
        } else {
            aweme2 = null;
        }
        if (iECommerceAnchorService.LJLL(aweme2)) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_ecom", str4);
        c2344009Gk.LJII(C1ER1.LIZIZ.LLZ());
        c2344009Gk.LJFF("ui_type_v1", DQ2());
        VideoItemParams item7 = getItem();
        int i = 1;
        if (item7 != null && (aweme4 = item7.getAweme()) != null && C582980Mtk.LIZIZ(aweme4)) {
            if (iPhotoModeAbility != null) {
                iFj1 = iPhotoModeAbility.fj1();
            } else {
                iFj1 = -1;
            }
            vQ2(this, c2344009Gk, iFj1, null, 4);
        }
        if (C0SK2.LIZIZ()) {
            if (((Boolean) C0SK2.LJ.getValue()).booleanValue()) {
                str5 = "conservative";
            } else {
                str5 = "aggressive";
            }
            c2344009Gk.LJFF("fold_strategy", str5);
        }
        VideoItemParams item8 = getItem();
        if (item8 != null && (aweme3 = item8.getAweme()) != null && (desc = aweme3.getDesc()) != null) {
            length = desc.length();
        } else {
            length = 0;
        }
        int length2 = this.LLJILLL.length();
        int i2 = this.LLJILJILJ;
        C0S64 c0s64 = this.LLJJL;
        if (c0s64 == null || (c0s5r = c0s64.LIZ) == null || !c0s5r.LIZJ) {
            i = 0;
        }
        c2344009Gk.LIZJ(length2, "title_without_hashtag_length");
        c2344009Gk.LIZJ(length, "title_length");
        c2344009Gk.LIZJ(i2, "spread_line_cnt");
        c2344009Gk.LIZJ(i, "is_title_translated");
        return c2344009Gk.LIZ;
    }

    public final void OQ2(Layout layout, Layout layout2, C718800SHm c718800SHm, boolean z) {
        CharSequence text = layout.getText();
        if (text != null && text.length() != 0) {
            String strLIZ = null;
            if (layout2 != null || C0SI6.LIZ(layout) || c718800SHm.LJIJ) {
                if (c718800SHm.LJIIJ != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    C0SJA c0sja = c718800SHm.LJII;
                    if (c0sja != null) {
                        strLIZ = c0sja.LIZ();
                    }
                    sbLIZ.append(strLIZ);
                    sbLIZ.append("_v");
                    strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    C0SJA c0sja2 = c718800SHm.LJII;
                    if (c0sja2 != null) {
                        strLIZ = c0sja2.LIZ();
                    }
                }
            }
            if (z) {
                this.LLJLL = strLIZ;
            } else {
                this.LLJLILLLLZIIL = strLIZ;
            }
        }
    }

    public static void vQ2(VideoDescVM videoDescVM, C2344009Gk c2344009Gk, int i, Aweme aweme, int i2) {
        int size;
        String strLIZ;
        PhotoModeImageInfo photoModeImageInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        if ((i2 & 2) != 0) {
            i = -1;
        }
        String strLIZ2 = null;
        if ((i2 & 4) != 0) {
            VideoItemParams item = videoDescVM.getItem();
            if (item != null) {
                aweme = item.getAweme();
            } else {
                aweme = null;
            }
        }
        videoDescVM.getClass();
        int i3 = 0;
        if (aweme != null && (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        c2344009Gk.LIZJ(size, "pic_cnt");
        c2344009Gk.LIZJ(i + 1, "pic_location");
        if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null && photoModeImageInfo.hasTitle()) {
            i3 = 1;
        }
        c2344009Gk.LIZJ(i3, "has_title");
        if (aweme != null) {
            strLIZ = C1381730m3n.LIZ(aweme);
        } else {
            strLIZ = null;
        }
        if (C123100dR.LIZ(strLIZ)) {
            if (aweme != null) {
                strLIZ2 = C1381730m3n.LIZ(aweme);
            }
            c2344009Gk.LJFF("photo_content_type", strLIZ2);
        }
    }
}
