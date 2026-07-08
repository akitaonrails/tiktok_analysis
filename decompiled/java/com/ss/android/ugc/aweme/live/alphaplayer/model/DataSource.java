package com.ss.android.ugc.aweme.live.alphaplayer.model;

import X.AbstractC2247131CxL;
import X.C08FF;
import X.C0VSJ;
import X.C2188811AlT;
import X.C2246591CwT;
import X.C2247381Cxk;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes35.dex */
public class DataSource {
    public boolean autoRelease = true;
    public String errorInfo;
    public boolean isValid;
    public DataInfo landscapeDataInfo;
    public boolean loop;
    public long messageId;
    public DataInfo portraitDataInfo;

    public static class DataInfo {
        public int actualHeight;
        public int actualWidth;
        public C2247381Cxk alphaArea;
        public List<C2246591CwT> layers;
        public Map<String, Map<String, Element>> masks;
        public String path;
        public List<String> pathList;
        public C2247381Cxk rgbArea;
        public ScaleType scaleType = ScaleType.ScaleAspectFill;
        public int totalFrame;
        public int version;
        public int videoHeight;
        public int videoWidth;

        public boolean isSupportLayers() {
            List<C2246591CwT> list;
            return (this.version < 2 || (list = this.layers) == null || list.isEmpty()) ? false : true;
        }

        public boolean isSupportMask() {
            Map<String, Map<String, Element>> map;
            return (this.version < 1 || (map = this.masks) == null || map.isEmpty()) ? false : true;
        }

        public boolean isSupportZip() {
            return (this.version < 1 || this.rgbArea == null || this.alphaArea == null) ? false : true;
        }

        public DataInfo() {
        }

        public int getActualHeight() {
            return this.actualHeight;
        }

        public int getActualWidth() {
            return this.actualWidth;
        }

        public C2247381Cxk getAlphaArea() {
            return this.alphaArea;
        }

        public List<C2246591CwT> getLayers() {
            return this.layers;
        }

        public Map<String, Map<String, Element>> getMasks() {
            return this.masks;
        }

        public String getPath() {
            return this.path;
        }

        public List<String> getPathList() {
            return this.pathList;
        }

        public C2247381Cxk getRgbArea() {
            return this.rgbArea;
        }

        public ScaleType getScaleType() {
            return this.scaleType;
        }

        public int getTotalFrame() {
            return this.totalFrame;
        }

        public int getVersion() {
            return this.version;
        }

        public int getVideoHeight() {
            return this.videoHeight;
        }

        public int getVideoWidth() {
            return this.videoWidth;
        }

        public DataInfo(String str) {
            this.path = str;
        }

        public static DataInfo copy(DataInfo dataInfo) {
            if (dataInfo == null) {
                return null;
            }
            DataInfo dataInfo2 = new DataInfo();
            dataInfo2.path = dataInfo.path;
            dataInfo2.pathList = dataInfo.pathList;
            dataInfo2.scaleType = dataInfo.scaleType;
            dataInfo2.totalFrame = dataInfo.totalFrame;
            dataInfo2.alphaArea = C2247381Cxk.LIZ(dataInfo.alphaArea);
            dataInfo2.rgbArea = C2247381Cxk.LIZ(dataInfo.rgbArea);
            dataInfo2.videoWidth = dataInfo.videoWidth;
            dataInfo2.videoHeight = dataInfo.videoHeight;
            dataInfo2.actualWidth = dataInfo.actualWidth;
            dataInfo2.actualHeight = dataInfo.actualHeight;
            dataInfo2.version = dataInfo.version;
            dataInfo2.masks = dataInfo.masks;
            dataInfo2.layers = dataInfo.layers;
            return dataInfo2;
        }

        public DataInfo setActualHeight(int i) {
            this.actualHeight = i;
            return this;
        }

        public DataInfo setActualWidth(int i) {
            this.actualWidth = i;
            return this;
        }

        public DataInfo setAlphaArea(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.alphaArea = new C2247381Cxk(iArr);
            }
            return this;
        }

        public DataInfo setLayers(List<C2246591CwT> list) {
            this.layers = list;
            return this;
        }

        public DataInfo setMasks(Map<String, Map<String, Element>> map) {
            this.masks = map;
            return this;
        }

        public DataInfo setPathList(List<String> list) {
            this.pathList = list;
            return this;
        }

        public DataInfo setRgbArea(int[] iArr) {
            if (iArr != null && iArr.length == 4) {
                this.rgbArea = new C2247381Cxk(iArr);
            }
            return this;
        }

        public DataInfo setScaleType(int i) {
            this.scaleType = ScaleType.convertFrom(i);
            return this;
        }

        public DataInfo setTotalFrame(int i) {
            this.totalFrame = i;
            return this;
        }

        public DataInfo setVersion(int i) {
            this.version = i;
            return this;
        }

        public DataInfo setVideoHeight(int i) {
            this.videoHeight = i;
            return this;
        }

        public DataInfo setVideoWidth(int i) {
            this.videoWidth = i;
            return this;
        }

        public DataInfo setScaleType(ScaleType scaleType) {
            this.scaleType = scaleType;
            return this;
        }
    }

    public static final class Element extends AbstractC2247131CxL {
        public int fitType;
        public int[] renderFrame;
        public int[] sourceFrame;
        public int type;

        public boolean isValid() {
            int[] iArr;
            int[] iArr2;
            int i = this.type;
            if (i != 0 && i != 1) {
                return false;
            }
            int i2 = this.fitType;
            return (i2 == 0 || i2 == 1) && (iArr = this.sourceFrame) != null && iArr.length == 4 && (iArr2 = this.renderFrame) != null && iArr2.length == 4;
        }

        public String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Element{type=");
            sbLIZ.append(this.type);
            sbLIZ.append(", fitType=");
            sbLIZ.append(this.fitType);
            sbLIZ.append(", sourceFrame=");
            sbLIZ.append(Arrays.toString(this.sourceFrame));
            sbLIZ.append(", renderFrame=");
            sbLIZ.append(Arrays.toString(this.renderFrame));
            sbLIZ.append('}');
            return C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    private void checkValid() {
        this.isValid = checkValid(this.portraitDataInfo);
    }

    public boolean getAutoRelease() {
        return this.autoRelease;
    }

    public String getErrorInfo() {
        return this.errorInfo;
    }

    public boolean getLoop() {
        return this.loop;
    }

    public long getMessageId() {
        return this.messageId;
    }

    public boolean isValid() {
        return this.isValid;
    }

    public enum ScaleType {
        ScaleToFill(0),
        ScaleAspectFitCenter(1),
        ScaleAspectFill(2),
        TopFill(3),
        BottomFill(4),
        LeftFill(5),
        RightFill(6),
        TopFit(7),
        BottomFit(8),
        LeftFit(9),
        RightFit(10);

        public int index;

        public static ScaleType convertFrom(int i) {
            switch (i) {
                case 0:
                    return ScaleToFill;
                case 1:
                    return ScaleAspectFitCenter;
                case 2:
                    return ScaleAspectFill;
                case 3:
                    return TopFill;
                case 4:
                    return BottomFill;
                case 5:
                    return LeftFill;
                case 6:
                    return RightFill;
                case 7:
                    return TopFit;
                case 8:
                    return BottomFit;
                case BdTuring.TYPE_ECAF /* 9 */:
                    return LeftFit;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    return RightFit;
                default:
                    return ScaleAspectFill;
            }
        }

        public static ScaleType valueOf(String str) {
            return (ScaleType) C08FF.LIZ(ScaleType.class, str);
        }

        ScaleType(int i) {
            this.index = i;
        }
    }

    private boolean checkValid(DataInfo dataInfo) {
        C2247381Cxk c2247381Cxk;
        int i;
        if (dataInfo == null) {
            this.errorInfo = "dataInfo is null.";
            return false;
        }
        if (TextUtils.isEmpty(dataInfo.path)) {
            this.errorInfo = "dataPath is empty.";
            return false;
        }
        if (!new C0VSJ(dataInfo.path).exists()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("dataPath is not exist, path: ");
            sbLIZ.append(dataInfo.path);
            this.errorInfo = C2188811AlT.LIZIZ(sbLIZ);
            return false;
        }
        if (dataInfo.version > 0) {
            C2247381Cxk c2247381Cxk2 = dataInfo.alphaArea;
            if (c2247381Cxk2 != null && (c2247381Cxk = dataInfo.rgbArea) != null) {
                if (c2247381Cxk2.LIZ <= c2247381Cxk2.LIZJ && c2247381Cxk2.LIZIZ <= c2247381Cxk2.LIZLLL) {
                    float f = c2247381Cxk.LIZ;
                    float f2 = c2247381Cxk.LIZJ;
                    if (f <= f2 && c2247381Cxk.LIZIZ <= c2247381Cxk.LIZLLL) {
                        if (dataInfo.videoWidth > 0 && dataInfo.videoHeight > 0) {
                            int i2 = dataInfo.actualWidth;
                            if (i2 > 0 && (i = dataInfo.actualHeight) > 0) {
                                if (f2 - f != i2 || c2247381Cxk.LIZLLL - c2247381Cxk.LIZIZ != i) {
                                    this.errorInfo = "rgb area is not equal to actual size";
                                    return false;
                                }
                            } else {
                                this.errorInfo = "actual size is wrong";
                                return false;
                            }
                        } else {
                            this.errorInfo = "video size is wrong";
                            return false;
                        }
                    }
                }
                this.errorInfo = "area is invalid";
                return false;
            }
            this.errorInfo = "area is empty";
            return false;
        }
        return true;
    }

    public static DataSource copy(DataSource dataSource) {
        if (dataSource == null) {
            return null;
        }
        DataSource dataSource2 = new DataSource();
        dataSource2.setPortraitDataInfo(DataInfo.copy(dataSource.portraitDataInfo));
        dataSource2.setLandscapeDataInfo(DataInfo.copy(dataSource.landscapeDataInfo));
        dataSource2.setLoop(dataSource.loop);
        dataSource2.setAutoRelease(dataSource.autoRelease);
        dataSource2.setMessageId(dataSource.messageId);
        dataSource2.isValid = dataSource.isValid;
        dataSource2.errorInfo = dataSource.errorInfo;
        return dataSource2;
    }

    public DataInfo getDataInfo(int i) {
        if (1 == i) {
            return this.portraitDataInfo;
        }
        return this.landscapeDataInfo;
    }

    public DataSource setAutoRelease(boolean z) {
        this.autoRelease = z;
        return this;
    }

    public DataSource setLandscapeDataInfo(DataInfo dataInfo) {
        this.landscapeDataInfo = dataInfo;
        checkValid();
        return this;
    }

    public DataSource setLoop(boolean z) {
        this.loop = z;
        return this;
    }

    public DataSource setMessageId(long j) {
        this.messageId = j;
        return this;
    }

    public DataSource setPortraitDataInfo(DataInfo dataInfo) {
        this.portraitDataInfo = dataInfo;
        checkValid();
        return this;
    }
}
