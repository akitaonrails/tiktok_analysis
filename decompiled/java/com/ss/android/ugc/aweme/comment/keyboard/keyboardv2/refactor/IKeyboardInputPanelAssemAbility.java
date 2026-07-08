package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C454010HrD;
import X.C454040HrG;
import X.C454060HrI;
import X.InterfaceC494301wD;
import android.view.KeyEvent;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public interface IKeyboardInputPanelAssemAbility extends InterfaceC494301wD {
    void C52();

    void Cj(C454040HrG c454040HrG);

    void HE(TuxIconView tuxIconView);

    void Hp(String str);

    void IN1(CharSequence charSequence, List<CommentImageModel> list, CommentStickerStruct commentStickerStruct, List<AudioCommentModel> list2);

    void Ii1();

    void N2();

    void N4();

    void OY0(List<AudioCommentModel> list);

    void Om0(CommentStickerStruct commentStickerStruct, String str, Integer num);

    void Zf0();

    void fE1();

    void g7(C454060HrI c454060HrI);

    void lc(C454010HrD c454010HrD);

    void m62(int i);

    boolean mI();

    void w92();

    void wW0();

    void wm2();

    void xk0(List<CommentImageModel> list);

    void yd(KeyEvent keyEvent);
}
