package com.ss.android.ugc.aweme.im.repo;

import X.AnonymousClass0693;
import com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository;

/* JADX INFO: loaded from: classes3.dex */
public final class ChatRequestRepositoryFactory implements IChatRequestRepository.RepositoryFactory {
    @Override // com.ss.android.ugc.aweme.im.chatroom.api.repo.IChatRequestRepository.RepositoryFactory
    public final AnonymousClass0693 create() {
        return AnonymousClass0693.LIZJ.getValue();
    }
}
