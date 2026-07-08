package com.ss.android.ugc.aweme.aikit.api.common;

import X.C05YD;
import X.C0LN8;
import X.C0VSJ;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.io.File;

/* JADX INFO: loaded from: classes9.dex */
public interface FileService {
    C05YD LIZ(int i, C0LN8 c0ln8, String str, String str2, String str3);

    String LIZIZ(C0LN8 c0ln8);

    C0VSJ LIZJ(C0LN8 c0ln8, String str, String str2);

    File LIZLLL(Source source, CreativeInfo creativeInfo, String str, boolean z);

    String LJ(Source source, CreativeInfo creativeInfo, String str);

    MediaModel LJFF(C0LN8 c0ln8, MediaModel mediaModel, int i);

    String LJI(Source source, CreativeInfo creativeInfo);
}
