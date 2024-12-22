package com.cursojava.curso.dao;


import com.cursojava.curso.Models.Usuario;

import java.util.List;

public interface UsuarioDao {

    public List<Usuario> getUsuarios();

    public  void eliminar(Long id);

    void registrar(Usuario usuario);



    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);
}
