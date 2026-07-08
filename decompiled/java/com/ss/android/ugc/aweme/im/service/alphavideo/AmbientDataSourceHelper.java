package com.ss.android.ugc.aweme.im.service.alphavideo;

import X.C08JS;
import X.C098200Yq;
import X.C09BH;
import X.C0VSJ;
import X.C1716806nu;
import X.C189200o6;
import X.C2188811AlT;
import X.C7740030o;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.utils.IAmbientDataSourceHelper;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.u;

/* JADX INFO: loaded from: classes15.dex */
public final class AmbientDataSourceHelper implements IAmbientDataSourceHelper {
    public static final AmbientDataSourceHelper LIZIZ = new AmbientDataSourceHelper();
    public static final Map<String, Pair<String, String>> LIZJ = new LinkedHashMap();

    /* JADX INFO: loaded from: classes3.dex */
    public static final class Service implements IAmbientDataSourceHelper {
        public final /* synthetic */ AmbientDataSourceHelper LIZIZ = AmbientDataSourceHelper.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.common.utils.IAmbientDataSourceHelper
        public final DataSource LIZ(String str, String str2) {
            return this.LIZIZ.LIZ(str, str2);
        }
    }

    public static DataSource LIZIZ(String str, String str2) {
        String strLJI;
        Pair pair;
        AlphaVideoFileModel.Item item;
        if (str2 == null) {
            str2 = C1716806nu.LIZIZ;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZJ;
        if (linkedHashMap.get(str) != null) {
            pair = (Pair) linkedHashMap.get(str);
        } else {
            if (new C0VSJ(str2).exists()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(File.separator);
                sbLIZ.append(str);
                File[] fileArrListFiles = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)).listFiles();
                if (fileArrListFiles != null) {
                    File file = null;
                    File file2 = null;
                    for (File file3 : fileArrListFiles) {
                        if (u.LJIIZILJ(file3.getAbsolutePath(), ".json", false)) {
                            file = file3;
                        } else if (u.LJIIZILJ(file3.getAbsolutePath(), ".mp4", false)) {
                            file2 = file3;
                        }
                    }
                    if (file != null && (strLJI = C09BH.LJI(file, Charsets.UTF_8)) != null && file2 != null) {
                        Map<String, Pair<String, String>> map = LIZJ;
                        String absolutePath = file2.getAbsolutePath();
                        if (absolutePath == null) {
                            absolutePath = "";
                        }
                        map.put(str, new Pair<>(strLJI, absolutePath));
                        pair = (Pair) ((LinkedHashMap) map).get(str);
                    }
                }
            }
            return null;
        }
        if (pair != null) {
            try {
                AlphaVideoFileModel alphaVideoFileModel = (AlphaVideoFileModel) C08JS.LIZ((String) pair.getFirst(), AlphaVideoFileModel.class);
                if (alphaVideoFileModel != null && (item = alphaVideoFileModel.portrait) != null) {
                    DataSource dataSource = new DataSource();
                    DataSource.DataInfo dataInfo = new DataSource.DataInfo((String) pair.getSecond());
                    dataInfo.setScaleType(item.align);
                    dataInfo.setVersion(item.version);
                    dataInfo.setTotalFrame(item.totalFrame);
                    dataInfo.setVideoWidth(item.videoWidth);
                    dataInfo.setVideoHeight(item.videoHeight);
                    dataInfo.setActualWidth(item.actualWidth);
                    dataInfo.setActualHeight(item.actualHeight);
                    dataInfo.setAlphaArea(item.alphaFrame);
                    dataInfo.setRgbArea(item.rgbFrame);
                    dataInfo.setMasks(item.masks);
                    dataSource.setPortraitDataInfo(dataInfo);
                    return dataSource;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            return null;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.im.common.utils.IAmbientDataSourceHelper
    public final DataSource LIZ(String str, String str2) {
        Object c098200Yq;
        AlphaVideoFileModel.Item item;
        if (str == null) {
            str = "";
        }
        C0VSJ c0vsj = new C0VSJ(str);
        if (str2 == null) {
            str2 = "";
        }
        C0VSJ c0vsj2 = new C0VSJ(str2);
        if (!c0vsj.exists() || !c0vsj2.exists()) {
            return null;
        }
        try {
            c098200Yq = (AlphaVideoFileModel) C7740030o.LIZ().getGson().LJII(C09BH.LJI(c0vsj, Charsets.UTF_8), AlphaVideoFileModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        AlphaVideoFileModel alphaVideoFileModel = (AlphaVideoFileModel) c098200Yq;
        if (alphaVideoFileModel == null || (item = alphaVideoFileModel.portrait) == null) {
            return null;
        }
        DataSource dataSource = new DataSource();
        DataSource.DataInfo dataInfo = new DataSource.DataInfo(c0vsj2.getAbsolutePath());
        dataInfo.setScaleType(item.align);
        dataInfo.setVersion(item.version);
        dataInfo.setTotalFrame(item.totalFrame);
        dataInfo.setVideoWidth(item.videoWidth);
        dataInfo.setVideoHeight(item.videoHeight);
        dataInfo.setActualWidth(item.actualWidth);
        dataInfo.setActualHeight(item.actualHeight);
        dataInfo.setAlphaArea(item.alphaFrame);
        dataInfo.setRgbArea(item.rgbFrame);
        dataInfo.setMasks(item.masks);
        dataSource.setPortraitDataInfo(dataInfo);
        return dataSource;
    }
}
