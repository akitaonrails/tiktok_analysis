package com.ss.android.ugc.aweme.music.understanding;

import X.C13BV;
import X.C13EL;
import X.C1458370o3P;
import X.C1458580o3k;
import X.C2257908sz;
import X.EnumC1155060gAC;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ContentUnderstandingServiceWrapImpl implements IContentUnderstandingServiceWrap {
    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap
    public final C13EL LIZIZ() {
        C1458370o3P.LIZ.getClass();
        return C1458370o3P.LJ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap
    public final String LIZJ() {
        C1458370o3P.LIZ.getClass();
        if (!C1458370o3P.LJIJJ() || C1458370o3P.LJIIZILJ == EnumC1155060gAC.TOS_URI) {
            return null;
        }
        return C1458370o3P.LJII();
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap
    public final ContentUnderstandingRequest LIZ(List<String> list, Object obj, String str, String str2, String str3, boolean z, String str4, int i) {
        ShortVideoContext shortVideoContext;
        int i2;
        List<PipelineNodeConfig> listLIZIZ;
        String musicId = null;
        if (!(obj instanceof ShortVideoContext) || (shortVideoContext = (ShortVideoContext) obj) == null || list.isEmpty()) {
            return null;
        }
        String creationId = shortVideoContext.getCreationId();
        String strLIZ = C1458580o3k.LIZ(shortVideoContext.getCreationId());
        String str5 = shortVideoContext.shootWay;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null) {
            musicId = aVMusicExtractAVMusic.getMusicId();
        }
        int i3 = 0;
        if (musicId != null && musicId.length() != 0) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        Integer numValueOf = Integer.valueOf(i2 ^ 1);
        if (z || Intrinsics.LJFF(shortVideoContext.shootWay, "story")) {
            i3 = 1;
        }
        C2257908sz c2257908sz = new C2257908sz(str5, str4, numValueOf, Integer.valueOf(i3), str3, list.size(), 0, i, null, 768);
        IContentUnderstandingNodeBuild iContentUnderstandingNodeBuild = (IContentUnderstandingNodeBuild) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingNodeBuild.class, false, false, false, 14, null);
        if (iContentUnderstandingNodeBuild == null || (listLIZIZ = iContentUnderstandingNodeBuild.LIZIZ()) == null) {
            listLIZIZ = C13BV.INSTANCE;
        }
        return new ContentUnderstandingRequest(list, null, new AwS547S0100000_3(shortVideoContext, 38), creationId, strLIZ, str2, str, c2257908sz, null, listLIZIZ, 0L, 1282, null);
    }
}
