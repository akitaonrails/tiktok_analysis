package kotlin.jvm.internal;

import X.C05N5;
import X.C06M6;
import X.C09AY;
import X.C0PEM;
import X.C0Y8T;
import X.C11NZ;
import X.C1378605aS;
import X.C1383370m6R;
import X.C1409205fO;
import X.C1584506Ih;
import X.C1587706Jn;
import X.C1606906Qx;
import X.C1710306mr;
import X.C20066813fO;
import X.C21411818qq;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C419890GdH;
import X.C419910GdJ;
import X.C625480Og6;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1660706er;
import X.InterfaceC1445905lJ;
import X.InterfaceC1452505mN;
import X.InterfaceC1452605mO;
import X.InterfaceC1631620sYq;
import X.InterfaceC497601wk;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.chatdetail.redesign.operation.manage.fragment.RequireApprovalAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.b2c.landing.BusinessLandingMsgAssem;
import com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem;
import com.ss.android.ugc.aweme.im.debug.api.IIMDebugService;
import com.ss.android.ugc.aweme.im.strategy.businessconfig.ChatFeatureListConf;
import com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager;
import com.ss.android.ugc.aweme.tako.botpage.components.image.TakoAIImageConvertStyleAssem;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsMyProfileVM;
import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsMyCollectionComponent;
import com.ss.android.ugc.profile.platform.business.header.business.storyhighlights.business.HeaderStoryHighlightsOtherCollectionComponent;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public class AwS651S0100000_2 extends C09AY implements InterfaceC1631620sYq {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(C1606906Qx c1606906Qx, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1606906Qx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS651S0100000_2(InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq<? super C0Y8T, ? super Function0<Unit>, ? super GroupPreviewDisplayMeta, Unit> interfaceC1631620sYq2) {
        super(3);
        this.$t = interfaceC1631620sYq2;
        this.l0 = interfaceC1631620sYq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(RequireApprovalAssem requireApprovalAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = requireApprovalAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(BusinessLandingMsgAssem businessLandingMsgAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = businessLandingMsgAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(BusinessLeadInfoAssem businessLeadInfoAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = businessLeadInfoAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(TakoAIImageConvertStyleAssem takoAIImageConvertStyleAssem, int i) {
        super(3);
        this.$t = i;
        this.l0 = takoAIImageConvertStyleAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(HeaderStoryHighlightsMyCollectionComponent headerStoryHighlightsMyCollectionComponent, int i) {
        super(3);
        this.$t = i;
        this.l0 = headerStoryHighlightsMyCollectionComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(HeaderStoryHighlightsOtherCollectionComponent headerStoryHighlightsOtherCollectionComponent, int i) {
        super(3);
        this.$t = i;
        this.l0 = headerStoryHighlightsOtherCollectionComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS651S0100000_2(List list, List<Aweme> list2) {
        super(3);
        this.$t = list2;
        this.l0 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS651S0100000_2(Function2 function2, Function2<? super String, ? super Long, Unit> function22) {
        super(3);
        this.$t = function22;
        this.l0 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(AwS492S0200000_31 awS492S0200000_31, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS492S0200000_31;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS651S0100000_2(AwS581S0100000_2 awS581S0100000_2, int i) {
        super(3);
        this.$t = i;
        this.l0 = awS581S0100000_2;
    }

    public static final Object invoke$0(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        InterfaceC1452505mN interfaceC1452505mN;
        Object type;
        Function2 function2;
        InterfaceC1452505mN interfaceC1452505mN2;
        Function1 function1 = (Function1) obj2;
        InterfaceC1445905lJ interfaceC1445905lJ = (InterfaceC1445905lJ) obj3;
        boolean z = interfaceC1445905lJ instanceof InterfaceC1452605mO;
        if (z && (interfaceC1452505mN2 = (InterfaceC1452505mN) interfaceC1445905lJ) != null) {
            interfaceC1452505mN2.getType();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = function1.invoke(interfaceC1445905lJ);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        if (z && (interfaceC1452505mN = (InterfaceC1452505mN) interfaceC1445905lJ) != null && (type = interfaceC1452505mN.getType()) != null && (function2 = (Function2) awS651S0100000_2.l0) != null) {
            function2.invoke(type, Long.valueOf(jCurrentTimeMillis2));
        }
        return objInvoke;
    }

    public static final Object invoke$1(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        String strLIZIZ;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        String str = (String) obj3;
        ((C21411818qq) ((RequireApprovalAssem) awS651S0100000_2.l0).LLJJIJI.getValue()).setChecked(zBooleanValue);
        RequireApprovalAssem requireApprovalAssem = (RequireApprovalAssem) awS651S0100000_2.l0;
        if (!zBooleanValue) {
            C1584506Ih.LIZ((View) requireApprovalAssem.LLJJIII.getValue());
        } else {
            C1584506Ih.LIZIZ((View) requireApprovalAssem.LLJJIII.getValue());
            if (str.length() == 0) {
                strLIZIZ = C1383370m6R.LJIIJ(2131831432);
            } else {
                strLIZIZ = C1710306mr.LIZIZ(2131831423, str);
            }
            strLIZIZ.toString();
            Context context = requireApprovalAssem.LJJIJL().getContext();
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_pen_fill;
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("  ");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            int length = strLIZIZ.length() + 1;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LJII, tuxIconDrawableLIZ.LJIIIIZZ);
            C786410Ut5.q2(spannableStringBuilder, new C419890GdH(tuxIconDrawableLIZ, 2), length, length + 1, 34);
            TuxTextView tuxTextView = (TuxTextView) requireApprovalAssem.LLJJIII.getValue();
            C786410Ut5.h9(tuxTextView, new ACListenerS137S0100000_2(requireApprovalAssem, 10));
            tuxTextView.setText(spannableStringBuilder);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        ((InterfaceC1631620sYq) awS651S0100000_2.l0).invoke(obj, obj2, obj3);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$11(kotlin.jvm.internal.AwS651S0100000_2 r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            java.util.List r6 = (java.util.List) r6
            java.lang.String r7 = (java.lang.String) r7
            if (r6 == 0) goto L28
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r6.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.06qv r0 = (X.C1735506qv) r0
            java.lang.String r0 = r0.LIZ
            int r0 = r0.length()
            if (r0 <= 0) goto Lf
            r2.add(r1)
            goto Lf
        L28:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem r0 = (com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem) r0
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r0.LLILLL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem.LLILZLL
            com.bytedance.assem.arch.viewModel.AssemViewModel r1 = r1.getValue()
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel r1 = (com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel) r1
            X.06Mv r0 = X.EnumC1596306Mv.LEAD_INFO
            r1.BQ2(r0)
            goto L5a
        L3c:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem r0 = (com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem) r0
            com.bytedance.assem.arch.viewModel.AssemVMLazy r1 = r0.LLILLL
            X.1Bqa<java.lang.Object>[] r0 = com.ss.android.ugc.aweme.im.b2c.notice.BusinessLeadInfoAssem.LLILZLL
            com.bytedance.assem.arch.viewModel.AssemViewModel r1 = r1.getValue()
            com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel r1 = (com.ss.android.ugc.aweme.im.prompts.api.chatnotice.flow.base.viewmodel.ICommonChatNoticeViewModel) r1
            X.06qt r0 = new X.06qt
            r0.<init>(r2, r7)
            r1.xQ2(r0)
        L5a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS651S0100000_2.invoke$11(kotlin.jvm.internal.AwS651S0100000_2, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        boolean z;
        int iIntValue = ((Number) obj).intValue();
        Aweme aweme = (Aweme) obj2;
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) obj3;
        if (iIntValue != 2) {
            if (iIntValue != 8) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C625480Og6(aweme, (List) awS651S0100000_2.l0, null), 3);
        z = true;
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        ((Function1) awS651S0100000_2.l0).invoke(new C1378605aS(((C20066813fO) obj2).LIZJ));
        return Unit.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0059, code lost:
    
        r3 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS651S0100000_2 r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS651S0100000_2.invoke$4(kotlin.jvm.internal.AwS651S0100000_2, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        IIMDebugService.LIZ.getClass();
        IIMDebugService iIMDebugService = C1587706Jn.LIZIZ;
        if (iIMDebugService != null) {
            iIMDebugService.LJIIJ();
        }
        ((InterfaceC1631620sYq) awS651S0100000_2.l0).invoke(obj, obj2, Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        IStoryHighlightsMyDataManager iStoryHighlightsMyDataManager;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List<String> list = (List) obj3;
        StoryHighlightsMyProfileVM storyHighlightsMyProfileVMYp = ((HeaderStoryHighlightsMyCollectionComponent) awS651S0100000_2.l0).yp();
        if (!zBooleanValue && !list.isEmpty() && (iStoryHighlightsMyDataManager = (IStoryHighlightsMyDataManager) PluggableExtentionKt.pluggableSpi$default(IStoryHighlightsMyDataManager.class, false, false, false, 14, null)) != null && !iStoryHighlightsMyDataManager.LJIJI(list)) {
            storyHighlightsMyProfileVMYp.setState(AFwS229S0000000_2.get$arr$(699));
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyHighlightsMyProfileVMYp), C0PEM.LIZJ, null, new C1409205fO(iStoryHighlightsMyDataManager, list, storyHighlightsMyProfileVMYp, null), 2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        List list = (List) obj3;
        StoryHighlightsOtherProfileVM storyHighlightsOtherProfileVMZp = ((HeaderStoryHighlightsOtherCollectionComponent) awS651S0100000_2.l0).zp();
        if (!zBooleanValue && !list.isEmpty()) {
            Map<String, Aweme> map = storyHighlightsOtherProfileVMZp.getState().LLILLJJLI;
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!map.containsKey(next)) {
                    if (next != null) {
                        storyHighlightsOtherProfileVMZp.setState(AFwS229S0000000_2.get$arr$(701));
                        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(storyHighlightsOtherProfileVMZp), C0PEM.LIZJ, null, new C05N5(list, storyHighlightsOtherProfileVMZp, null), 2);
                    }
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        ChatFeatureListConf chatFeatureListConf;
        List list = (List) obj2;
        String str = (String) obj3;
        C06M6 c06m6 = (C06M6) ((BusinessLandingMsgAssem) awS651S0100000_2.l0).LLJ.getValue();
        if (c06m6 != null && (chatFeatureListConf = c06m6.LL) != null && !chatFeatureListConf.componentEnable(EnumC1660706er.B2C_AUTO_REPLY.getId())) {
            ((BusinessLandingMsgAssem) awS651S0100000_2.l0).Oo();
        }
        ((BusinessLandingMsgAssem) awS651S0100000_2.l0).No(str, list);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS651S0100000_2 awS651S0100000_2, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        C1606906Qx c1606906Qx = (C1606906Qx) awS651S0100000_2.l0;
        String str = c1606906Qx.LIZIZ;
        Bundle bundle = new Bundle();
        bundle.putInt("visible_scope_type", iIntValue);
        bundle.putInt("auto_approve", zBooleanValue ? 1 : 0);
        c1606906Qx.LIZ(str, bundle, (C11NZ) obj3);
        return Unit.LIZ;
    }
}
