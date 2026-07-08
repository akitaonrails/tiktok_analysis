package com.ss.android.ugc.aweme.aiportrait.detail.model;

import X.C098200Yq;
import X.C09CT;
import X.C0X12;
import X.C1687190u0T;
import X.C189200o6;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.n;
import com.google.gson.q;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

/* JADX INFO: loaded from: classes26.dex */
public final class AIPortraitDetailHeaderModel extends BaseResponse implements C0X12, Serializable {
    public transient String LL;

    @C09CT("author")
    public TemplateAuthor author;

    @C09CT("faceid_created_way")
    public String faceIdCreatedWay;

    @C09CT("have_ai_self")
    public Boolean hasAISelf;

    @C09CT("has_cameo")
    public Integer hasCameo;

    @C09CT("is_ref_img")
    public Integer isRefImg;

    @C09CT("original_extra")
    public String originalExtra;

    @C09CT("post_count")
    public Long postCount;

    @C09CT("prompt")
    public String prompt;

    @C09CT("prompt_source")
    public String promptSource;

    @C09CT("cover_url")
    public String templateCover;

    @C09CT("title")
    public String title;
    public static final C1687190u0T Companion = new Object() { // from class: X.0u0T
    };
    public static final int $stable = 8;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo getAiCrtInfo() {
        /*
            r4 = this;
            java.lang.String r1 = r4.originalExtra
            if (r1 == 0) goto Lf
            int r0 = r1.length()
            if (r0 == 0) goto Lf
            r0 = 0
        Lb:
            r2 = 0
            if (r0 == 0) goto L11
            return r2
        Lf:
            r0 = 1
            goto Lb
        L11:
            com.google.gson.Gson r3 = new com.google.gson.Gson     // Catch: java.lang.Throwable -> L59
            r3.<init>()     // Catch: java.lang.Throwable -> L59
            java.lang.Class<com.google.gson.n> r0 = com.google.gson.n.class
            java.lang.Object r1 = r3.LJII(r1, r0)     // Catch: java.lang.Throwable -> L59
            com.google.gson.n r1 = (com.google.gson.n) r1     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L57
            java.lang.String r0 = "ai_crt_info"
            com.google.gson.k r1 = r1.LJJIIZ(r0)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L57
            boolean r0 = r1 instanceof com.google.gson.m     // Catch: java.lang.Throwable -> L59
            if (r0 != 0) goto L57
            boolean r0 = r1 instanceof com.google.gson.q     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L4a
            com.google.gson.q r0 = r1.LJIILJJIL()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r0.LL     // Catch: java.lang.Throwable -> L59
            boolean r0 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L4a
            java.lang.String r1 = r1.LJIL()     // Catch: java.lang.Throwable -> L59
            java.lang.Class<com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo> r0 = com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo.class
            java.lang.Object r1 = r3.LJII(r1, r0)     // Catch: java.lang.Throwable -> L59
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo r1 = (com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo) r1     // Catch: java.lang.Throwable -> L59
        L46:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L59
            goto L65
        L4a:
            boolean r0 = r1 instanceof com.google.gson.n     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L57
            java.lang.Class<com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo> r0 = com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo.class
            java.lang.Object r1 = r3.LIZJ(r1, r0)     // Catch: java.lang.Throwable -> L59
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo r1 = (com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo) r1     // Catch: java.lang.Throwable -> L59
            goto L46
        L57:
            r1 = r2
            goto L46
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L65:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L6c
            r2 = r1
        L6c:
            com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo r2 = (com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailHeaderModel.getAiCrtInfo():com.ss.android.ugc.aweme.aiportrait.detail.model.AIPortraitDetailCrtInfo");
    }

    public final AIPortraitDetailExtra getAiPortraitExtra() {
        Object c098200Yq;
        k kVarLJJIIZ;
        String str = this.originalExtra;
        if (str == null || str.length() == 0) {
            return null;
        }
        try {
            Gson gson = new Gson();
            n nVar = (n) gson.LJII(str, n.class);
            c098200Yq = (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ("ai_portrait_extra")) == null || (kVarLJJIIZ instanceof m) || !(((kVarLJJIIZ instanceof q) && (kVarLJJIIZ.LJIILJJIL().LL instanceof String)) || (kVarLJJIIZ instanceof n))) ? null : (AIPortraitDetailExtra) gson.LIZJ(kVarLJJIIZ, AIPortraitDetailExtra.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        return (AIPortraitDetailExtra) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }

    @Override // X.C0X12
    public String getRequestId() {
        String str = this.LL;
        return str == null ? "" : str;
    }

    public final TemplateAuthor getAuthor() {
        return this.author;
    }

    public final String getFaceIdCreatedWay() {
        return this.faceIdCreatedWay;
    }

    public final Boolean getHasAISelf() {
        return this.hasAISelf;
    }

    public final Integer getHasCameo() {
        return this.hasCameo;
    }

    public final String getOriginalExtra() {
        return this.originalExtra;
    }

    public final Long getPostCount() {
        return this.postCount;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getPromptSource() {
        return this.promptSource;
    }

    public final String getRid() {
        return this.LL;
    }

    public final String getTemplateCover() {
        return this.templateCover;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer isRefImg() {
        return this.isRefImg;
    }

    public final void setAuthor(TemplateAuthor templateAuthor) {
        this.author = templateAuthor;
    }

    public final void setFaceIdCreatedWay(String str) {
        this.faceIdCreatedWay = str;
    }

    public final void setHasAISelf(Boolean bool) {
        this.hasAISelf = bool;
    }

    public final void setHasCameo(Integer num) {
        this.hasCameo = num;
    }

    public final void setOriginalExtra(String str) {
        this.originalExtra = str;
    }

    public final void setPostCount(Long l) {
        this.postCount = l;
    }

    public final void setPrompt(String str) {
        this.prompt = str;
    }

    public final void setPromptSource(String str) {
        this.promptSource = str;
    }

    public final void setRefImg(Integer num) {
        this.isRefImg = num;
    }

    @Override // X.C0X12
    public void setRequestId(String str) {
        this.LL = str;
    }

    public final void setRid(String str) {
        this.LL = str;
    }

    public final void setTemplateCover(String str) {
        this.templateCover = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
