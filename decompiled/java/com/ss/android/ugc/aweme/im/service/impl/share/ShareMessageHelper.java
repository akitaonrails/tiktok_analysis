package com.ss.android.ugc.aweme.im.service.impl.share;

import X.C869590Y9l;
import android.content.Context;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareMessageHelper implements IShareMessageHelper {
    public static final ShareMessageHelper LIZIZ = new ShareMessageHelper();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IShareMessageHelper {
        public final /* synthetic */ ShareMessageHelper LIZIZ = ShareMessageHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper
        public final void LIZ(SessionInfo sessionInfo, Context context, BaseContent baseContent, BaseTemplate baseTemplate, C869590Y9l c869590Y9l, String str, String str2, boolean z, Function0<Unit> function0) {
            this.LIZIZ.LIZ(sessionInfo, context, baseContent, baseTemplate, c869590Y9l, str, str2, z, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.bytedance.ies.abmock.SettingsManager] */
    @Override // com.ss.android.ugc.aweme.im.service.automessage.IShareMessageHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo r32, android.content.Context r33, com.ss.android.ugc.aweme.im.message.content.BaseContent r34, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate r35, X.C869590Y9l r36, java.lang.String r37, java.lang.String r38, boolean r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40) {
        /*
            Method dump skipped, instruction units count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.service.impl.share.ShareMessageHelper.LIZ(com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo, android.content.Context, com.ss.android.ugc.aweme.im.message.content.BaseContent, com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate, X.0Y9l, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0):void");
    }
}
