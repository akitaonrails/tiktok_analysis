package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.C09CT;
import X.C0OK6;
import X.C13BV;
import X.C2097608Jq;
import X.C786410Ut5;
import X.EnumC438640HHy;
import X.EnumC618810OOx;
import X.InterfaceC1891350zJl;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinStyleStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinVoiceItem extends BulletinBaseItem {
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final long LLJI;
    public final String LLJIJIL;
    public final List<Float> LLJILJIL;
    public final transient EnumC438640HHy LLJILJILJ;
    public final transient boolean LLJILLL;
    public int LLJJ;
    public final boolean LLJJI;
    public final Long LLJJIII;
    public final Long LLJJIJI;
    public final int LLJJIJIIJIL;
    public final Map<String, String> LLJJIJIL;
    public final boolean LLJJJ;
    public final boolean LLJJJIL;
    public final boolean LLJJJJ;
    public final String LLJJJJJIL;
    public final BulletinStyleStruct LLJJJJLIIL;
    public final int LLJJL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final User LLJL;
    public final boolean LLJLIL;
    public List<BulletinEmojiItem> LLJLILLLLZIIL;
    public int LLJLL;
    public List<InterfaceC1891350zJl> LLJLLIL;
    public final String LLJLLL;
    public final int LLJZ;
    public final BulletinItemBottomStruct LLJZIJLIL;
    public BulletinCommentUIOverview LLL;
    public final String LLLF;

    @C09CT("voiceCreatorTime")
    public final long creatorTime;

    public BulletinVoiceItem() {
        this(null, null, null, null, 0L, null, null, null, false, 0, false, 0L, null, null, 0, null, false, false, false, null, null, 0, 0, null, false, null, 0, null, null, 0, null, null, null, -1, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinVoiceItem)) {
            return false;
        }
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) obj;
        return Intrinsics.LJFF(this.LLILZLL, bulletinVoiceItem.LLILZLL) && Intrinsics.LJFF(this.LLIZ, bulletinVoiceItem.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, bulletinVoiceItem.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, bulletinVoiceItem.LLJ) && this.LLJI == bulletinVoiceItem.LLJI && Intrinsics.LJFF(this.LLJIJIL, bulletinVoiceItem.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, bulletinVoiceItem.LLJILJIL) && this.LLJILJILJ == bulletinVoiceItem.LLJILJILJ && this.LLJILLL == bulletinVoiceItem.LLJILLL && this.LLJJ == bulletinVoiceItem.LLJJ && this.LLJJI == bulletinVoiceItem.LLJJI && this.creatorTime == bulletinVoiceItem.creatorTime && Intrinsics.LJFF(this.LLJJIII, bulletinVoiceItem.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, bulletinVoiceItem.LLJJIJI) && this.LLJJIJIIJIL == bulletinVoiceItem.LLJJIJIIJIL && Intrinsics.LJFF(this.LLJJIJIL, bulletinVoiceItem.LLJJIJIL) && this.LLJJJ == bulletinVoiceItem.LLJJJ && this.LLJJJIL == bulletinVoiceItem.LLJJJIL && this.LLJJJJ == bulletinVoiceItem.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, bulletinVoiceItem.LLJJJJJIL) && Intrinsics.LJFF(this.LLJJJJLIIL, bulletinVoiceItem.LLJJJJLIIL) && this.LLJJL == bulletinVoiceItem.LLJJL && this.LLJJLIIIJLLLLLLLZ == bulletinVoiceItem.LLJJLIIIJLLLLLLLZ && Intrinsics.LJFF(this.LLJL, bulletinVoiceItem.LLJL) && this.LLJLIL == bulletinVoiceItem.LLJLIL && Intrinsics.LJFF(this.LLJLILLLLZIIL, bulletinVoiceItem.LLJLILLLLZIIL) && this.LLJLL == bulletinVoiceItem.LLJLL && Intrinsics.LJFF(this.LLJLLIL, bulletinVoiceItem.LLJLLIL) && Intrinsics.LJFF(this.LLJLLL, bulletinVoiceItem.LLJLLL) && this.LLJZ == bulletinVoiceItem.LLJZ && Intrinsics.LJFF(this.LLJZIJLIL, bulletinVoiceItem.LLJZIJLIL) && Intrinsics.LJFF(this.LLL, bulletinVoiceItem.LLL) && Intrinsics.LJFF(this.LLLF, bulletinVoiceItem.LLLF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((((this.LLILZLL.hashCode() * 31) + this.LLIZ.hashCode()) * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.hashCode()) * 31) + C786410Ut5.Y2(this.LLJI)) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode()) * 31) + this.LLJILJILJ.hashCode()) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + this.LLJJ) * 31) + C786410Ut5.Z2(this.LLJJI)) * 31) + C786410Ut5.Y2(this.creatorTime)) * 31;
        Long l = this.LLJJIII;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LLJJIJI;
        int iHashCode3 = (((((((((((iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJJIJIIJIL) * 31) + this.LLJJIJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJJ)) * 31) + C786410Ut5.Z2(this.LLJJJIL)) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31;
        String str = this.LLJJJJJIL;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BulletinStyleStruct bulletinStyleStruct = this.LLJJJJLIIL;
        int iHashCode5 = (((((iHashCode4 + (bulletinStyleStruct == null ? 0 : bulletinStyleStruct.hashCode())) * 31) + this.LLJJL) * 31) + this.LLJJLIIIJLLLLLLLZ) * 31;
        User user = this.LLJL;
        int iHashCode6 = (((((((((iHashCode5 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJLIL)) * 31) + this.LLJLILLLLZIIL.hashCode()) * 31) + this.LLJLL) * 31) + this.LLJLLIL.hashCode()) * 31;
        String str2 = this.LLJLLL;
        int iHashCode7 = (((iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.LLJZ) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJZIJLIL;
        int iHashCode8 = (iHashCode7 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        BulletinCommentUIOverview bulletinCommentUIOverview = this.LLL;
        int iHashCode9 = (iHashCode8 + (bulletinCommentUIOverview == null ? 0 : bulletinCommentUIOverview.hashCode())) * 31;
        String str3 = this.LLLF;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinVoiceItem(vid=" + this.LLILZLL + ", audioUrl=" + this.LLIZ + ", backupUrl=" + this.LLIZLLLIL + ", localAudioPath=" + this.LLJ + ", duration=" + this.LLJI + ", format=" + this.LLJIJIL + ", waveform=" + this.LLJILJIL + ", playState=" + this.LLJILJILJ + ", isPlayed=" + this.LLJILLL + ", viewCount=" + this.LLJJ + ", hasSend=" + this.LLJJI + ", creatorTime=" + this.creatorTime + ", updateTime=" + this.LLJJIII + ", id=" + this.LLJJIJI + ", status=" + this.LLJJIJIIJIL + ", eventMap=" + this.LLJJIJIL + ", isFirstInSequence=" + this.LLJJJ + ", isLastInSequence=" + this.LLJJJIL + ", needShowViewCount=" + this.LLJJJJ + ", styleId=" + this.LLJJJJJIL + ", bulletinStyleStruct=" + this.LLJJJJLIIL + ", groupMaxViewCount=" + this.LLJJL + ", paddingBottom=" + this.LLJJLIIIJLLLLLLLZ + ", publishUser=" + this.LLJL + ", hasRead=" + this.LLJLIL + ", emojiList=" + this.LLJLILLLLZIIL + ", emojiOrderNum=" + this.LLJLL + ", emojiSnapshot=" + this.LLJLLIL + ", publishFrom=" + this.LLJLLL + ", statusCode=" + this.LLJZ + ", bottomStruct=" + this.LLJZIJLIL + ", commentUIOverView=" + this.LLL + ", publishExtra=" + this.LLLF + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJZIJLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinStyleStruct LJ() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinCommentUIOverview LJIILIIL() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.creatorTime;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJLILLLLZIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJLLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLZIJ() {
        return this.LLJZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJL() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJLIIIJ() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (!(bulletinBaseItem instanceof BulletinVoiceItem)) {
            return false;
        }
        BulletinVoiceItem bulletinVoiceItem = (BulletinVoiceItem) bulletinBaseItem;
        if (Intrinsics.LJFF(this.LLILZLL, bulletinVoiceItem.LLILZLL) && Intrinsics.LJFF(this.LLIZ, bulletinVoiceItem.LLIZ) && Intrinsics.LJFF(this.LLJ, bulletinVoiceItem.LLJ) && this.LLJI == bulletinVoiceItem.LLJI) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZ(BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.LLL = bulletinCommentUIOverview;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJLILLLLZIIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJLL = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJLLIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLJJ = i;
    }

    public static BulletinVoiceItem LLIIIL(BulletinVoiceItem bulletinVoiceItem, String str, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, List list, String str2, int i3, int i4) {
        String str3;
        String str4;
        String str5;
        long j;
        String str6;
        List<Float> list2;
        EnumC438640HHy enumC438640HHy;
        boolean z5;
        int i5;
        Long l;
        Long l2;
        int i6;
        Map<String, String> map;
        String str7;
        BulletinStyleStruct bulletinStyleStruct;
        User user;
        boolean z6;
        int i7;
        List<InterfaceC1891350zJl> list3;
        BulletinItemBottomStruct bulletinItemBottomStruct;
        BulletinCommentUIOverview bulletinCommentUIOverview;
        List list4 = list;
        int i8 = i;
        int i9 = i3;
        boolean z7 = z4;
        String str8 = str2;
        boolean z8 = z3;
        boolean z9 = z2;
        int i10 = i2;
        boolean z10 = z;
        String str9 = str;
        if ((i4 & 1) != 0) {
            str9 = bulletinVoiceItem.LLILZLL;
        }
        if ((i4 & 2) != 0) {
            str3 = bulletinVoiceItem.LLIZ;
        } else {
            str3 = null;
        }
        if ((i4 & 4) != 0) {
            str4 = bulletinVoiceItem.LLIZLLLIL;
        } else {
            str4 = null;
        }
        if ((i4 & 8) != 0) {
            str5 = bulletinVoiceItem.LLJ;
        } else {
            str5 = null;
        }
        long j2 = 0;
        if ((i4 & 16) != 0) {
            j = bulletinVoiceItem.LLJI;
        } else {
            j = 0;
        }
        if ((i4 & 32) != 0) {
            str6 = bulletinVoiceItem.LLJIJIL;
        } else {
            str6 = null;
        }
        if ((i4 & 64) != 0) {
            list2 = bulletinVoiceItem.LLJILJIL;
        } else {
            list2 = null;
        }
        if ((i4 & 128) != 0) {
            enumC438640HHy = bulletinVoiceItem.LLJILJILJ;
        } else {
            enumC438640HHy = null;
        }
        if ((i4 & 256) != 0) {
            z5 = bulletinVoiceItem.LLJILLL;
        } else {
            z5 = false;
        }
        if ((i4 & 512) != 0) {
            i5 = bulletinVoiceItem.LLJJ;
        } else {
            i5 = 0;
        }
        if ((i4 & 1024) != 0) {
            z10 = bulletinVoiceItem.LLJJI;
        }
        if ((i4 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            j2 = bulletinVoiceItem.creatorTime;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            l = bulletinVoiceItem.LLJJIII;
        } else {
            l = null;
        }
        if ((i4 & 8192) != 0) {
            l2 = bulletinVoiceItem.LLJJIJI;
        } else {
            l2 = null;
        }
        if ((i4 & 16384) != 0) {
            i6 = bulletinVoiceItem.LLJJIJIIJIL;
        } else {
            i6 = 0;
        }
        if ((32768 & i4) != 0) {
            map = bulletinVoiceItem.LLJJIJIL;
        } else {
            map = null;
        }
        if ((65536 & i4) != 0) {
            z9 = bulletinVoiceItem.LLJJJ;
        }
        if ((131072 & i4) != 0) {
            z8 = bulletinVoiceItem.LLJJJIL;
        }
        if ((262144 & i4) != 0) {
            z7 = bulletinVoiceItem.LLJJJJ;
        }
        if ((524288 & i4) != 0) {
            str7 = bulletinVoiceItem.LLJJJJJIL;
        } else {
            str7 = null;
        }
        if ((1048576 & i4) != 0) {
            bulletinStyleStruct = bulletinVoiceItem.LLJJJJLIIL;
        } else {
            bulletinStyleStruct = null;
        }
        if ((2097152 & i4) != 0) {
            i8 = bulletinVoiceItem.LLJJL;
        }
        if ((4194304 & i4) != 0) {
            i10 = bulletinVoiceItem.LLJJLIIIJLLLLLLLZ;
        }
        if ((8388608 & i4) != 0) {
            user = bulletinVoiceItem.LLJL;
        } else {
            user = null;
        }
        if ((16777216 & i4) != 0) {
            z6 = bulletinVoiceItem.LLJLIL;
        } else {
            z6 = false;
        }
        if ((33554432 & i4) != 0) {
            list4 = bulletinVoiceItem.LLJLILLLLZIIL;
        }
        if ((67108864 & i4) != 0) {
            i7 = bulletinVoiceItem.LLJLL;
        } else {
            i7 = 0;
        }
        if ((134217728 & i4) != 0) {
            list3 = bulletinVoiceItem.LLJLLIL;
        } else {
            list3 = null;
        }
        if ((268435456 & i4) != 0) {
            str8 = bulletinVoiceItem.LLJLLL;
        }
        if ((536870912 & i4) != 0) {
            i9 = bulletinVoiceItem.LLJZ;
        }
        if ((1073741824 & i4) != 0) {
            bulletinItemBottomStruct = bulletinVoiceItem.LLJZIJLIL;
        } else {
            bulletinItemBottomStruct = null;
        }
        if ((i4 & Integer.MIN_VALUE) != 0) {
            bulletinCommentUIOverview = bulletinVoiceItem.LLL;
        } else {
            bulletinCommentUIOverview = null;
        }
        String str10 = bulletinVoiceItem.LLLF;
        bulletinVoiceItem.getClass();
        return new BulletinVoiceItem(str9, str3, str4, str5, j, str6, list2, enumC438640HHy, z5, i5, z10, j2, l, l2, i6, map, z9, z8, z7, str7, bulletinStyleStruct, i8, i10, user, z6, list4, i7, list3, str8, i9, bulletinItemBottomStruct, bulletinCommentUIOverview, str10);
    }

    public BulletinVoiceItem(String str, String str2, String str3, String str4, long j, String str5, List<Float> list, EnumC438640HHy enumC438640HHy, boolean z, int i, boolean z2, long j2, Long l, Long l2, int i2, Map<String, String> map, boolean z3, boolean z4, boolean z5, String str6, BulletinStyleStruct bulletinStyleStruct, int i3, int i4, User user, boolean z6, List<BulletinEmojiItem> list2, int i5, List<InterfaceC1891350zJl> list3, String str7, int i6, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentUIOverview bulletinCommentUIOverview, String str8) {
        super(EnumC618810OOx.VOICE, C0OK6.CONTENT, i, z2, j2, l, l2, str6, bulletinStyleStruct, i2, map, z3, z4, false, 0, i4, user, z6, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str7, 0, null, null, null);
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = j;
        this.LLJIJIL = str5;
        this.LLJILJIL = list;
        this.LLJILJILJ = enumC438640HHy;
        this.LLJILLL = z;
        this.LLJJ = i;
        this.LLJJI = z2;
        this.creatorTime = j2;
        this.LLJJIII = l;
        this.LLJJIJI = l2;
        this.LLJJIJIIJIL = i2;
        this.LLJJIJIL = map;
        this.LLJJJ = z3;
        this.LLJJJIL = z4;
        this.LLJJJJ = z5;
        this.LLJJJJJIL = str6;
        this.LLJJJJLIIL = bulletinStyleStruct;
        this.LLJJL = i3;
        this.LLJJLIIIJLLLLLLLZ = i4;
        this.LLJL = user;
        this.LLJLIL = z6;
        this.LLJLILLLLZIIL = list2;
        this.LLJLL = i5;
        this.LLJLLIL = list3;
        this.LLJLLL = str7;
        this.LLJZ = i6;
        this.LLJZIJLIL = bulletinItemBottomStruct;
        this.LLL = bulletinCommentUIOverview;
        this.LLLF = str8;
    }

    public BulletinVoiceItem(String str, String str2, String str3, String str4, long j, String str5, List list, EnumC438640HHy enumC438640HHy, boolean z, int i, boolean z2, long j2, Long l, Long l2, int i2, Map map, boolean z3, boolean z4, boolean z5, String str6, BulletinStyleStruct bulletinStyleStruct, int i3, int i4, User user, boolean z6, List list2, int i5, List list3, String str7, int i6, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentUIOverview bulletinCommentUIOverview, String str8, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) == 0 ? str4 : "", (i7 & 16) != 0 ? 0L : j, (i7 & 32) != 0 ? "m4a" : str5, (i7 & 64) != 0 ? C13BV.INSTANCE : list, (i7 & 128) != 0 ? EnumC438640HHy.IDLE : enumC438640HHy, (i7 & 256) != 0 ? false : z, (i7 & 512) != 0 ? 0 : i, (i7 & 1024) != 0 ? true : z2, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 0L : j2, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : l, (i7 & 8192) != 0 ? null : l2, (i7 & 16384) != 0 ? 0 : i2, (32768 & i7) != 0 ? C2097608Jq.LJ() : map, (65536 & i7) != 0 ? false : z3, (131072 & i7) != 0 ? false : z4, (262144 & i7) != 0 ? false : z5, (524288 & i7) != 0 ? null : str6, (1048576 & i7) != 0 ? null : bulletinStyleStruct, (2097152 & i7) != 0 ? 0 : i3, (4194304 & i7) != 0 ? 0 : i4, (8388608 & i7) != 0 ? null : user, (16777216 & i7) != 0 ? false : z6, (33554432 & i7) != 0 ? new ArrayList() : list2, (67108864 & i7) != 0 ? 0 : i5, (134217728 & i7) != 0 ? new ArrayList() : list3, (268435456 & i7) != 0 ? null : str7, (536870912 & i7) != 0 ? 0 : i6, (1073741824 & i7) != 0 ? null : bulletinItemBottomStruct, (i7 & Integer.MIN_VALUE) != 0 ? null : bulletinCommentUIOverview, (i8 & 1) == 0 ? str8 : null);
    }
}
