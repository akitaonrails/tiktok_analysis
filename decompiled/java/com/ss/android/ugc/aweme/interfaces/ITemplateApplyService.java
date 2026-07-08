package com.ss.android.ugc.aweme.interfaces;

import X.C0E4S;
import X.C0E4T;
import X.C0E4V;
import X.C0E4Y;
import X.C1412390mrF;
import X.C389400FOo;
import X.EnumC1412640mre;
import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ITemplateApplyService {
    public static final C0E4Y LIZ = C0E4Y.LIZ;

    List<C0E4S> LIZ(NLETemplateModel nLETemplateModel, List<C0E4S> list, C1412390mrF c1412390mrF, EnumC1412640mre enumC1412640mre, Context context, C0E4V c0e4v, boolean z, boolean z2, boolean z3);

    C0E4T LIZIZ(Context context, NLEModel nLEModel, VideoPublishEditModel videoPublishEditModel, C389400FOo c389400FOo, CreativeModel creativeModel);

    VideoPublishEditModel LIZJ(Context context, NLEModel nLEModel, boolean z, C389400FOo c389400FOo, CreativeModel creativeModel);
}
