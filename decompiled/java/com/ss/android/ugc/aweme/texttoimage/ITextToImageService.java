package com.ss.android.ugc.aweme.texttoimage;

import X.C0LAB;
import X.C0LCF;
import X.C0SUA;
import X.C19A3;
import X.C19EG;
import X.C572350Mcb;
import X.C572370Mcd;
import X.C705930RmZ;
import X.C857790Xkv;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public interface ITextToImageService {
    void LIZJ();

    Pair<String, String> LIZLLL(String str);

    TextToImageEditScene LJ();

    String LJFF(String str);

    void LJI();

    boolean LJII(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Object obj, Function0<Unit> function0, Function0<Unit> function02);

    boolean LJIIIIZZ();

    void LJIIIZ(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function0<Unit> function0, Function0<Unit> function02);

    void LJIIJ(ForwardMedia forwardMedia, C572370Mcd c572370Mcd);

    void LJIIJJI();

    C0SUA LJIIL(C19EG c19eg, Aweme aweme, C705930RmZ c705930RmZ);

    Class<? extends C19A3> LJIILIIL();

    void LJIILJJIL(String str);

    void LJIILL();

    void LJIILLIIL(String str, String str2, String str3, boolean z);

    TextImageAIGCInterceptor LJIIZILJ();

    void LJIJ(Aweme aweme, String str, String str2, String str3, String str4);

    boolean LJIJI(Context context, String str, Bundle bundle);

    C857790Xkv LJIJJ(C19EG c19eg, VideoPublishEditModel videoPublishEditModel);

    C0LCF LJIJJLI();

    View LJIL(Context context);

    String LJJ(String str);

    Class<?> LJJI();

    boolean LJJIFFI();

    C572350Mcb LJJII();

    TextToImageChooseScene LJJIII();

    Class<? extends C19A3> LJJIIJ();

    boolean LJJIIJZLJL(Context context, Object obj, Bundle bundle);

    void LJJIIZ(String str, ICommentInlineBannerReadyListener iCommentInlineBannerReadyListener);

    OpenTextImageInterceptor LJJIIZI();

    void LJJIJ(Context context, String str, ForwardMedia forwardMedia, C572370Mcd c572370Mcd);

    void LJJIJIIJI(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab);

    void LJJIJIIJIL(Context context, ForwardMedia forwardMedia, C572370Mcd c572370Mcd, Function0<Unit> function0, Function1<? super String, Unit> function1);

    void LJJIJIL(String str, ICommentInlineBannerReadyListener iCommentInlineBannerReadyListener);

    void LJJIJL();

    void LJJIJLIJ();

    boolean LJJIL();
}
