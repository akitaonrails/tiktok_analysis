package com.ss.android.ugc.aweme.services.watermark;

import X.InterfaceC2257101DWa;
import android.graphics.Point;
import android.util.Size;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes23.dex */
public interface IWaterMarkService {
    void addAIPortraitWatermarkToImage(String str, String str2);

    void addAITextImageWaterMarkToImage(String str, String str2);

    void addAiChatWaterMarkToImage(String str, String str2);

    void addWaterMarkToImage(InterfaceC2257101DWa interfaceC2257101DWa, String str, String str2, boolean z, int i, boolean z2);

    void cancelWaterMark();

    Pair<Point, Size> createWaterMarkFile(InterfaceC2257101DWa interfaceC2257101DWa, int i, int i2, String str, boolean z, int i3, boolean z2);

    void prepareDataForI18n(WaterMarkBuilder waterMarkBuilder);

    void readAIGCAddAIPortraitWatermark(Aweme aweme, List<String> list);

    String readAIGCAddAIPortraitWatermarkForSingleImage(String str, String str2);

    void waterMark(WaterMarkBuilder waterMarkBuilder);

    void watermarkForTikTokNow(WaterMarkBuilder waterMarkBuilder);

    public static final class DefaultImpls {
        public static /* synthetic */ void addWaterMarkToImage$default(IWaterMarkService iWaterMarkService, InterfaceC2257101DWa interfaceC2257101DWa, String str, String str2, boolean z, int i, boolean z2, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 8) != 0) {
                    z = false;
                }
                if ((i2 & 16) != 0) {
                    i = 0;
                }
                if ((i2 & 32) != 0) {
                    z2 = false;
                }
                iWaterMarkService.addWaterMarkToImage(interfaceC2257101DWa, str, str2, z, i, z2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWaterMarkToImage");
        }

        public static /* synthetic */ Pair createWaterMarkFile$default(IWaterMarkService iWaterMarkService, InterfaceC2257101DWa interfaceC2257101DWa, int i, int i2, String str, boolean z, int i3, boolean z2, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 16) != 0) {
                    z = false;
                }
                if ((i4 & 32) != 0) {
                    i3 = 0;
                }
                if ((i4 & 64) != 0) {
                    z2 = false;
                }
                return iWaterMarkService.createWaterMarkFile(interfaceC2257101DWa, i, i2, str, z, i3, z2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createWaterMarkFile");
        }
    }
}
