package com.ss.android.ugc.aweme.im.saas.host.api.camera;

import X.C0Y3I;
import X.C0ZSW;
import X.C15597068t;
import X.C189200o6;
import X.C461620I8i;
import X.C869590Y9l;
import X.InterfaceC1331800klG;
import X.InterfaceC1364105Vn;
import X.InterfaceC456840Hvm;
import android.content.Context;
import com.ss.android.ugc.aweme.creation.config.DMUploadImageResult;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.template.card.VideoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.ResolutionComponent;
import com.ss.android.ugc.aweme.im.message.template.component.VideoCardFallbackInfoComponent;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public interface IMCameraBridgeApi {
    public static final C461620I8i LIZ = C461620I8i.LIZ;

    void LIZ(C869590Y9l c869590Y9l);

    boolean LIZIZ(C869590Y9l c869590Y9l);

    String LIZJ(C869590Y9l c869590Y9l);

    String LIZLLL(boolean z);

    ResolutionComponent LJ(C869590Y9l c869590Y9l, String str);

    void LJFF(C0Y3I c0y3i, C869590Y9l c869590Y9l);

    InterfaceC456840Hvm LJI();

    InterfaceC1331800klG LJII(int i);

    String LJIIIIZZ(C869590Y9l c869590Y9l);

    void LJIIIZ(String str);

    String LJIIJ(C869590Y9l c869590Y9l);

    List<String> LJIIJJI(C869590Y9l c869590Y9l, String str);

    VideoCardFallbackInfoComponent LJIIL(C869590Y9l c869590Y9l, VideoCardTemplate videoCardTemplate);

    Aweme LJIILIIL(C869590Y9l c869590Y9l, Boolean bool);

    Aweme LJIILJJIL(C869590Y9l c869590Y9l);

    void LJIILL(String str, String str2, String str3, String str4, Double d);

    boolean LJIILLIIL(String str, String str2);

    void LJIIZILJ(Context context, String str, String str2);

    Aweme LJIJ(C869590Y9l c869590Y9l, Boolean bool);

    boolean LJIJI(String str);

    void LJIJJ(Aweme aweme);

    void LJIJJLI();

    void LJIL();

    void LJJ();

    boolean LJJI(C869590Y9l c869590Y9l, boolean z);

    void LJJIFFI();

    C0ZSW LJJII(C869590Y9l c869590Y9l);

    Object LJJIII(InterfaceC1364105Vn interfaceC1364105Vn);

    void LJJIIJ(C869590Y9l c869590Y9l);

    Object LJJIIJZLJL(Context context, String str, C15597068t c15597068t);

    Object LJJIIZ(String str, InterfaceC1364105Vn<? super C189200o6<DMUploadImageResult>> interfaceC1364105Vn);

    void LJJIIZI(String str);

    boolean LJJIJ(String str);

    boolean LJJIJIIJI(C869590Y9l c869590Y9l);

    void LJJIJIIJIL();

    void LJJIJIL();

    List<String> LJJIJL(String str, List<String> list, List<String> list2, List<String> list3);
}
