package com.ss.android.ugc.aweme.series.common.serviceimpl;

import X.C01GW;
import X.C1232504rz;
import X.C1600840rlC;
import X.C452501pT;
import com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService;
import java.util.Set;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes12.dex */
public final class MiniDramaFeedAwemeSyncServiceImpl implements IMiniDramaFeedAwemeSyncService {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(624));
    public final Regex LIZIZ = new Regex("([?&])id=([^&]*)");

    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService
    public final boolean LIZ(String str) {
        if (str != null && str.length() != 0 && ((Set) C1232504rz.LIZIZ.getValue()).contains(str) && C1600840rlC.LIZ()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c8  */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.service.IMiniDramaFeedAwemeSyncService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.Aweme LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r22, com.ss.android.ugc.aweme.feed.model.Aweme r23) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaFeedAwemeSyncServiceImpl.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.feed.model.Aweme");
    }
}
