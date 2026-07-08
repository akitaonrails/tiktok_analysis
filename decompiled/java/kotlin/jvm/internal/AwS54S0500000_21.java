package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C1362270lYP;
import X.C1365870leD;
import X.C1394160mNq;
import X.C1394400mOE;
import X.C13LP;
import X.C1440005kM;
import X.C19EG;
import X.InterfaceC1052240dUM;
import X.InterfaceC1362600lYw;
import X.InterfaceC1381130m2p;
import X.InterfaceC1381790m3t;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.comment.api.ICommentTopBarImplementService;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentTopBarComponent;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.refactor.assem.SharePanelSendButtonAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.feedback.core.viewmodel.SearchFeedbackManager$Companion$openReportSparkContainer$1$2;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AwS54S0500000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        ((ICommentTopBarImplementService) obj).onGlobalComponentClick((C19EG) awS54S0500000_21.l0, (Fragment) awS54S0500000_21.l1, (CommentTopBarComponent) awS54S0500000_21.l2, (Aweme) awS54S0500000_21.l3, (CommentContextSource) awS54S0500000_21.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        ((ICommentTopBarImplementService) obj).onGlobalComponentShow((C19EG) awS54S0500000_21.l0, (Fragment) awS54S0500000_21.l1, (CommentTopBarComponent) awS54S0500000_21.l2, (Aweme) awS54S0500000_21.l3, (CommentContextSource) awS54S0500000_21.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        ((ICommentTopBarImplementService) obj).onGlobalComponentHide((C19EG) awS54S0500000_21.l0, (Fragment) awS54S0500000_21.l1, (CommentTopBarComponent) awS54S0500000_21.l2, (Aweme) awS54S0500000_21.l3, (CommentContextSource) awS54S0500000_21.l4);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ITemplateAnchorStrategyService iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) awS54S0500000_21.l0;
            Activity activity = (Activity) awS54S0500000_21.l1;
            TemplateAnchorConfig templateAnchorConfig = (TemplateAnchorConfig) awS54S0500000_21.l2;
            Aweme aweme = (Aweme) awS54S0500000_21.l3;
            MDPRecommendTemplateInfo mDPRecommendTemplateInfo = (MDPRecommendTemplateInfo) awS54S0500000_21.l4;
            iTemplateAnchorStrategyService.LIZ(activity, templateAnchorConfig, false);
            C1394400mOE c1394400mOE = C1394400mOE.LIZ;
            String creationId = templateAnchorConfig.getCreativeInfo().getCreationId();
            c1394400mOE.getClass();
            C1394400mOE.LIZIZ(aweme, creationId, mDPRecommendTemplateInfo);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C013C c013c = (C013C) awS54S0500000_21.l0;
            if (!c013c.element) {
                boolean z = true;
                c013c.element = true;
                SharePanelSendButtonAssem sharePanelSendButtonAssem = (SharePanelSendButtonAssem) awS54S0500000_21.l1;
                SharePackage sharePackage = (SharePackage) awS54S0500000_21.l2;
                List list = (List) awS54S0500000_21.l3;
                sharePanelSendButtonAssem.getClass();
                String string = sharePackage.extras.getString("enter_from");
                String str = null;
                if (string == null || string.length() <= 0) {
                    C1362270lYP c1362270lYPJo = sharePanelSendButtonAssem.Jo();
                    if (c1362270lYPJo != null) {
                        str = c1362270lYPJo.LLILLJJLI;
                    }
                    string = str;
                }
                IMContact iMContact = (IMContact) C13LP.LJJJLL(list);
                int size = list.size();
                if (list.size() <= 1) {
                    z = false;
                }
                C1440005kM.LIZ(new C1365870leD(list, iMContact, size, z, sharePackage.itemType, string, null, null, sharePackage.extras.getString("tako_message_id"), false, false, false));
                InterfaceC1362600lYw interfaceC1362600lYw = (InterfaceC1362600lYw) awS54S0500000_21.l4;
                if (interfaceC1362600lYw != null) {
                    interfaceC1362600lYw.LJIILIIL();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS54S0500000_21 awS54S0500000_21, Object obj) {
        InterfaceC1381130m2p interfaceC1381130m2p = (InterfaceC1381130m2p) obj;
        interfaceC1381130m2p.LJIIJJI(((InterfaceC1381130m2p) awS54S0500000_21.l0).getReportType());
        interfaceC1381130m2p.LJIIJ(((InterfaceC1381130m2p) awS54S0500000_21.l0).getObjectID());
        interfaceC1381130m2p.LJIIIIZZ(((InterfaceC1381130m2p) awS54S0500000_21.l0).LJ());
        interfaceC1381130m2p.setExtra(((InterfaceC1381130m2p) awS54S0500000_21.l0).getExtra());
        interfaceC1381130m2p.LJIIL(((InterfaceC1381130m2p) awS54S0500000_21.l0).getCommonParams());
        final InterfaceC1381130m2p interfaceC1381130m2p2 = (InterfaceC1381130m2p) awS54S0500000_21.l0;
        final C013C c013c = (C013C) awS54S0500000_21.l1;
        interfaceC1381130m2p.LJI(new InterfaceC1381790m3t() { // from class: X.0m1T
            @Override // X.InterfaceC1381790m3t
            public final void LIZ(String str, Map<String, ? extends Object> map) {
                boolean zLJFF;
                boolean z = C0Q9J.LIZ;
                if (Intrinsics.LJFF(interfaceC1381130m2p2.getReportType(), "sug_l8_result")) {
                    zLJFF = Intrinsics.LJFF(str, "chatReportSubmit");
                } else {
                    zLJFF = Intrinsics.LJFF(str, "videoReportSuccess");
                }
                if (zLJFF) {
                    c013c.element = true;
                }
            }
        });
        interfaceC1381130m2p.LIZJ(new SearchFeedbackManager$Companion$openReportSparkContainer$1$2((Fragment) awS54S0500000_21.l2, (View) awS54S0500000_21.l3, (C013C) awS54S0500000_21.l1, (Function0) awS54S0500000_21.l4));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AwS54S0500000_21 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS54S0500000_21.invoke$6(kotlin.jvm.internal.AwS54S0500000_21, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S0500000_21(C013C c013c, C013C c013c2, SharePanelSendButtonAssem sharePanelSendButtonAssem, SharePackage sharePackage, List<IMContact> list, InterfaceC1362600lYw interfaceC1362600lYw) {
        super(1);
        this.$t = interfaceC1362600lYw;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = sharePanelSendButtonAssem;
        this.l3 = sharePackage;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS54S0500000_21(InterfaceC1381130m2p interfaceC1381130m2p, InterfaceC1381130m2p interfaceC1381130m2p2, C013C c013c, Fragment fragment, View view, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = interfaceC1381130m2p;
        this.l1 = interfaceC1381130m2p2;
        this.l2 = c013c;
        this.l3 = fragment;
        this.l4 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0500000_21(C1394160mNq c1394160mNq, Aweme aweme, AnchorCommonStruct anchorCommonStruct, Context context, InterfaceC1052240dUM interfaceC1052240dUM, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1394160mNq;
        this.l1 = aweme;
        this.l2 = anchorCommonStruct;
        this.l3 = context;
        this.l4 = interfaceC1052240dUM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0500000_21(C19EG c19eg, Fragment fragment, CommentTopBarComponent commentTopBarComponent, Aweme aweme, CommentContextSource commentContextSource, int i) {
        super(1);
        this.$t = i;
        this.l0 = c19eg;
        this.l1 = fragment;
        this.l2 = commentTopBarComponent;
        this.l3 = aweme;
        this.l4 = commentContextSource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0500000_21(Activity activity, ITemplateAnchorStrategyService iTemplateAnchorStrategyService, MDPRecommendTemplateInfo mDPRecommendTemplateInfo, Aweme aweme, TemplateAnchorConfig templateAnchorConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = iTemplateAnchorStrategyService;
        this.l1 = activity;
        this.l2 = templateAnchorConfig;
        this.l3 = aweme;
        this.l4 = mDPRecommendTemplateInfo;
    }
}
