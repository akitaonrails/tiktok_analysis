package com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel;

import X.C0HD9;
import X.C1220590hrt;
import X.InterfaceC1342370l2J;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.api.LimitRootAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface ICommentListVMAbility extends LimitRootAbility {
    void AL(Context context, String str);

    void Ak1(String str);

    boolean B9();

    Comment BK(Comment comment);

    void Gj();

    void I71();

    void JT0(String str);

    void K21(InterfaceC1342370l2J interfaceC1342370l2J, Fragment fragment);

    void KD1(C1220590hrt c1220590hrt);

    boolean M62(String str);

    void MS0(Comment comment);

    void MV(List list, boolean z);

    int PD(Comment comment);

    void Qy1(InterfaceC1342370l2J interfaceC1342370l2J, Fragment fragment);

    void Vi1(Comment comment, String str);

    void aV(String str, C0HD9 c0hd9);

    void aX1(Comment comment, String str, Context context, int i, float f, boolean z);

    void cE1(String str, boolean z);

    void f70();

    int fg2(String str);

    boolean isLoading();

    void qI0();

    void qZ0(String str);
}
