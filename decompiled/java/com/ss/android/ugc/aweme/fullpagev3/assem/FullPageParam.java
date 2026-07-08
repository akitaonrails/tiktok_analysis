package com.ss.android.ugc.aweme.fullpagev3.assem;

import X.C2188811AlT;
import X.InterfaceC111300bX;
import X.InterfaceC1343830l4f;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FullPageParam extends VideoItemParams implements InterfaceC111300bX, InterfaceC1891350zJl, InterfaceC1343830l4f {
    public Aweme aweme;
    public List<Comment> exposeComments;
    public final PostModeDetailParams postModeDetailParams;
    public final boolean showReportMask;

    public final FullPageParam copy(Aweme aweme, PostModeDetailParams postModeDetailParams, List<Comment> list, boolean z) {
        return new FullPageParam(aweme, postModeDetailParams, list, z);
    }

    @Override // X.InterfaceC1891350zJl
    public Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullPageParam(aweme=");
        sbLIZ.append(this.aweme);
        sbLIZ.append(", postModeDetailParams=");
        sbLIZ.append(this.postModeDetailParams);
        sbLIZ.append(", exposeComments=");
        sbLIZ.append(this.exposeComments);
        sbLIZ.append(", showReportMask=");
        sbLIZ.append(this.showReportMask);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        return getAweme().hashCode();
    }

    @Override // com.ss.android.ugc.aweme.feed.model.VideoItemParams, X.C0OB8
    public Aweme getAweme() {
        return this.aweme;
    }

    @Override // X.InterfaceC1343830l4f
    public List<Comment> getExposeComments() {
        return this.exposeComments;
    }

    public PostModeDetailParams getPostModeDetailParams() {
        return this.postModeDetailParams;
    }

    public final boolean getShowReportMask() {
        return this.showReportMask;
    }

    public int isEnterGraphicDetail() {
        return this.isEnterGraphicDetail;
    }

    @Override // X.InterfaceC1891350zJl
    public boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof FullPageParam) || !Intrinsics.LJFF(this, interfaceC1891350zJl) || this.showReportMask != ((FullPageParam) interfaceC1891350zJl).showReportMask) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1891350zJl
    public boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof FullPageParam)) {
            return false;
        }
        return Intrinsics.LJFF(getAweme().getAid(), ((VideoItemParams) interfaceC1891350zJl).getAweme().getAid());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FullPageParam)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        FullPageParam fullPageParam = (FullPageParam) obj;
        if (!Intrinsics.LJFF(getAweme(), fullPageParam.getAweme()) || this.showReportMask != fullPageParam.showReportMask) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.feed.model.VideoItemParams
    public void setAweme(Aweme aweme) {
        this.aweme = aweme;
    }

    @Override // X.InterfaceC1343830l4f
    public void setExposeComments(List<Comment> list) {
        this.exposeComments = list;
    }

    public FullPageParam(Aweme aweme, PostModeDetailParams postModeDetailParams, List<Comment> list, boolean z) {
        this.aweme = aweme;
        this.postModeDetailParams = postModeDetailParams;
        this.exposeComments = list;
        this.showReportMask = z;
    }
}
