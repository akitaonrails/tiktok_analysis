package kotlin.jvm.internal;

import X.AnonymousClass0317;
import X.AnonymousClass1433;
import X.C034S;
import X.C05P0;
import X.C05P1;
import X.C09AY;
import X.C1120604Zw;
import X.C1397620mTQ;
import X.C168Q;
import X.C18LI;
import X.C18UJ;
import X.C18UP;
import X.C19FF;
import X.C19FV;
import X.C1AQS;
import X.C21163117rp;
import X.C21272018Mk;
import X.C21505619Eg;
import X.C957403oi;
import X.InterfaceC1680560tpm;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.ecommerce.dependency.comment.CommentDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.comment.ICommentDependencyService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes33.dex */
public class AwS32S1400000_32 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS32S1400000_32 awS32S1400000_32, Object obj) {
        C21163117rp.LIZIZ = (C18UJ) awS32S1400000_32.l1;
        C21163117rp.LIZIZ().LJIILIIL(awS32S1400000_32.s0);
        C18UP c18up = C18UP.LIZ;
        C18UJ c18uj = (C18UJ) awS32S1400000_32.l1;
        AIChatGenNode aIChatGenNode = (AIChatGenNode) awS32S1400000_32.l2;
        c18up.getClass();
        C18UP.LJIILIIL(aIChatGenNode, c18uj, "leave");
        Function0 function0 = (Function0) awS32S1400000_32.l3;
        if (function0 != null) {
            Function0 function02 = (Function0) awS32S1400000_32.l4;
            if (((Boolean) function0.invoke()).booleanValue()) {
                function02.invoke();
            }
        } else {
            ((Function0) awS32S1400000_32.l4).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS32S1400000_32 awS32S1400000_32, Object obj) {
        AnonymousClass0317 anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin;
        C957403oi c957403oi = (C957403oi) obj;
        c957403oi.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        c957403oi.LIZLLL("page_name", "video");
        c957403oi.LIZLLL("is_single_anchor", "yes");
        c957403oi.LIZLLL("entrance_form", "video_single_anchor");
        c957403oi.LIZLLL("anchor_show_type", "video_cart_tag");
        c957403oi.LJ((Map) awS32S1400000_32.l1);
        C18LI c18li = C18LI.LIZ;
        Aweme aweme = (Aweme) awS32S1400000_32.l2;
        c18li.getClass();
        c957403oi.LJ(C18LI.LIZJ(aweme));
        String name = null;
        c957403oi.LJ(C21272018Mk.LJJIFFI(C21272018Mk.LIZ, (Aweme) awS32S1400000_32.l2, null, 2));
        AnchorProductInfoModel anchorProductInfoModel = (AnchorProductInfoModel) awS32S1400000_32.l3;
        if (anchorProductInfoModel != null) {
            c957403oi.LJ(C21272018Mk.LJIJI(anchorProductInfoModel, null));
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = CommentDependencyService.createICommentDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ICommentDependencyService.class.getName();
            if (anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ICommentDependencyService.class);
        }
        Map<String, String> contentRecReasonParams = ((ICommentDependencyService) anonymousClass0317CreateICommentDependencyServicebyMonsterPlugin).getContentRecReasonParams((Aweme) awS32S1400000_32.l2, awS32S1400000_32.s0);
        if (contentRecReasonParams != null) {
            c957403oi.LJ(contentRecReasonParams);
        }
        c957403oi.LJ(C21272018Mk.LJFF((List) awS32S1400000_32.l4));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS32S1400000_32 awS32S1400000_32, Object obj) {
        C19FV c19fv = (C19FV) awS32S1400000_32.l1;
        C19FF c19ff = (C19FF) awS32S1400000_32.l2;
        String str = awS32S1400000_32.s0;
        AnonymousClass1433 anonymousClass1433 = (AnonymousClass1433) awS32S1400000_32.l3;
        final C05P1 c05p1 = (C05P1) awS32S1400000_32.l4;
        c19fv.LIZ = c19ff.LIZLLL(str, anonymousClass1433, new C168Q() { // from class: X.14ce
            @Override // X.C168Q
            public final void LIZ(Object obj2) {
                ((Function1) c05p1.getValue()).invoke(obj2);
            }
        });
        final C19FV c19fv2 = (C19FV) awS32S1400000_32.l1;
        return new InterfaceC1680560tpm() { // from class: X.19FU
            @Override // X.InterfaceC1680560tpm
            public final void dispose() {
                C19FH c19fh = c19fv2.LIZ;
                if (c19fh != null) {
                    c19fh.LIZIZ();
                    if (Unit.LIZ != null) {
                        return;
                    }
                }
                "Launcher has not been initialized".toString();
                throw new IllegalStateException("Launcher has not been initialized");
            }
        };
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1400000_32(C19FV c19fv, C19FF c19ff, String str, C21505619Eg c21505619Eg, C05P0 c05p0, int i) {
        super(1);
        this.$t = i;
        this.l1 = c19fv;
        this.l2 = c19ff;
        this.s0 = str;
        this.l3 = c21505619Eg;
        this.l4 = c05p0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS32S1400000_32(AnchorProductInfoModel anchorProductInfoModel, Aweme aweme, String str, List list, Map map, int i) {
        super(1);
        this.$t = i;
        this.l1 = map;
        this.l2 = aweme;
        this.l3 = anchorProductInfoModel;
        this.s0 = str;
        this.l4 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS32S1400000_32(C18UJ c18uj, C18UJ c18uj2, String str, AIChatGenNode aIChatGenNode, Function0<Boolean> function0, C1397620mTQ c1397620mTQ, Function0<Unit> function02) {
        super(1);
        this.$t = function02;
        this.l1 = c18uj;
        this.s0 = c18uj2;
        this.l2 = str;
        this.l3 = aIChatGenNode;
        this.l4 = c1397620mTQ;
    }
}
