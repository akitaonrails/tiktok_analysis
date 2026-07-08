package com.ss.android.ugc.aweme.music.understanding;

import X.C2188811AlT;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface ContentUnderstandingResult {

    /* JADX INFO: loaded from: classes3.dex */
    public static final class CompressedFrames implements ContentUnderstandingResult {
        public final List<String> filePaths;

        public final CompressedFrames copy(List<String> list) {
            return new CompressedFrames(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CompressedFrames) && Intrinsics.LJFF(this.filePaths, ((CompressedFrames) obj).filePaths);
        }

        public int hashCode() {
            return this.filePaths.hashCode();
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CompressedFrames(filePaths=");
            sbLIZ.append(this.filePaths);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final List<String> getFilePaths() {
            return this.filePaths;
        }

        public CompressedFrames(List<String> list) {
            this.filePaths = list;
        }
    }

    public static final class Failed implements ContentUnderstandingResult {
        public final int errorCode;
        public final String errorMsg;
        public final Map<String, String> extra;
        public final String failedNodeTag;
        public final PipelineTag pipelineTag;
        public final ContentUnderstandingRequest request;
        public final String throwableClassName;

        public int hashCode() {
            int iHashCode = ((this.pipelineTag.hashCode() * 31) + this.request.hashCode()) * 31;
            String str = this.failedNodeTag;
            int iM286hashCodeimpl = (((iHashCode + (str == null ? 0 : NodeTag.m286hashCodeimpl(str))) * 31) + this.errorCode) * 31;
            String str2 = this.errorMsg;
            int iHashCode2 = (iM286hashCodeimpl + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.throwableClassName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Map<String, String> map = this.extra;
            return iHashCode3 + (map != null ? map.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed(pipelineTag=");
            sbLIZ.append(this.pipelineTag);
            sbLIZ.append(", request=");
            sbLIZ.append(this.request);
            sbLIZ.append(", failedNodeTag=");
            String str = this.failedNodeTag;
            sbLIZ.append((Object) (str == null ? "null" : NodeTag.m287toStringimpl(str)));
            sbLIZ.append(", errorCode=");
            sbLIZ.append(this.errorCode);
            sbLIZ.append(", errorMsg=");
            sbLIZ.append(this.errorMsg);
            sbLIZ.append(", throwableClassName=");
            sbLIZ.append(this.throwableClassName);
            sbLIZ.append(", extra=");
            sbLIZ.append(this.extra);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final int getErrorCode() {
            return this.errorCode;
        }

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final Map<String, String> getExtra() {
            return this.extra;
        }

        /* JADX INFO: renamed from: getFailedNodeTag-3HGgRKE, reason: not valid java name */
        public final String m281getFailedNodeTag3HGgRKE() {
            return this.failedNodeTag;
        }

        public final PipelineTag getPipelineTag() {
            return this.pipelineTag;
        }

        public final ContentUnderstandingRequest getRequest() {
            return this.request;
        }

        public final String getThrowableClassName() {
            return this.throwableClassName;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            if (!Intrinsics.LJFF(this.pipelineTag, failed.pipelineTag) || !Intrinsics.LJFF(this.request, failed.request)) {
                return false;
            }
            String str = this.failedNodeTag;
            String str2 = failed.failedNodeTag;
            if (str != null ? str2 == null || !Intrinsics.LJFF(str, str2) : str2 != null) {
                return false;
            }
            if (this.errorCode == failed.errorCode && Intrinsics.LJFF(this.errorMsg, failed.errorMsg) && Intrinsics.LJFF(this.throwableClassName, failed.throwableClassName) && Intrinsics.LJFF(this.extra, failed.extra)) {
                return true;
            }
            return false;
        }

        public Failed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, String str, int i, String str2, String str3, Map<String, String> map) {
            this.pipelineTag = pipelineTag;
            this.request = contentUnderstandingRequest;
            this.failedNodeTag = str;
            this.errorCode = i;
            this.errorMsg = str2;
            this.throwableClassName = str3;
            this.extra = map;
        }

        /* JADX INFO: renamed from: copy-OJSeJsg, reason: not valid java name */
        public final Failed m280copyOJSeJsg(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, String str, int i, String str2, String str3, Map<String, String> map) {
            return new Failed(pipelineTag, contentUnderstandingRequest, str, i, str2, str3, map);
        }
    }

    public static final class RequestResult implements ContentUnderstandingResult {
        public final CostInfo costInfo;
        public final ContentUnderstandingRequest initRequest;
        public final String models;
        public final Integer statusCode;
        public final String statusMsg;
        public final String understandingKey;
        public final String understandingType;

        public RequestResult() {
            this(null, null, null, null, null, null, null);
        }

        public final RequestResult copy(String str, String str2, String str3, Integer num, String str4, CostInfo costInfo, ContentUnderstandingRequest contentUnderstandingRequest) {
            return new RequestResult(str, str2, str3, num, str4, costInfo, contentUnderstandingRequest);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestResult)) {
                return false;
            }
            RequestResult requestResult = (RequestResult) obj;
            return Intrinsics.LJFF(this.understandingKey, requestResult.understandingKey) && Intrinsics.LJFF(this.understandingType, requestResult.understandingType) && Intrinsics.LJFF(this.models, requestResult.models) && Intrinsics.LJFF(this.statusCode, requestResult.statusCode) && Intrinsics.LJFF(this.statusMsg, requestResult.statusMsg) && Intrinsics.LJFF(this.costInfo, requestResult.costInfo) && Intrinsics.LJFF(this.initRequest, requestResult.initRequest);
        }

        public int hashCode() {
            String str = this.understandingKey;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.understandingType;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.models;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.statusCode;
            int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            String str4 = this.statusMsg;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            CostInfo costInfo = this.costInfo;
            int iHashCode6 = (iHashCode5 + (costInfo == null ? 0 : costInfo.hashCode())) * 31;
            ContentUnderstandingRequest contentUnderstandingRequest = this.initRequest;
            return iHashCode6 + (contentUnderstandingRequest != null ? contentUnderstandingRequest.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestResult(understandingKey=");
            sbLIZ.append(this.understandingKey);
            sbLIZ.append(", understandingType=");
            sbLIZ.append(this.understandingType);
            sbLIZ.append(", models=");
            sbLIZ.append(this.models);
            sbLIZ.append(", statusCode=");
            sbLIZ.append(this.statusCode);
            sbLIZ.append(", statusMsg=");
            sbLIZ.append(this.statusMsg);
            sbLIZ.append(", costInfo=");
            sbLIZ.append(this.costInfo);
            sbLIZ.append(", initRequest=");
            sbLIZ.append(this.initRequest);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final CostInfo getCostInfo() {
            return this.costInfo;
        }

        public final ContentUnderstandingRequest getInitRequest() {
            return this.initRequest;
        }

        public final String getModels() {
            return this.models;
        }

        public final Integer getStatusCode() {
            return this.statusCode;
        }

        public final String getStatusMsg() {
            return this.statusMsg;
        }

        public final String getUnderstandingKey() {
            return this.understandingKey;
        }

        public final String getUnderstandingType() {
            return this.understandingType;
        }

        public RequestResult(String str, String str2, String str3, Integer num, String str4, CostInfo costInfo, ContentUnderstandingRequest contentUnderstandingRequest) {
            this.understandingKey = str;
            this.understandingType = str2;
            this.models = str3;
            this.statusCode = num;
            this.statusMsg = str4;
            this.costInfo = costInfo;
            this.initRequest = contentUnderstandingRequest;
        }
    }

    public static final class ZipBundle implements ContentUnderstandingResult {
        public final String fileType;
        public final ContentUnderstandingRequest initRequest;
        public final String zipFilePath;

        public final ZipBundle copy(String str, String str2, ContentUnderstandingRequest contentUnderstandingRequest) {
            return new ZipBundle(str, str2, contentUnderstandingRequest);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZipBundle)) {
                return false;
            }
            ZipBundle zipBundle = (ZipBundle) obj;
            return Intrinsics.LJFF(this.zipFilePath, zipBundle.zipFilePath) && Intrinsics.LJFF(this.fileType, zipBundle.fileType) && Intrinsics.LJFF(this.initRequest, zipBundle.initRequest);
        }

        public int hashCode() {
            int iHashCode = ((this.zipFilePath.hashCode() * 31) + this.fileType.hashCode()) * 31;
            ContentUnderstandingRequest contentUnderstandingRequest = this.initRequest;
            return iHashCode + (contentUnderstandingRequest == null ? 0 : contentUnderstandingRequest.hashCode());
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ZipBundle(zipFilePath=");
            sbLIZ.append(this.zipFilePath);
            sbLIZ.append(", fileType=");
            sbLIZ.append(this.fileType);
            sbLIZ.append(", initRequest=");
            sbLIZ.append(this.initRequest);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final String getFileType() {
            return this.fileType;
        }

        public final ContentUnderstandingRequest getInitRequest() {
            return this.initRequest;
        }

        public final String getZipFilePath() {
            return this.zipFilePath;
        }

        public ZipBundle(String str, String str2, ContentUnderstandingRequest contentUnderstandingRequest) {
            this.zipFilePath = str;
            this.fileType = str2;
            this.initRequest = contentUnderstandingRequest;
        }
    }

    public static final class CostInfo {
        public final String logid;
        public final String musicServerCallRecommendCostMs;
        public final String musicServerCostMs;
        public final String recommendUnderstandingCostMs;

        public CostInfo() {
            this(null, null, null, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CostInfo)) {
                return false;
            }
            CostInfo costInfo = (CostInfo) obj;
            return Intrinsics.LJFF(this.musicServerCostMs, costInfo.musicServerCostMs) && Intrinsics.LJFF(this.musicServerCallRecommendCostMs, costInfo.musicServerCallRecommendCostMs) && Intrinsics.LJFF(this.recommendUnderstandingCostMs, costInfo.recommendUnderstandingCostMs) && Intrinsics.LJFF(this.logid, costInfo.logid);
        }

        public int hashCode() {
            String str = this.musicServerCostMs;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.musicServerCallRecommendCostMs;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.recommendUnderstandingCostMs;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logid;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CostInfo(musicServerCostMs=");
            sbLIZ.append(this.musicServerCostMs);
            sbLIZ.append(", musicServerCallRecommendCostMs=");
            sbLIZ.append(this.musicServerCallRecommendCostMs);
            sbLIZ.append(", recommendUnderstandingCostMs=");
            sbLIZ.append(this.recommendUnderstandingCostMs);
            sbLIZ.append(", logid=");
            sbLIZ.append(this.logid);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CostInfo(String str, String str2, String str3, String str4) {
            this.musicServerCostMs = str;
            this.musicServerCallRecommendCostMs = str2;
            this.recommendUnderstandingCostMs = str3;
            this.logid = str4;
        }
    }
}
