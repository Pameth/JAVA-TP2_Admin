package sn.isi.service;

import sn.isi.entities.User;

public interface IUser {
    User user = new User();

    public User saisie();
    public void afficher(User u);
}
