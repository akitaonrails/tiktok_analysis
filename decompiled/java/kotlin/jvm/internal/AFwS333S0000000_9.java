package kotlin.jvm.internal;

import X.C09AY;
import X.C0DTR;
import X.C0OO6;
import X.C0OSF;
import X.C0OWM;
import X.C12ES;
import X.C631370Opb;
import X.C632090Oql;
import X.C786410Ut5;
import X.EnumC631410Opf;
import X.InterfaceC1631620sYq;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.MusicCellShootAssem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public class AFwS333S0000000_9 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(6);
    public final int $t;

    public static AFwS333S0000000_9 get$arr$(int i) {
        AFwS333S0000000_9 aFwS333S0000000_9 = (AFwS333S0000000_9) arr$.get(i);
        if (aFwS333S0000000_9 != null) {
            return aFwS333S0000000_9;
        }
        arr$.compareAndSet(i, null, new AFwS333S0000000_9(i));
        return (AFwS333S0000000_9) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS333S0000000_9(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS333S0000000_9 aFwS333S0000000_9, Object obj, Object obj2, Object obj3) {
        BulletinCommentUIOverview bulletinCommentUIOverviewCopy;
        List<BulletinBaseItem> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (BulletinBaseItem bulletinBaseItem : list) {
                BulletinBaseItem bulletinBaseItemLIZ = C0OO6.LIZ(bulletinBaseItem, false, 0, false, false, false, 0, null, null, 511);
                BulletinCommentUIOverview bulletinCommentUIOverviewLJIILIIL = bulletinBaseItem.LJIILIIL();
                if (bulletinCommentUIOverviewLJIILIIL != null) {
                    bulletinCommentUIOverviewCopy = bulletinCommentUIOverviewLJIILIIL.copy(bulletinCommentUIOverviewLJIILIIL.enableComment, bulletinCommentUIOverviewLJIILIIL.comments, bulletinCommentUIOverviewLJIILIIL.total, bulletinCommentUIOverviewLJIILIIL.version + 1);
                } else {
                    bulletinCommentUIOverviewCopy = null;
                }
                bulletinBaseItemLIZ.LJZ(bulletinCommentUIOverviewCopy);
                arrayList.add(bulletinBaseItemLIZ);
            }
        }
        return arrayList;
    }

    public static final Object invoke$1(AFwS333S0000000_9 aFwS333S0000000_9, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj3 != C0OSF.FULL_SCREEN && obj2 == C0OWM.HIDE) {
            C12ES.LJIILL(0, uIAssem.LJJIJL());
        } else {
            C0DTR.LIZIZ(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS333S0000000_9 aFwS333S0000000_9, Object obj, Object obj2, Object obj3) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj3 != C0OSF.FULL_SCREEN && obj2 == C0OWM.HIDE) {
            C12ES.LJIILL(0, uIAssem.LJJIJL());
        } else {
            C0DTR.LIZIZ(uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AFwS333S0000000_9 aFwS333S0000000_9, Object obj, Object obj2, Object obj3) {
        String musicId;
        MusicModel musicModel;
        MusicCellShootAssem musicCellShootAssem = (MusicCellShootAssem) obj;
        C632090Oql c632090Oql = (C632090Oql) obj2;
        EnumC631410Opf enumC631410Opf = (EnumC631410Opf) obj3;
        if (c632090Oql != null && (musicModel = c632090Oql.getMusicModel()) != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        if (Intrinsics.LJFF(musicId, ((C632090Oql) C631370Opb.LIZ(musicCellShootAssem)).getMusicModel().getMusicId())) {
            musicCellShootAssem.op(enumC631410Opf);
        } else {
            musicCellShootAssem.op(EnumC631410Opf.DEFAULT);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AFwS333S0000000_9 r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
        /*
            com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicSongItemAssem r3 = (com.ss.android.ugc.aweme.inbox.bulletin.assem.sharemusic.BulletinShareMusicSongItemAssem) r3
            X.0OXm r4 = (X.C621040OXm) r4
            X.0OXu r5 = (X.EnumC621120OXu) r5
            r2 = 0
            if (r4 == 0) goto L2b
            com.ss.android.ugc.aweme.music.model.Music r0 = r4.LL
            if (r0 == 0) goto L2b
            java.lang.String r1 = r0.getMid()
            if (r1 == 0) goto L2b
            X.0OXm r0 = r3.LLJZIJLIL
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.LL
            if (r0 == 0) goto L1f
            java.lang.String r2 = r0.getMid()
        L1f:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r2)
            if (r0 == 0) goto L2b
            r3.op(r5)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.0OXu r0 = X.EnumC621120OXu.DEFAULT
            r3.op(r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS333S0000000_9.invoke$4(kotlin.jvm.internal.AFwS333S0000000_9, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(AFwS333S0000000_9 aFwS333S0000000_9, Object obj, Object obj2, Object obj3) {
        TextView textView;
        String text;
        UIAssem uIAssem = (UIAssem) obj;
        AddYoursTopic addYoursTopic = (AddYoursTopic) obj2;
        float fFloatValue = ((Number) obj3).floatValue();
        View viewLJJIJL = uIAssem.LJJIJL();
        TuxTextView tuxTextView = null;
        if (viewLJJIJL != null) {
            textView = (TextView) viewLJJIJL.findViewById(R.id.y3f);
        } else {
            textView = null;
        }
        if (addYoursTopic != null) {
            text = addYoursTopic.getText();
        } else {
            text = null;
        }
        textView.setText(text);
        View viewLJJIJL2 = uIAssem.LJJIJL();
        if (viewLJJIJL2 != null) {
            tuxTextView = (TuxTextView) viewLJJIJL2.findViewById(R.id.y3f);
        }
        C786410Ut5.B5(tuxTextView, fFloatValue);
        return Unit.LIZ;
    }
}
