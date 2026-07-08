package com.ss.android.ugc.aweme.commentv2.commentlist.ui;

import X.C1343080l3S;
import X.C20600815jK;
import X.EnumC1235690iGF;
import X.EnumC1341670l1B;
import X.EnumC1342450l2R;
import X.InterfaceC1891350zJl;
import android.view.View;
import com.ss.android.ugc.aweme.comment.api.LimitRootAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentListAssemAbility extends LimitRootAbility {
    void B7();

    void CK1();

    void GZ(boolean z);

    void JB0(int i);

    C1343080l3S Ki2();

    void LLJ(int i);

    Map<EnumC1342450l2R, C20600815jK<InterfaceC1891350zJl>> Nk1();

    void Q10();

    void SK0(Comment comment);

    void UP2(boolean z);

    View Va();

    void Wm1();

    List<Comment> XF2();

    void Xt1(Comment comment, boolean z);

    void Zd2(int i);

    void Zy0(View view, int i, EnumC1235690iGF enumC1235690iGF);

    C20600815jK<InterfaceC1891350zJl> ad0();

    void deleteItem(String str);

    String getAid();

    void if1();

    void kd0(CommentContextSource commentContextSource, View view, boolean z, int i, int i2, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03);

    void nV1();

    void onDismiss();

    void p21(int i);

    void q21();

    void qA1(boolean z, boolean z2);

    void scrollToPositionWithOffset(int i, int i2);

    boolean tA1(int i);

    void tq0();

    void wV(float f);

    boolean xn2(Boolean bool);

    void y40(EnumC1342450l2R enumC1342450l2R);

    void yE1(EnumC1341670l1B enumC1341670l1B);

    void yY0();

    void yz2(long j);

    void zE();
}
