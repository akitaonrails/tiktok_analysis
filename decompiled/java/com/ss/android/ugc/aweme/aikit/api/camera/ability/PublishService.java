package com.ss.android.ugc.aweme.aikit.api.camera.ability;

import X.C547950LeL;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AICrtInfo;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS306S0000000_22;

/* JADX INFO: loaded from: classes23.dex */
public interface PublishService {
    boolean LIZ(CreativeModel creativeModel);

    List<C547950LeL> LIZIZ(List<String> list);

    void LIZJ(CreativeModel creativeModel);

    void LIZLLL(CreativeModel creativeModel, int i);

    boolean LJ(CreativeModel creativeModel);

    List<String> LJFF(CreativeModel creativeModel);

    List<AICrtInfo> LJI(CreativeModel creativeModel);

    boolean LJII(Aweme aweme);

    List LJIIIIZZ(CreativeModel creativeModel, AFwS306S0000000_22 aFwS306S0000000_22);

    List<String> LJIIIZ(CreativeModel creativeModel);

    List<String> LJIIJ(Aweme aweme);

    Map<String, String> LJIIJJI(CreativeModel creativeModel);

    List<InputBlock> LJIIL(CreativeModel creativeModel);

    boolean LJIILIIL(CreativeModel creativeModel);

    boolean LJIILJJIL(CreativeModel creativeModel);
}
