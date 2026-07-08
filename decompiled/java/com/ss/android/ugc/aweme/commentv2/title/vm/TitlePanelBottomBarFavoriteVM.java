package com.ss.android.ugc.aweme.commentv2.title.vm;

import X.C01GW;
import X.C452501pT;
import X.C614730O9f;
import X.C614740O9g;
import X.InterfaceC0148002o;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class TitlePanelBottomBarFavoriteVM extends AssemViewModel<C614740O9g> {
    public Aweme LL;
    public long LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(62));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 69));

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C614740O9g(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber((C614730O9f) this.LLILZ.getValue());
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber((C614730O9f) this.LLILZ.getValue());
    }

    public final void wQ2(long j) {
        if (j < 0) {
            j = 0;
        }
        this.LLILLJJLI = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a0 A[PHI: r0
      0x02a0: PHI (r0v71 java.lang.String) = (r0v42 java.lang.String), (r0v72 java.lang.String) binds: [B:110:0x029e, B:108:0x029b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[PHI: r2
      0x006c: PHI (r2v59 java.lang.String) = (r2v12 java.lang.String), (r2v60 java.lang.String) binds: [B:18:0x006a, B:16:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    public final void vQ2(com.ss.android.ugc.aweme.comment.model.CommentContextSource r35, android.view.View r36, kotlin.jvm.functions.Function0<kotlin.Unit> r37) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commentv2.title.vm.TitlePanelBottomBarFavoriteVM.vQ2(com.ss.android.ugc.aweme.comment.model.CommentContextSource, android.view.View, kotlin.jvm.functions.Function0):void");
    }
}
